package com.tungee.d8_innerclass_anonymous;

import java.util.Scanner;

/*
    目标：掌握匿名内部类的使用形式（语法）
 */
public class Test2 {
    public static void main(String[] args) {
        Swimming s = new Swimming() {
            @Override
            public void swim() {
                System.out.println("Student is swimming!");
            }
        };
        go(s);

        System.out.println("--------------------------");

        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("Teacher is swimming!");
            }
        };
        go(s1);

        System.out.println("--------------------------");

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("athlete is swimming!");
            }
        });
    }

    /*
        学生 老师 运动员可以一起参加游泳比赛
     */
    public static void go(Swimming s) {
        System.out.println("begin ...");
        s.swim();
        System.out.println("end ...");
    }
}

//class Student implements Swimming {
//    @Override
//    public void swim() {
//        System.out.println("Student is swimming!");
//    }
//}

interface Swimming {
    void swim();
}
