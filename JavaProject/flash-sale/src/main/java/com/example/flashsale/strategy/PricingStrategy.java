package com.example.flashsale.strategy;

import com.example.flashsale.model.Product;
import com.example.flashsale.model.User;

/**
 * 定义价格计算策略接口，支持多种定价规则
 */
public interface PricingStrategy {
    double calculatePrice(User user, Product product, int quantity);
}

