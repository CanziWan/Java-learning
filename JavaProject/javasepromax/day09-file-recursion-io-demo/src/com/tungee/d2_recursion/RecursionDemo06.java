package com.tungee.d2_recursion;
/*
    目标：非规律化递归问题--啤酒问题
 */
public class RecursionDemo06 {

    // 定义一个静态的成员变量用于存储可以买的酒数量
    public static int totalNumber; // 总数量
    public static int lastBottleNumber; // 记录每次剩余的瓶子个数
    public static int lastCoverNumber; // 记录每次剩余的盖子个数

    public static void main(String[] args) {
        // 1、拿钱买酒
        buy(10);
        System.out.println("totalNumber：" + totalNumber);
        System.out.println("lastBottleNumber：" + lastBottleNumber);
        System.out.println("lastCoverNumber：" + lastCoverNumber);
    }

    public static void buy(int money) {
        // 2、看可以立马买多少瓶
        int buyNumber = money / 2; // 5
        totalNumber += buyNumber;

        // 3、把盖子和瓶子换算成钱
        // 统计本轮总的 盖子数 和 瓶子数
        int coverNumber = lastCoverNumber + buyNumber;
        int bottleNumber = lastBottleNumber + buyNumber;

        // 统计可以换算的钱
        int allMoney = 0;
        if (coverNumber >= 4) {
            allMoney += (coverNumber / 4) * 2;
        }
        lastCoverNumber = coverNumber % 4;

        if (bottleNumber >= 2) {
            allMoney += (bottleNumber / 2) * 2;
        }
        lastBottleNumber = bottleNumber % 2;

        if (allMoney >= 2) {
            buy(allMoney);
        }
    }
}
