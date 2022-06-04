package com.tungee.d7_exception_handle_javac;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo01 {
//    public static void main(String[] args) throws ParseException, FileNotFoundException {
//        System.out.println("------------ begin --------------");
//        parseTime("2015-01-12 10:23:21");
//        System.out.println("------------- end ---------------");
//    }
//
//    public static void parseTime(String date) throws ParseException, FileNotFoundException {
//        // 创建一个简单日期格式化类
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd日 HH:mm:ss");
//        // 解析字符串时间成为日期对象
//        Date d = sdf.parse(date);
//        System.out.println(d);
//
//        InputStream is = new FileInputStream("E:/meinv.jpg");
//    }

    public static void main(String[] args) throws Exception {
        System.out.println("------------ begin --------------");
        parseTime("2015-01-12 10:23:21");
        System.out.println("------------- end ---------------");
    }

    public static void parseTime(String date) throws Exception {
        // 创建一个简单日期格式化类
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd日 HH:mm:ss");
        // 解析字符串时间成为日期对象
        Date d = sdf.parse(date);
        System.out.println(d);

        InputStream is = new FileInputStream("E:/meinv.jpg");
    }
}
