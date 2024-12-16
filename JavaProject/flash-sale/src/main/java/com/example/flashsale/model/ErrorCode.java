package com.example.flashsale.model;

/**
 * 定义全局错误代码枚举，用于标识不同的业务错误
 */
public enum ErrorCode {
    SUCCESS("200", "购买成功！"),
    USER_NOT_FOUND("E001", "用户不存在！"),
    PRODUCT_NOT_FOUND("E002", "购买商品不存在！"),
    INVALID_QUANTITY("E003", "购买商品的数量不合法！"),
    INSUFFICIENT_FUNDS("E004", "余额不足！"),
    OUT_OF_STOCK("E005", "商品数量不足！"),
    LOCK_FAILED("E006", "Failed to acquire lock"),
    LOCK_INTERRUPTED("E007", "Lock interrupted"),
    UNKNOWN_ERROR("E999", "Unknown error");

    private final String code; // 错误代码
    private final String message; // 错误描述

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
