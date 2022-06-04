package com.tungee.d2_static_util;

import java.util.Random;

/*
    工具类
 */
public class TungeeUtil {

    /*
        注意：由于工具类无需创建对象，所以把其构造器私有化会更专业
     */
    private TungeeUtil() {

    }


    /*
        静态方法
     */
    public static String createVerifyCode(int n) {
        // 开发一个验证码：
        // 1、定义一个变量记录验证码
        String code = "";
        // 2、定义一个变量记录全部验证码字符
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // 3、定义一个循环生成几个随机索引，去得到几个字符
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            // 4、获取随机索引对应的字符，连接给code
            int index = random.nextInt(data.length());
            code += data.charAt(index);
        }
        return code;
    }


}
