package com.tungee.string;

import java.util.Scanner;

/*
    案例：手机号码屏蔽
 */
public class StringExec6 {
    public static void main(String[] args) {
        // 1、键盘录入一个手机号码
        Scanner sc = new Scanner(System.in);
        System.out.print("请您输入您的手机号码：");
        String tel = sc.next();

        // 2、截取手机号码的前3位和后4位    18665666520
        String before = tel.substring(0, 3);  // 0 1 2
        String after = tel.substring(7);  // 8 9 10 11   从索引7开始截取到手机号码末尾

        String s = before + "****" + after;
        System.out.println(s);

        // 方法二（注意：这种方法可能出现BUG，最后四位数和中间四位数一样的时候，后面八位数都被屏蔽了）
        String replace = tel.replace(tel.substring(3, 7), "****");
        System.out.println(replace);
    }
}
