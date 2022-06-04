package com.tungee.demo;

public class Test3 {
    public static void main(String[] args) {
        // 需求：使用方法，支持找出任意整型数组的最大值返回
        int[] arr = {1, 2, 3, 5, 7, 9, 38};
        int max = getArrayMaxData(arr);
        System.out.println(max);
    }

    public static int getArrayMaxData(int[] arr) {
        // 找出数组的最大值返回
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
