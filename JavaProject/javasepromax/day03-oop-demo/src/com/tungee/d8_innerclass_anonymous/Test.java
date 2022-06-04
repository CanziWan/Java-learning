package com.tungee.d8_innerclass_anonymous;
/*
    目标：学习匿名内部类的形式和特点
 */
public class Test {
    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void run() {
                System.out.println("Tiger run!");
            }
        };
        a.run();
    }
}

//class Tiger extends Animal {
//    @Override
//    public void run() {
//        System.out.println("Tiger run!");
//    }
//}

abstract class Animal {
    public abstract void run();
}
