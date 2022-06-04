package com.tungee.demo;
/*
    需求：把一个数组中的元素复制到另一个新数组中。
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr1 = {11, 22, 33, 44};
        // int[] arr2 = arr1;   // 没有完成数组的复制
        int[] arr2 = new int[arr1.length];

        copyArray(arr1, arr2);

        printArray(arr1);
        printArray(arr2);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1){
//                System.out.print(arr[i]);
//            }else {
//                System.out.print(arr[i] + ", ");
//            }
            System.out.print(i == arr.length - 1 ? arr[i] : arr[i] + ", ");
        }
        System.out.println("]");
    }

    public static void copyArray(int[] arr1, int[] arr2) {
        // 完成元素的复制
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
    }
}
