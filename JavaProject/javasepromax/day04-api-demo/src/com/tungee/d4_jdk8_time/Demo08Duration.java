package com.tungee.d4_jdk8_time;

import java.time.Duration;
import java.time.LocalDateTime;

/*
    时间间隔：用于LocalDateTime之间的比较，也可以用于Instant之间的比较
 */
public class Demo08Duration {
    public static void main(String[] args) {
        // 本地日期时间对象
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);

        // 出生的日期时间对象
        LocalDateTime birthDate = LocalDateTime.of(2021, 03, 14, 20, 00, 00);
        System.out.println(birthDate);

        Duration duration = Duration.between(birthDate, today);  // 第二个参数减第一个参数
        System.out.println(duration.toDays()); // 两个时间差的天数
        System.out.println(duration.toHours()); // 两个时间差的小时数
        System.out.println(duration.toMinutes()); // 两个时间差的分钟数
        System.out.println(duration.toMillis()); // 两个时间差的毫秒数
        System.out.println(duration.toNanos()); // 两个时间差的纳秒数


    }
}
