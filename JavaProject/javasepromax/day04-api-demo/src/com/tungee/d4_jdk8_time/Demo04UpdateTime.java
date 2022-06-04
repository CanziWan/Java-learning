package com.tungee.d4_jdk8_time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
/*
    修改日期时间
 */
public class Demo04UpdateTime {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime); // 当前时间
        System.out.println(nowTime.minusHours(1)); // 1小时前
        System.out.println(nowTime.minusMinutes(1)); // 1分钟前
        System.out.println(nowTime.minusSeconds(1)); // 1秒前
        System.out.println(nowTime.minusNanos(1)); // 1纳秒前

        System.out.println("---------------------------------------------------");

        System.out.println(nowTime.plusHours(1)); // 1小时后
        System.out.println(nowTime.plusMinutes(1)); // 1分钟后
        System.out.println(nowTime.plusSeconds(1)); // 1秒后
        System.out.println(nowTime.plusNanos(1)); // 1纳秒后

        System.out.println("---------------------------------------------------");

        // 不可变对象，每次修改产生新对象
        System.out.println(nowTime);

        System.out.println("---------------------------------------------------");

        LocalDate myDate = LocalDate.of(2018, 9, 5);
        LocalDate nowDate = LocalDate.now();

        System.out.println("今天时2018-09-06？ " + nowDate.equals(myDate)); // 今天时2018-09-06？ false
        System.out.println(myDate + "是否在" + nowDate + "之前？ " + myDate.isBefore(nowDate)); // 2018-09-05是否在2022-05-17之前？ true
        System.out.println(myDate + "是否在" + nowDate + "之后？ " + myDate.isAfter(nowDate)); // 2018-09-05是否在2022-05-17之后？ false

        System.out.println("---------------------------------------------------");

        // 判断今天是否是你的生日
        LocalDate birDate = LocalDate.of(1996, 5, 10);
        LocalDate nowDate1 = LocalDate.now();
        MonthDay birMd = MonthDay.of(birDate.getMonthValue(), birDate.getDayOfMonth());
        MonthDay nowMd = MonthDay.from(nowDate1);
        System.out.println("今天是你的生日吗？ " + birMd.equals(nowMd)); // 今天是你的生日吗？ false

    }
}
