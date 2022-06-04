package com.tungee.d9_exception_custom;
/*
    目标：学习自定义异常类
    需求：认为年龄小于0岁，大于200岁就是一个异常
 */
public class ExceptionDemo {
    public static void main(String[] args) {
//        try {
//            checkAge(-34);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            checkAge2(-30);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void checkAge2(int age) {
        if (age < 0 || age > 200) {
            // 抛出去一个异常对象给调用者
            // throw: 在方法内部直接创建一个异常对象，并从此点抛出
            // throws: 用在方法声明上的，抛出方法内部的异常
            throw new TungeeAgeIlleagalRuntimeException(age + " is illeagal!");
        }else {
            System.out.println("年龄合法：推荐商品给其购买");
        }
    }


    public static void checkAge(int age) throws TungeeAgeIlleagalException {
        if (age < 0 || age > 200) {
            // 抛出去一个异常对象给调用者
            // throw: 在方法内部直接创建一个异常对象，并从此点抛出
            // throws: 用在方法声明上的，抛出方法内部的异常
            throw new TungeeAgeIlleagalException(age + " is illeagal!");
        }else {
            System.out.println("年龄合法：推荐商品给其购买");
        }
    }
}
