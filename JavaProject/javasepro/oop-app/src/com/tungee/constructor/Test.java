package com.tungee.constructor;

public class Test {
    public static void main(String[] args) {
        // 通过调用构造器得到对象
        Car c = new Car();
        c.name = "宝马";
        c.price = 30.9;
        System.out.println(c.name);
        System.out.println(c.price);

        // 调用有参数构造器
        Car c2 = new Car("奔驰", 40.9);
        System.out.println(c2.name);
        System.out.println(c2.price);
    }
}
