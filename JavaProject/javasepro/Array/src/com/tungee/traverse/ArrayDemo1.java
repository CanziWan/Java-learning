package com.tungee.traverse;

import java.util.Random;
import java.util.Scanner;

public class ArrayDemo1 {
    public static void main(String[] args) {

        // 遍历数组
        int[] ages = {20, 30, 40, 50};
        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        System.out.println("-------------------------------------");

        // 数组元素求和
        int[] money = {16, 26, 36, 6, 100};
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum += money[i];
        }
        System.out.println(sum);

        System.out.println("-------------------------------------");

        // 求数组中的最大值
        int[] faceScore = {15, 9000, 10000, 20000, 9500, -5};
        int max = faceScore[0];
        for (int i = 1; i < faceScore.length; i++) {
            if (max < faceScore[i]) {
                max = faceScore[i];
            }
        }
        System.out.println(max);

        System.out.println("-------------------------------------");



        // 猜数字游戏
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        // 产生5个随机数（范围为1 - 20 之间），将其保存在数组nums中
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            // 1 - 20 之间的随机数
            nums[i] = r.nextInt(20) + 1;
        }

        // 用一个死循环，让用户输入要猜测的数字
        int flag = 0;       // flag = 0 表示用户没有猜对
        while (true) {
            System.out.print("请猜测数字（1 - 20 之间的数字）：");
            int guess = sc.nextInt();

            for (int i = 0; i < nums.length; i++) {
                if (guess == nums[i]){
                    System.out.println("恭喜你，猜对了！");
                    System.out.println("该数字在数组中第一次出现在下标为" + i + "的位置上");
                    System.out.println("数组中的5个数字为：");
                    for (int j = 0; j < nums.length; j++) {
                        System.out.print(nums[j] + "\t");
                    }
                    flag = 1;    // flag = 1 表示用户猜对了
                    break;
                }
            }

            if (flag == 1)
                break;

            System.out.println("当前猜测的数字不存在，请重新猜测！");

        }


        System.out.println("\t");
        System.out.println("-------------------------------------");


        // 随机排名
        // 键盘录入5个工号，最终要随机一组出来作为排名
        int[] laborNums = new int[5];
        for (int i = 0; i < laborNums.length; i++) {
            System.out.print("请您输入第" + (i + 1) + "个工号：");
            laborNums[i] = sc.nextInt();
        }

        for (int j = 0; j < laborNums.length; j++) {
            // 生成一个随机数组下标（0 - 4）
            int index = r.nextInt(laborNums.length);
            // 将随机得到的数组下标的工号与当前遍历到的数组下标的工号交换
            int temp = laborNums[j];
            laborNums[j] = laborNums[index];
            laborNums[index] = temp;
        }

        System.out.println("得到的随机工号排名为：");
        for (int k = 0; k < laborNums.length; k++) {
            System.out.print(laborNums[k] + "\t");
        }
        System.out.println(" ");

    }


}

