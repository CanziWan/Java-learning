package com.tungee.demo;
/*
    找素数
 */
public class Test2 {
    public static void main(String[] args) {
        // 1、定义一个循环，找到101 - 200之间的全部数据
        for (int i = 101; i <= 200; i++) {
            // i = 101 102 103 ... 199 200

            // 信号位：标记
            boolean flag = true;  // 一开始认为当前数据是素数

            // 2、判断当前遍历的这个数据是否是素数
            for (int j = 2; j < i / 2; j++) {
                if (i % j ==0) {
                    flag = false;
                    break;
                }
            }

            // 3、根据判定的结果选择是否输出这个数据，是素数则输出
            if (flag) {
                System.out.print(i + "\t");
            }
        }
    }
}
