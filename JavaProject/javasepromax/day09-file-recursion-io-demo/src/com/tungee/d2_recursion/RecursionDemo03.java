package com.tungee.d2_recursion;
/*
    目标：求 1 - n 的和
 */
public class RecursionDemo03 {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }else {
            return sum(n - 1) + n;
        }
    }
}
