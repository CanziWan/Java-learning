package com.tungee.d7_extends_feature;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承的特点
        // 1、子类不能继承父类的构造器
        // 2、子类是否可以继承父类的私有成员？（有争议）  认为可以访问，只是不能直接访问
        Tiger t = new Tiger();
        // t.eat();
        Animal animal = new Animal();
        // animal.eat();
        // 3、子类是否可以继承父类的静态成员？（有争议）  认为不是继承，只是共享的
        System.out.println(Tiger.location);
    }
}

class Animal {
    private void eat() {
        System.out.println("动物吃东西");
    }

    public static String location = "长隆";
}

class Tiger extends Animal {

}