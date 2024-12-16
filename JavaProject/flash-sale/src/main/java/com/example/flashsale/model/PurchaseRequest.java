package com.example.flashsale.model;

import lombok.Data;

/**
 * 抢购请求实体类
 */
@Data
public class PurchaseRequest {
    private int userId;    // 用户 ID
    private int productId; // 商品 ID
    private int quantity;  // 购买数量

    // 如果未使用 Lombok，请添加以下方法：
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

