package com.tungee.d3_polymorphic_convert;
/*
    目标：学习多态形式下的类型转换机制
 */
public class Test {
    public static void main(String[] args) {
        // 自动类型转换
        Animal a = new Dog();
        a.run();

        // 强制类型转换
        Animal a2 = new Tortoise();
        a2.run();
        Tortoise t = (Tortoise) a2; // 从父类类型到子类类型：必须强制类型转换
        t.layEggs();

        // Dog d = (Dog) a2;   // 强制类型转换，编译阶段不报错（注意：有继承或者实现关系，编译阶段可以强制类型转换），运行时可能出错！
        if (a2 instanceof Tortoise) {
            Tortoise t2 = (Tortoise) a2; // 从父类类型到子类类型：必须强制类型转换
            t2.layEggs();
        }else if (a2 instanceof Dog){
            Dog d = (Dog) a;
            d.lookDoor();
        }

        go(new Dog());
        go(new Tortoise());
    }

    public static void go(Animal a) {
        a.run();
        // a到底是乌龟还是狗
        if (a instanceof Tortoise) {
            Tortoise t = (Tortoise) a; // 从父类类型到子类类型：必须强制类型转换
            t.layEggs();
        }else if (a instanceof Dog){
            Dog d = (Dog) a;
            d.lookDoor();
        }
    }
}
