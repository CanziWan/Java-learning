package com.tungee.javabean;
/*
    目标：记住JavaBean的书写要求
 */
public class Test {
    public static void main(String[] args) {
        // 1、无参数构造器创建对象封装一个用户信息
        User u1 = new User();
        u1.setName("hello");
        u1.setHeight(176.0);
        u1.setSalary(20000);
        System.out.println(u1.getName());
        System.out.println(u1.getHeight());
        System.out.println(u1.getSalary());

        // 2、有参数构造器创建对象封装一个用户信息
        User u2 = new User("hello", 176.0, 20000);
        System.out.println(u2.getName());
        System.out.println(u2.getHeight());
        System.out.println(u2.getSalary());
    }
}
