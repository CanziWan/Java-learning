package com.example.flashsale.model;

import lombok.Data;

/**
 * 用户实体类
 */
@Data
public class User {
    private int id; // 用户 ID
    private String name; // 用户名
    private double balance; // 用户余额
    private int userType; // 用户类型（0=普通用户, 1=VIP, 2=SVIP）

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }
}
