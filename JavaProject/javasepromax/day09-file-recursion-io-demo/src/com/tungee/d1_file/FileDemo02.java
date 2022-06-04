package com.tungee.d1_file;

import java.io.File;
import java.text.SimpleDateFormat;

/*
    目标：学习File类的获取功能的API
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // 1、绝对路径创建一个文件对象
        File f1 = new File("D:/resources/xueshan.jpg");
        // a、获取它的绝对路径
        System.out.println(f1.getAbsolutePath());
        // b、获取文件定义的时候使用的路径
        System.out.println(f1.getPath());
        // c、获取文件的名称：带后缀
        System.out.println(f1.getName());
        // d、获取文件的大小：字节个数
        System.out.println(f1.length());
        // e、获取文件的最后修改时间（时间毫秒值）
        long time = f1.lastModified();
        System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time));
        // f、判断文件对象是文件还是文件夹
        System.out.println(f1.isFile()); // true
        System.out.println(f1.isDirectory()); // false
        System.out.println(f1.exists()); // true

        System.out.println("--------------------------------------------------------------------");

        // 2、相对路径创建一个文件对象
        File f2 = new File("day09-file-recursion-io-demo\\src\\data.txt");
        // a、获取它的绝对路径
        System.out.println(f2.getAbsolutePath());
        // b、获取文件定义的时候使用的路径
        System.out.println(f2.getPath());
        // c、获取文件的名称：带后缀
        System.out.println(f2.getName());
        // d、获取文件的大小：字节个数
        System.out.println(f2.length());
        // e、获取文件的最后修改时间（时间毫秒值）
        long time2 = f2.lastModified();
        System.out.println("最后修改时间：" + new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(time2));
        // f、判断文件对象是文件还是文件夹
        System.out.println(f2.isFile()); // true
        System.out.println(f2.isDirectory()); // false
        System.out.println(f2.exists()); // true

        System.out.println("--------------------------------------------------------------------");

        File file = new File("D:/");
        System.out.println(file.isFile()); // false
        System.out.println(file.isDirectory()); // true
        System.out.println(file.exists()); // true

        System.out.println("--------------------------------------------------------------------");

        File file1 = new File("D:/aaaaaweraweaaaadfsad");
        System.out.println(file1.isFile()); // false
        System.out.println(file1.isDirectory()); // false
        System.out.println(file1.exists()); // false
    }
}
