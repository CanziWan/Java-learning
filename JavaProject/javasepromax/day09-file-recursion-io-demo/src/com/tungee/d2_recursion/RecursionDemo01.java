package com.tungee.d2_recursion;
/*
    递归的形式
 */
public class RecursionDemo01 {
    public static void main(String[] args) {
        test2();
    }

    public static void test() {
        System.out.println("========== test begin ==========");
        test(); // 方法递归 直接递归形式  // StackOverflowError
    }

    public static void test2() {
        System.out.println("========== test2 begin ==========");
        test3(); // 方法递归 间接递归形式
    }

    public static void test3() {
        System.out.println("========== test3 begin ==========");
        test2();
    }
}
