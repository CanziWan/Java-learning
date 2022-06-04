package com.tungee.create;

public class MethodDemo3 {
    public static void main(String[] args) {
        // 目标：学习方法定义的其它形式，并理解其流程
        print();
        System.out.println("------------");
        print();
    }

    /**
     *  无参数无返回值的方法
     */
    public static void print() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello!");
        }
    }

}
