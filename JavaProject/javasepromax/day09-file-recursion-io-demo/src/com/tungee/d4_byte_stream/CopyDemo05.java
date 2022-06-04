package com.tungee.d4_byte_stream;

import java.io.*;

/*
    目标：学会使用字节流完成文件的复制（支持一切文件类型的复制）
 */
public class CopyDemo05 {
    public static void main(String[] args) {
        try {
            // 1、创建一个字节输入流管道与源文件(视频/图片/文本)接通
            // InputStream is = new FileInputStream("D:\\JavaProject\\用户购票功能.avi");
            // InputStream is = new FileInputStream("D:\\resources\\beauty.jpg");
            InputStream is = new FileInputStream("day09-file-recursion-io-demo\\src\\out04.txt");

            // 2、创建一个字节输出流管道与目标文件接通
            // OutputStream os = new FileOutputStream("D:\\new.avi");
            // OutputStream os = new FileOutputStream("D:\\resources\\newBeauty.jpg");
            OutputStream os = new FileOutputStream("day09-file-recursion-io-demo\\src\\out05.txt");

            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024]; // 1KB
            int len; // 记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
                // os.flush();
            }
            System.out.println("Copy finished!");

            // 4、关闭流
            os.close();
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
