package com.tungee.d2_static_util;

public class TestDemo2 {
    public static void main(String[] args) {
        int[] arr = null;
        int[] arr1 = {};
        int[] arr2 = {12, 23, 44, 55, 90};

        System.out.println(ArraysUtils.toString(arr));
        System.out.println(ArraysUtils.toString(arr1));
        System.out.println(ArraysUtils.toString(arr2));
    }
}
