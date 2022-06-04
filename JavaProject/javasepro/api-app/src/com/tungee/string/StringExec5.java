package com.tungee.string;

import java.util.Scanner;

/*
    案例：模拟用户登录
 */
public class StringExec5 {
    public static void main(String[] args) {
        // 1、定义正确的登录名和密码
        String okLoginNmae = "admin";
        String okPassword = "ken";

        // 3、定义一个循环，循环3次，让用户登录
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("请您输入登录名：");
            String loginName = sc.next();
            System.out.print("请您输入密码：");
            String password = sc.next();

            // 3、判断登录是否成功
            if (okLoginNmae.equals(loginName)) {
                // 4、判断密码是否正确
                if (okPassword.equals(password)) {
                    System.out.println("登录成功！欢迎进入系统。");
                    break;
                }else {
                    // 密码错误了！
                    System.out.println("您的密码不正确！您还剩余" + (3 - i) + "次机会！");
                }
            }else {
                System.out.println("登录名错误了！您还剩余" + (3 - i) + "次机会！");
            }
        }

    }
}
