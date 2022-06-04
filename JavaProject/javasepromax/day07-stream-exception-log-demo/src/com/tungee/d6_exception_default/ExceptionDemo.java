package com.tungee.d6_exception_default;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("------------ begin --------------");
        chu(10, 0);
        System.out.println("------------- end ---------------");
    }

    public static void chu(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int c = a / b;
        System.out.println(c);
    }
}
