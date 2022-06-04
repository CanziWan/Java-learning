package com.tungee.d1_polymorphic;
/*
    目标：认识多态，理解多态的形式和概念
 */
public class Test {
    public static void main(String[] args) {
        // 1、多态的形式： 父类类型 对象名称 = new 子类构造器;
        Animal a = new Dog();
        a.run();    // 方法调用：编译看左边，运行看右边
        System.out.println(a.name); // 变量调用：编译看左边，运行看左边

        // a.lookDoor();   // 3、多态的缺点：多态下不能访问子类独有的功能
        ((Dog) a).lookDoor();   // 4、解决多态的缺点：多态下引用数据类型的类型转换（强制类型转换：从父到子）

        Animal a2 = new Tortoise();
        a2.run();   // 方法调用：编译看左边，运行看右边
        System.out.println(a2.name);   // 变量调用：编译看左边，运行看左边

        go(a);
        go(a2);
    }

    // 2、多态的优势
    /*
        要求：所有的动物都可以进来比赛
     */
    public static void go(Animal a) {
        System.out.println("---------------");
        System.out.println("begin ...");
        a.run();
        System.out.println("end ...");
        System.out.println("---------------");
    }
}
