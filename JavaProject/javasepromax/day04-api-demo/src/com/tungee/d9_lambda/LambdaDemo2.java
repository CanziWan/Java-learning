package com.tungee.d9_lambda;

import java.util.ArrayList;

public class LambdaDemo2 {
    public static void main(String[] args) {
        // 目标：学会使用Lambda的标准格式简化匿名内部类的代码形式
        // Lambda只能简化接口中只有一个抽象方法的匿名内部类形式
//        Swimming s1 = new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("teacher is swimming!");
//            }
//        };

//        Swimming s1 = () -> {
//            System.out.println("teacher is swimming!");
//        };

        Swimming s1 = () -> System.out.println("teacher is swimming!");
        go(s1);

        System.out.println("-------------------------");

//        go(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("student is swimming!");
//            }
//        });

//        go(() -> {
//            System.out.println("student is swimming!");
//        });

        go(() -> System.out.println("student is swimming!"));
    }

    public static void go(Swimming s) {
        System.out.println("begin ...");
        s.swim();
        System.out.println("end ...");
    }
}

@FunctionalInterface // 一旦加上这个注解必须是函数式接口，里面只能有一个抽象方法
interface Swimming {
    void swim();
}