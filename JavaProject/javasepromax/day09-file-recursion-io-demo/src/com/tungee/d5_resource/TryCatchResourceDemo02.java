package com.tungee.d5_resource;

import java.io.*;

/*
    目标：学会使用finally释放资源（简化资源释放写法：JDK 1.7 之后）
 */
public class TryCatchResourceDemo02 {
    public static void main(String[] args) {
        try (
                // 这里只能放置资源对象，用完会自动关闭：自动调用资源对象的close方法关闭资源（即使出现异常也会做关闭操作）
                // 1、创建一个字节输入流管道与源文件(视频/图片/文本)接通
                // InputStream is = new FileInputStream("D:\\JavaProject\\用户购票功能.avi");
                // InputStream is = new FileInputStream("D:\\resources\\beauty.jpg");
                InputStream is = new FileInputStream("day09-file-recursion-io-demo\\src\\out04.txt");

                // 2、创建一个字节输出流管道与目标文件接通
                // OutputStream os = new FileOutputStream("D:\\new.avi");
                // OutputStream os = new FileOutputStream("D:\\resources\\newBeauty.jpg");
                OutputStream os = new FileOutputStream("day09-file-recursion-io-demo\\src\\out05.txt");

                // int a = 10; // 这里只能放资源，否则会报错

                MyConnection connection = new MyConnection(); // 最终会自动调用资源的close方法
                ) {
            // 3、定义一个字节数组转移数据
            byte[] buffer = new byte[1024]; // 1KB
            int len; // 记录每次读取的字节数
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
                // os.flush();
            }
            System.out.println("Copy finished!");

            // System.out.println(10 / 0);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class MyConnection implements AutoCloseable{
    @Override
    public void close() throws IOException {
        System.out.println("连接资源被成功释放！");
    }
}
