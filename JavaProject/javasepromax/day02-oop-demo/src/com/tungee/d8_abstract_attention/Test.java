package com.tungee.d8_abstract_attention;

public class Test {
    public static void main(String[] args) {
        // 目标：理解抽象类的特征和注意事项
        // 1、类有的东西，抽象类都有
        // 2、抽象类中可以没有抽象方法，但是有抽象方法的必须是抽象类
        // 3、一个类继承了抽象类，必须重写完抽象类的全部抽象方法，否则这个类也必须定义成抽象类

        // 4、抽象类不能创建对象(抽象类不能被实例化)，为什么？
        // 反证法：假如抽象类可以创建对象
        // Animal animal = new Animal();
        // animal.run();    // run方法连方法体都没有！因此抽象类不能创建对象

        // Card card = new Card(); // 不行的，抽象类不能创建对象（这个观点不能动摇）
    }
}

abstract class Card {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

abstract class Cat extends Animal {

    @Override
    public void run() {

    }

//    @Override
//    public void eat() {
//
//    }
}

abstract class Animal {
    public abstract void run();
    public abstract void eat();
}
