package com.tungee.demo;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // 目标：完成买飞机票的价格计算
        // 1、让用户键盘输入机票原价，月份，舱位类型
        Scanner sc = new Scanner(System.in);

        System.out.print("请您输入机票原价：");
        double price = sc.nextDouble();

        System.out.print("请您输入购买机票的月份（1 - 12）：");
        int month = sc.nextInt();    // Ctrl + Alt + V 可以快速定义一个变量

        System.out.print("请您选择购买机票的舱位类型（经济舱/头等舱）：");
        String cabinType = sc.next();

        // 4、调用方法，统计结果
        System.out.println("机票优惠后的价格为：" + caclDiscountedTicket(price, month, cabinType));
    }

    /**
     *   2、定义方法接收信息，统计优惠后的价格返回
     */

    public static double caclDiscountedTicket(double price, int month, String cabinType) {
        // 3、判断用户选择的信息情况
        if (month >= 5 && month <= 10) {
            // 旺季
            switch (cabinType) {
                case "头等舱":
                    price *= 0.9;  // price = price * 0.9;
                    break;
                case "经济舱":
                    price *= 0.85;  // price = price * 0.85;
                    break;
                default:
                    System.out.println("对不起，您选择的舱位类型不存在！");
                    price = -1;    // 表示当前无法计算价格！
            }
        }else if (month == 11 || month == 12 || month >= 1 && month <=4) {
            // 淡季
            switch (cabinType) {
                case "头等舱":
                    price *= 0.7;  // price = price * 0.7;
                    break;
                case "经济舱":
                    price *= 0.65;  // price = price * 0.65;
                    break;
                default:
                    System.out.println("对不起，您选择的舱位类型不存在！");
                    price = -1;    // 表示当前无法计算价格！
            }
        }else {
            System.out.println("对不起，您输入的月份出错了！");
            price = -1;  // 表示当前无法计算价格！
        }
        return price;   // 表示最终的优惠价格
    }

}
