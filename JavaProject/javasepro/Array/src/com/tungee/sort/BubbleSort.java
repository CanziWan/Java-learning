package com.tungee.sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 1};
        //           0  1  2  3

        // 定义一个循环，控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            // i == 0   比较的次数为 3   j = 0 1 2
            // i == 1   比较的次数为 2   j = 0 1
            // i == 2   比较的次数为 1   j = 0
            // 定义一个循环，控制每轮比较的次数，占位
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 判断j当前位置的元素值 是否 大于后一个位置 若较大 则交换
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("冒泡排序得到的结果：");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
