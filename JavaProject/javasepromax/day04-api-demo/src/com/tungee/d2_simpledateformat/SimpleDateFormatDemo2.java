package com.tungee.d2_simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo2 {
    public static void main(String[] args) throws ParseException {
        // 目标：学会使用SimpleDateFormat解析字符串时间成为日期对象
        // 需求：计算出2021年08月06日 11:11:11，往后走2天14小时49分06秒后的时间是多少
        // 1、把字符串时间拿到程序中
        String dateStr = "2021年08月06日 11:11:11";

        // 2、把字符串时间解析成日期对象（本节重点）:形式必须与被解析的时间的形式完全一样，运行时解析报错！
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = sdf.parse(dateStr);

        // 3、往后走2天14小时49分06秒
         long time = d.getTime() + (2L*24*60*60 + 14*60*60 + 49*60 + 6) * 1000;

        // 4、格式化这个时间毫秒值就得到结果
        System.out.println(sdf.format(time));
    }
}
