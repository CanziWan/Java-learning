package com.tungee.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileInputStreamDemo01 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个文件字节输入流管道与源文件接通
        // InputStream is = new FileInputStream(new File("day09-file-recursion-io-demo\\src\\data.txt"));
        // 简化写法
        InputStream is = new FileInputStream("day09-file-recursion-io-demo\\src\\data.txt");

        // 2、读取一个字节返回（每次读取一滴水）
//        int b1 = is.read();
//        System.out.println(b1);
//        System.out.println((char) b1);
//
//        int b2 = is.read();
//        System.out.println(b2);
//        System.out.println((char) b2);
//
//        int b3 = is.read();
//        System.out.println(b3);
//        System.out.println((char) b3);
//
//        int b4 = is.read(); // 读取完毕返回-1
//        System.out.println(b4);

        // 3、使用循环改进
        // 定义一个变量记录每次读取的字节
        int b;
        while ((b = is.read()) != -1) {
            System.out.print((char) b);
        }

    }
}
