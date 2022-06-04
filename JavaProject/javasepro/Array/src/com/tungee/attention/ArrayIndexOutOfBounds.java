package com.tungee.attention;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);   // 出现数组索引越界异常：ArrayIndexOutOfBoundsException
        System.out.println("程序结束！");
    }
}
