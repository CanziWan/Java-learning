package com.tungee.d1_byte_buffer;

import java.io.*;

/*
    目标：使用字节缓冲流完成数据的读写操作
 */
public class ByteBufferDemo {
    public static void main(String[] args) {
        try (
                // 这里只能放置资源对象，用完会自动关闭：自动调用资源对象的close方法关闭资源（即使出现异常也会做关闭操作）
                // 1、创建一个字节输入流管道与源文件(视频/图片/文本)接通
                // InputStream is = new FileInputStream("D:\\JavaProject\\用户购票功能.avi");
                // InputStream is = new FileInputStream("D:\\resources\\beauty.jpg");
                InputStream is = new FileInputStream("D:\\resources\\newBeauty.jpg");
                // a、把原始的字节输入流包装成高级的缓冲字节输入流
                InputStream bis = new BufferedInputStream(is);

                // 2、创建一个字节输出流管道与目标文件接通
                // OutputStream os = new FileOutputStream("D:\\new.avi");
                // OutputStream os = new FileOutputStream("D:\\resources\\newBeauty.jpg");
                OutputStream os = new FileOutputStream("D:\\resources\\newBeauty222.jpg");
                // b、把原始的字节输出流管道包装成高级的缓冲字节输出流管道
                OutputStream bos = new BufferedOutputStream(os);

        ) {
            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024]; // 1KB
            int len; // 记录每次读取的字节数
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("Copy finished!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
