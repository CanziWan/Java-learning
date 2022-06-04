package com.tungee.thisdemo;
/*
    目标：理解this关键字的作用
 */
public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();

        System.out.println(c);

        System.out.println("----------------------------");

        Car c2 = new Car("宝马", 39.8);
        System.out.println(c2.name);
        System.out.println(c2.price);

        c2.goWith("奔驰");
    }
}
