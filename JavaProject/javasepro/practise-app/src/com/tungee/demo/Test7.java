package com.tungee.demo;

import java.util.Random;
import java.util.Scanner;

/*
    需求：双色球模拟
 */
public class Test7 {
    public static void main(String[] args) {
        // 1、随机6个红色号码（1-33，不能重复），随机一个蓝色号码（1-16），可以采用数组装起来作为中奖号码
        int[] luckyNumbers = createLuckyNumbers();
        // printArray(luckyNumbers);

        // 2、调用一个方法让用户输入7个号码，作为用户选号
        int[] userNumbers = userInputNumbers();
        // printArray(userNumbers);

        // 3、传入2组号码，判断用户中奖情况
        judge(luckyNumbers,userNumbers);
    }

    // 判断用户中奖情况
    public static void judge(int[] luckyNumbers, int[] userNumbers) {
        // 判断是否中奖了
        // luckyNumbers = [12, 23,  8, 16, 15, 32,    9]
        // userNumbers  = [23, 13, 18,  6,  8, 33,   10]

        // 1、定义2个变量分别存储红球命中的个数，以及蓝球命中的个数
        int redHitNumbers = 0;
        int blueHitNumbers = 0;

        // 2、判断红球命中了几个，开始统计
        for (int i = 0; i < userNumbers.length - 1; i++) {
            for (int j = 0; j < luckyNumbers.length - 1; j++) {
                // 每次找到了相等的号码，意味着当前号码命中了
                if (userNumbers[i] == luckyNumbers[j]) {
                    redHitNumbers ++;
                    break;
                }
            }
        }

        // 3、判断蓝球号码是否命中了
        blueHitNumbers = luckyNumbers[luckyNumbers.length - 1] == userNumbers[userNumbers.length - 1] ? 1 : 0;

        System.out.print("--中奖号码是--：");
        printArray(luckyNumbers);
        System.out.print("您投注的号码是：");
        printArray(userNumbers);
        System.out.println("您命中的红球个数是：" + redHitNumbers);
        System.out.println("您是否命中蓝球：" + (blueHitNumbers == 1 ? "是" : "否"));

        // 4、判断中奖情况
        if (blueHitNumbers == 1 && redHitNumbers < 3) {
            System.out.println("恭喜你，中了5元小奖！");
        }else if (blueHitNumbers == 1 && redHitNumbers == 3 || blueHitNumbers == 0 && redHitNumbers == 4) {
            System.out.println("恭喜你，中了10元小奖！");
        }else if (blueHitNumbers == 1 && redHitNumbers == 4 || blueHitNumbers == 0 && redHitNumbers == 5) {
            System.out.println("恭喜你，中了200元！");
        }else if (blueHitNumbers == 1 && redHitNumbers == 5) {
            System.out.println("恭喜你，中了3000元大奖！");
        }else if (blueHitNumbers == 0 && redHitNumbers == 6) {
            System.out.println("恭喜你，中了500万元超级大奖！");
        }else if (blueHitNumbers == 1 && redHitNumbers == 6) {
            System.out.println("恭喜你，中了1000万元巨奖！");
        }else {
            System.out.println("谢谢惠顾！");
        }
    }

    // 打印数组元素
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t" );
        }
        System.out.println();  // 换行
    }

    // 用户输入一组双色球号码返回
    public static int[] userInputNumbers() {
        // a、定义一个数组存储7个号码
        int[] numbers = new int[7];
        // b、让用户录入6个红球号码
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < numbers.length - 1; i++) {
            System.out.print("请您输入第" + (i + 1) + "个红球号码（范围为：1 - 33，要求不重复）：");
            int data = sc.nextInt();
            // c、把当前录入的数据存入到数组中去
            numbers[i] = data;
        }

        // d、单独录入一个蓝球号码
        System.out.print("请您输入蓝球号码（范围为：1 - 16）：");
        numbers[numbers.length - 1] = sc.nextInt();
        return numbers;
    }

    // 随机生成一组中奖号码返回
    public static int[] createLuckyNumbers() {
        // a、定义一个动态初始化的数组存储7个数字
        int[] numbers = new int[7];   // [12, 23, 0, 0, 0, 0, | 0]
        //                                        i
        // b、遍历数组，为每个位置生成对应的号码（注意：遍历前6个位置，生成6个不重复的红球号码，范围是：1-33）
        Random r = new Random();
        for (int i = 0; i < numbers.length - 1; i++) {
            // 为当前位置找出一个不重复的1-33之间的数字
            while (true) {
                int data = r.nextInt(33) + 1;   // 1-33  ====>  (0-32)+1

                // c、注意：必须判断当前随机的这个号码之前是否出现过，出现过要重新随机一个，直到不重复为止，才可以存入数组中去
                // 定义一个flag变量，默认data是没有重复的
                boolean flag = true;
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == data) {
                        // data当前这个数据之前出现过，不能用
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    // data这个数据之前没有出现过，可以使用了
                    numbers[i] = data;
                    break;
                }
            }
        }

        // d、为第7个位置生成一个1-16的号码作为蓝球号码
        numbers[numbers.length - 1] = r.nextInt(16) + 1;
        return numbers;
    }




}
