package com.tungee.d4_jdk8_time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/*
    日期时间解析/格式化器
 */
public class Demo06DateTimeFormatter {
    public static void main(String[] args) {
        // 本地此刻  日期时间  对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 解析/格式化器
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss EEE a");

        // 正向格式化
        String ldtStr1 = dtf.format(ldt);
        System.out.println(ldtStr1);

        // 逆向格式化
        String ldtStr = ldt.format(dtf);
        System.out.println(ldtStr);

        // 解析字符串时间
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String dateStr = "2019-11-11 11:11:11";

        // 解析当前字符串时间成为本地日期时间对象
        LocalDateTime ldt1 = LocalDateTime.parse(dateStr, dtf1);
        System.out.println(ldt1);

        System.out.println(ldt1.getDayOfYear());
    }
}
