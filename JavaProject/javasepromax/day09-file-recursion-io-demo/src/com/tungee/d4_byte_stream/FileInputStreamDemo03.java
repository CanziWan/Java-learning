package com.tungee.d4_byte_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/*
    目标：使用文件字节输入流一次读完文件的全部字节。可以解决中文乱码问题
 */
public class FileInputStreamDemo03 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个文件字节输入流管道与源文件接通
        File f = new File("day09-file-recursion-io-demo\\src\\data03.txt");
        InputStream is = new FileInputStream(f);

        // 2、定义一个字节数组与文件的大小刚好一样大
//        byte[] buffer = new byte[(int) f.length()];
//        int len = is.read(buffer);
//        System.out.println("读取了多少个字节：" + len);
//        System.out.println("文件大小：" + f.length());
//        System.out.println(new String(buffer));

        // 3、改进：Java官方提供API(注：JDK 9才提供)，读取全部字节数组
        // byte[] buffer = is.readAllBytes();
        // System.out.println(new String(buffer));
    }
}
