package com.tungee.d4_jdk8_time;

import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;
/*
    时间戳
 */
public class Demo05Instant {
    public static void main(String[] args) {
        // 1、得到一个Instant时间戳对象
        Instant instant = Instant.now();
        System.out.println(instant);

        // 2、系统此刻的时间戳？
        Instant instant1 = Instant.now();
        System.out.println(instant1.atZone(ZoneId.systemDefault()));

        // 3、如何去返回Date对象
        Date date = Date.from(instant);
        System.out.println(date);

        Instant i2 = date.toInstant();
        System.out.println(i2);
    }
}
