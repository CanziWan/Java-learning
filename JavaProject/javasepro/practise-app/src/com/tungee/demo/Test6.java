package com.tungee.demo;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        // 需求：数字加密
        // 1、定义一个数组存入需要加密的数据
        Scanner sc = new Scanner(System.in);
        System.out.print("请您输入需要加密的数字的位数：");
        int length = sc.nextInt();
        int[] arr = new int[length];

        // 2、录入需要加密的数字
        for (int i = 0; i < arr.length; i++) {
            System.out.print("请您输入加密的第" + (i + 1) + "个数字：");
            int number = sc.nextInt();
            arr[i] = number;
        }

        // 3、打印数组内容看一下！
        printArray(arr);

        // 4、核心逻辑（对数组中的数据进行加密） arr = [1, 9, 8, 3]
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        // 5、核心逻辑（对数组中加密的数据进行反转，才是最终加密的结果）  arr = [6, 4, 3, 8]
        //                                                                       i        j
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // 直接交换两者的位置的值即可
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i == arr.length - 1 ? arr[i] : (arr[i] + ", "));
        }
        System.out.println("]");
    }
}
