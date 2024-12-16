package com.example.flashsale.exception;

import com.example.flashsale.model.ErrorCode;

/**
 * 自定义业务异常，封装错误代码和描述信息
 */
public class BusinessException extends RuntimeException {
    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
