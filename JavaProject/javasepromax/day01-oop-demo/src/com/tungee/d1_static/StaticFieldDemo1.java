package com.tungee.d1_static;

public class StaticFieldDemo1 {
    public static void main(String[] args) {
        // 目标：理解static修饰成员变量的作用和访问特点
        // 1、类名.静态成员变量（访问静态成员变量的推荐方式）
        System.out.println(User.onlineNumber);

        User user = new User();
        user.onlineNumber ++;   // 新来了一个人（不推荐这种方式来访问）
        System.out.println(user.onlineNumber);
    }
}
