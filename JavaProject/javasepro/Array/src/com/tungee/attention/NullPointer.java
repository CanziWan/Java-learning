package com.tungee.attention;

public class NullPointer {
    public static void main(String[] args) {
        int[] arr = null;
        System.out.println(arr);  // null
        System.out.println(arr.length);  // 出现空指针异常：NullPointerException
    }
}
