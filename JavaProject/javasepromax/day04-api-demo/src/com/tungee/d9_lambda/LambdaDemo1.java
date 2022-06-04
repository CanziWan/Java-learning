package com.tungee.d9_lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // 目标：学会使用Lambda的标准格式简化匿名内部类的代码形式
        Animal animal = new Animal() {
            @Override
            public void run() {
                System.out.println("run!");
            }
        };
        animal.run();

//        Animal animal1 = () -> {
//            System.out.println("run!");
//        };
//        animal1.run();

    }
}

abstract class Animal {
    public abstract void run();
}
