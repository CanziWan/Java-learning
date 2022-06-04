package com.tungee.createobject;
/*
    目标：学会设计对象并使用。
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建汽车对象
        Car c1 = new Car();
        c1.name = "宝马";
        c1.price = 38.9;
        System.out.println(c1.name);
        System.out.println(c1.price);
        c1.start();
        c1.run();

        System.out.println("----------------------------");

        Car c2 = new Car();
        c2.name = "奔驰";
        c2.price = 40;
        System.out.println(c2.name);
        System.out.println(c2.price);
        c2.start();
        c2.run();

    }
}
