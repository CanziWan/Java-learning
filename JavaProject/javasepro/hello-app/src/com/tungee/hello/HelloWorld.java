package com.tungee.hello;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String args[]){
        /*System.out.println("Hello tungee!");
        System.out.println("Hello tungee!");
        System.out.println("Hello tungee!");*/

       /* Scanner sc = new Scanner(System.in);

        System.out.print("请输入您的年龄：");
        int age = sc.nextInt();
        System.out.println("您输入的你年龄是：" + age );

        System.out.print("请输入您的名字：");
        String name = sc.next();
        System.out.println("欢迎：" + name);*/

     /*   Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100);
            System.out.println(num);
        }

        System.out.println("------------------------------");

        // 生成1-10的随机数
        int num2 = r.nextInt(10) + 1;
        System.out.println(num2);

        // 生成3-17的随机数
        int num3 = r.nextInt(15) + 3;
        System.out.println(num3);*/

        Random r = new Random();
        // 随机生成一个幸运数字，范围为：0 - 100
        int luckyNumber = r.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        // 用一个死循环来实现猜数字的逻辑
        while(true){
            System.out.print("请您输入猜测的数字（数字的范围为0-100）：");
            int guessNumber = sc.nextInt();

            if(guessNumber > luckyNumber){
                System.out.println("对不起，您猜测的数字过大");
            }else if(guessNumber < luckyNumber){
                System.out.println("对不起，您猜测的数字过小");
            }else{
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }

        int[] ages = new int[]{10,2030,20,30,32};
        int[] ages2 = {10,2030,20,30,32};

        double[] money = new double[]{39.13,1.1,141,114.14,12.12};
        double[] money2 = {39.13,1.1,141,114.14,12.12};

        String[] names = new String[]{"xiaoming","xiaobai","zhanshan","lisi"};
        String[] names2 = {"xiaoming","xiaobai","zhanshan","lisi"};

        System.out.println(ages);
    }
}
