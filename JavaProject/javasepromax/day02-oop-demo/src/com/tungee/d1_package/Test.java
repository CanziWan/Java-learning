package com.tungee.d1_package;

// 导包
import com.tungee.d1_package.it.Student;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 目标：理解以下两点
        // 1、同一个包下的类，互相可以直接访问
        System.out.println(User.onlineNumber);

        // 2、不同包下的类，必须先导包才可以访问
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        // 3、如果这个类中使用不同包下的相同类名，
        // 此时默认只能导入一个类的包，另一个类要使用全名(包名.类名)访问
        com.tungee.d1_package.it2.Student s2 = new com.tungee.d1_package.it2.Student();
    }
}
