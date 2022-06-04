package com.tungee.constructor;
/*
    定义一个汽车类
 */
public class Car {
    String name;
    double price;

    /*
        无参数构造器
     */
    public Car() {
        System.out.println("无参数构造器！");
    }

    /*
        有参数构造器
     */
    public Car(String n, double p) {
        System.out.println("有参数构造器！");
        name = n;
        price = p;
    }
}
