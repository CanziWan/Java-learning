package com.tungee.thisdemo;

public class Car {
    String name;
    double price;

    /*
        无参数构造器
     */
    public Car() {
        System.out.println("这是无参数构造器中的this：" + this);
    }

    /*
        有参数构造器
     */
    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void goWith(String name) {
        System.out.println(this.name + "正在和" + name + "比赛！");
    }

    public void run() {
        System.out.println("这是方法中的this：" + this);
    }
}
