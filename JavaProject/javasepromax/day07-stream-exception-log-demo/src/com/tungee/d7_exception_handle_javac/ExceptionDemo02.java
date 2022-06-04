package com.tungee.d7_exception_handle_javac;

import java.io.FileInputStream;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo02 {
    public static void main(String[] args) {
        System.out.println("------------ begin --------------");
        parseTime("2015-01-12 10:23:21");
        System.out.println("------------- end ---------------");
    }

    public static void parseTime(String date) {
        try {
            // 创建一个简单日期格式化类
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
            // 解析字符串时间成为日期对象
            Date d = sdf.parse(date);
            System.out.println(d);

            InputStream is = new FileInputStream("E:/meinv.jpg");
        } catch (Exception e) {
            e.printStackTrace(); // 打印异常栈信息
        }
    }


//    public static void parseTime(String date) {
//        try {
//            // 创建一个简单日期格式化类
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
//            // 解析字符串时间成为日期对象
//            Date d = sdf.parse(date);
//            System.out.println(d);
//
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException | ParseException e) {
//            e.printStackTrace(); // 打印异常栈信息
//        }
//    }


//    public static void parseTime(String date) {
//        try {
//            // 创建一个简单日期格式化类
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
//            // 解析字符串时间成为日期对象
//            Date d = sdf.parse(date);
//            System.out.println(d);
//
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace(); // 打印异常栈信息
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }


//    public static void parseTime(String date) {
//        try {
//            // 创建一个简单日期格式化类
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
//            // 解析字符串时间成为日期对象
//            Date d = sdf.parse(date);
//            System.out.println(d);
//        } catch (ParseException e) {
//            // 解析出现问题
//            System.out.println("出现了解析时间异常！");
//        }
//
//        try {
//            InputStream is = new FileInputStream("E:/meinv.jpg");
//        } catch (FileNotFoundException e) {
//            System.out.println("文件不存在！");
//        }
//
//    }

}
