package com.tungee.d3_calendar;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo01 {
    public static void main(String[] args) {
        // 1、拿到系统此刻日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        // 2、获取日历的信息:public int get(int field): 取日历中的某个字段信息
        int year = cal.get(Calendar.YEAR);
        System.out.println(year);
        int month = cal.get(Calendar.MONTH) + 1;
        System.out.println(month);
        int dayOfYear = cal.get(Calendar.DAY_OF_YEAR);
        System.out.println(dayOfYear);

        // 3、public void set(int field, int value): 修改日历的某个字段信息
        // cal.set(Calendar.HOUR, 12);
        // System.out.println(cal);

        // 4、public void add(int field, int amount): 为某个字段增加/减少指定的值
        // 请问64天后是什么时间
        cal.add(Calendar.DAY_OF_YEAR, 64);
        cal.add(Calendar.MINUTE, 59);

        // 5、public final Date getTime(): 拿到此刻日期对象
        Date d = cal.getTime();
        System.out.println(d);

        // 6、public long getTimeInMillis(): 拿到此刻时间毫秒值
        long time = cal.getTimeInMillis();
        System.out.println(time);
    }
}
