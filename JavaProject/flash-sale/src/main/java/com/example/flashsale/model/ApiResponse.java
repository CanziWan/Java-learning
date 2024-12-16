package com.example.flashsale.model;

import lombok.Data;

/**
 * 定义统一的 API 响应格式
 */
@Data
public class ApiResponse {
    private String code;
    private String message;
    private String data;

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getData() {
        return this.data;
    }

    // 明确的全参数构造器
    public ApiResponse(String code, String message, String data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 默认构造器
    public ApiResponse() {
    }
}