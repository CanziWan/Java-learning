package com.tungee.d2_recursion;
/*
    目标：递归经典案例--猴子吃桃问题
    设f为桃子的个数，x为天数
    公式：f(x) - f(x) / 2 - 1 = f(x + 1)
         f(x) * 2 - f(x) - 2 = 2f(x + 1)
         f(x) = 2f(x + 1) + 2
    求f(1) = ?
    终结点：f(10) = 1
    递归的方向：合理（走向终结点）
 */
public class RecursionDemo04 {
    public static void main(String[] args) {
        System.out.println(f(1)); // 第一天桃子的个数：1534
        System.out.println(f(2)); // 766
        System.out.println(f(3)); // 382
    }

    public static int f(int n) {
        if (n == 10) {
            return 1;
        }else {
            return 2 * f(n + 1) + 2;
        }
    }
}
