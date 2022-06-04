package com.tungee.d9_exception_custom;
/*
    自定义的运行时异常
        1、继承RuntimeException
        2、重写构造器
 */
public class TungeeAgeIlleagalRuntimeException extends RuntimeException{
    public TungeeAgeIlleagalRuntimeException() {
    }

    public TungeeAgeIlleagalRuntimeException(String message) {
        super(message);
    }
}
