package com.tungee.demo;

import java.util.Random;

/*
    需求：定义方法实现随机产生一个5位的验证码，每位可能是数字、大写字母、小写字母
 */
public class Test3 {
    public static void main(String[] args) {
       // 4、调用获取验证码的方法得到一个随机的验证码
       String code = createCode(5);
        System.out.println("随机验证码：" + code);
    }

    /*
        1、定义一个方法返回一个随机验证码：是否需要返回值类型声明？String  是否需要声明形式参数？int n
     */
    public static String createCode(int n) {
        // 4、定义一个字符串变量记录生成的随机字符
        String code = "";
        Random r = new Random();
        // 2、定义一个for循环，循环n次，依次生成随机字符
        for (int i = 0; i < n; i++) {
            // 3、生成一个随机字符：大写字母、小写字母、数字（0 1 2）
            int type = r.nextInt(3);   // type: 0 - 2
            switch (type) {
                case 0:
                    // 随机一个大写字母（A: 65  Z: 65+25=90）   利用减加法算出范围为： (0 - 25) + 65
                    char CH = (char)(r.nextInt(26) + 65);
                    code += CH;  // 将生成的字符累加起来
                    break;
                case 1:
                    // 随机一个小写字母（a: 97  z: 97+25=122）  利用减加法算出范围为： (0 - 25) + 97
                    char ch = (char)(r.nextInt(26) + 97);
                    code += ch;
                    break;
                case 2:
                    // 随机一个数字
                    code += r.nextInt(10);  // 0 - 9
                    break;
            }
        }
        return code;
    }
}
