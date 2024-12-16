package com.example.flashsale.service;

import com.example.flashsale.exception.BusinessException;
import jakarta.transaction.Transactional;
import com.example.flashsale.mapper.ProductMapper;
import com.example.flashsale.mapper.UserMapper;
import com.example.flashsale.model.ErrorCode;
import com.example.flashsale.model.Product;
import com.example.flashsale.model.PurchaseRequest;
import com.example.flashsale.model.User;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import com.example.flashsale.strategy.PricingStrategy;

import java.util.concurrent.TimeUnit;

@Service
public class PurchaseService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    @Autowired
    private RedissonClient redissonClient;

    @Autowired
    private PricingStrategy pricingStrategy;

    private static final String PRODUCT_STOCK_KEY = "product_stock_"; // Redis 缓存键前缀，用于存储商品库存
    private static final String LOCK_KEY = "lock_product_"; // 分布式锁键前缀，用于控制商品抢购并发

    /**
     * 处理商品抢购逻辑
     * @param request 用户提交的抢购请求
     */
    @Transactional
    public void purchaseItem(PurchaseRequest request) {
        // 从 Redis 或数据库加载商品库存信息
        String lockKey = LOCK_KEY + request.getProductId();
        RLock lock = redissonClient.getLock(lockKey);

        try {
            // 获取分布式锁，避免超卖
            if (lock.tryLock(10, TimeUnit.SECONDS)) {
                // 获取用户信息
                User user = userMapper.getUserById(request.getUserId());
                System.out.println("PurchaseService User Type: " + user.getUserType());
                // 用户不存在
                if (user == null) {
                    throw new BusinessException(ErrorCode.USER_NOT_FOUND);
                }

                // 从 Redis 中获取商品库存信息
                String stockKey = PRODUCT_STOCK_KEY + request.getProductId();
                Integer stock = (Integer) redisTemplate.opsForValue().get(stockKey);
                if (stock == null) {
                    // 如果 Redis 无库存信息，从数据库获取并缓存到 Redis
                    Product product = productMapper.getProductById(request.getProductId());
                    // 购买商品的id不存在
                    if (product == null) {
                        throw new BusinessException(ErrorCode.PRODUCT_NOT_FOUND);
                    }
                    stock = product.getStock();
                    redisTemplate.opsForValue().set(stockKey, stock);
                } else {
                    Product product = productMapper.getProductById(request.getProductId());
                    // 购买商品的id不存在
                    if (product == null) {
                        throw new BusinessException(ErrorCode.PRODUCT_NOT_FOUND);
                    }
                }

                // 购买商品的数量不合法
                if (request.getQuantity() <= 0) {
                    throw new BusinessException(ErrorCode.INVALID_QUANTITY);
                }

                // 检查库存是否足够
                if (stock < request.getQuantity()) {
                    throw new BusinessException(ErrorCode.OUT_OF_STOCK);
                }

                // 使用策略模式计算总价
                Product product = productMapper.getProductById(request.getProductId());
                double totalCost = pricingStrategy.calculatePrice(user, product, request.getQuantity());

                // 检查用户余额是否足够
                if (user.getBalance() < totalCost) {
                    throw new BusinessException(ErrorCode.INSUFFICIENT_FUNDS);
                }

                // 更新用户余额和商品库存
                user.setBalance(user.getBalance() - totalCost);
                stock -= request.getQuantity();

                // 将更新后的库存存入 Redis
                redisTemplate.opsForValue().set(stockKey, stock);

                // 更新数据库中用户和商品信息
                userMapper.updateUserBalance(user);
                product.setStock(stock);
                productMapper.updateProductStock(product);
            } else {
                throw new BusinessException(ErrorCode.LOCK_FAILED);
            }
        } catch (InterruptedException e) {
            throw new BusinessException(ErrorCode.LOCK_INTERRUPTED);
        } finally {
            // 释放分布式锁，防止死锁
            if (lock.isHeldByCurrentThread()) {
                lock.unlock();
            }
        }
    }
}
