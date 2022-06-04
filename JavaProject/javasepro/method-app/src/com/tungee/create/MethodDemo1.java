package com.tungee.create;

public class MethodDemo1 {
    public static void main(String[] args) {
        // 张工
//        int a = 10;
//        int b = 30;
//        int c = a + b;
//        System.out.println(c);
        int a = 10, b = 20;
        int c = sum(a, b);
        System.out.println(c);

        // 徐工
//        int a1 = 10;
//        int b1 = 30;
//        int c1 = a1 + b1;
//        System.out.println(c1);
        int a1 = 10, b1 = 50;
        int c1 = sum(a1, b1);
        System.out.println(c1);
    }

    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }
}
