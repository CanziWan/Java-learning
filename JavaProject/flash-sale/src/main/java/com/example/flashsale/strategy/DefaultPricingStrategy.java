package com.example.flashsale.strategy;

import com.example.flashsale.model.Product;
import com.example.flashsale.model.User;
import org.springframework.stereotype.Component;

/**
 * 价格计算策略，支持用户类型的折扣
 */
@Component
public class DefaultPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(User user, Product product, int quantity) {
        double price = product.getPrice();
        System.out.println("DefaultPricingStrategy User type: " + user.getUserType()); // 打印用户类型日志
        // 根据用户类型计算折扣
        switch (user.getUserType()) {
            case 1: // VIP 用户
                price *= 0.8; // VIP 用户享受 8 折优惠
                break;
            case 2: // SVIP 用户
                price *= 0.7; // SVIP 用户享受 7 折优惠
                break;
            case 0: // 普通用户无折扣
                break;
            default:
                throw new IllegalArgumentException("Invalid user type: " + user.getUserType());
        }

        return price * quantity;
    }
}
