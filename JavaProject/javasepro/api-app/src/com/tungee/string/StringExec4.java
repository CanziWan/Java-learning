package com.tungee.string;

import java.util.Random;
/*
    案例：实现5位随机验证码
 */
public class StringExec4 {
    public static void main(String[] args) {
        // 1、定义可能出现的字符信息
        String datas = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        // 2、循环5次，每次生成一个随机的索引，提取对应的字符链接起来即可
        String code = "";
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            // 随机一个索引
            int index = r.nextInt(datas.length());
            char c = datas.charAt(index);
            code += c;
        }

        // 3、输出字符串变量即可
        System.out.println(code);
    }
}
