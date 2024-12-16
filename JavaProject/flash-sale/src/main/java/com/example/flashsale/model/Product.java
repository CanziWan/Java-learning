package com.example.flashsale.model;

import lombok.Data;

/**
 * 商品实体类
 */
@Data
public class Product {
    private int id; // 商品 ID
    private String name; // 商品名称
    private double price; // 商品价格
    private int stock; // 商品库存

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
