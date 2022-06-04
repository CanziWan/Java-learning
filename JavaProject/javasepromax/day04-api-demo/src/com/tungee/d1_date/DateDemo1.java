package com.tungee.d1_date;

import java.util.Date;

/*
    目标：学会使用Date类处理时间，获取时间的信息
 */
public class DateDemo1 {
    public static void main(String[] args) {
        // 1、创建一个Date类的对象：代表系统此刻日期时间对象
        Date d = new Date();
        System.out.println(d);

        // 2、获取时间对象的毫秒值
        long time = d.getTime();
        System.out.println(time);
        long time1 = System.currentTimeMillis();
        System.out.println(time1);

        System.out.println("-----------------------------");


        // 需求：计算出当前时间往后走1小时121秒之后的时间是多少
        Date d1 = new Date();
        System.out.println(d1);

        // 1、得到当前时间毫秒值
        long time2 = System.currentTimeMillis();
        // 2、当前时间往后走了1小时121秒
        time2 += (60 * 60 + 121) * 1000;

        // 3、把时间毫秒值转换成对应的日期对象
        // Date d2 = new Date(time2);   // 法一
        // System.out.println(d2);
        Date d3 = new Date();           // 法二
        d3.setTime(time2);
        System.out.println(d3);

    }
}
