package com.tungee.d6_char_stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/*
    目标：学习文件字符输入流（每次读取一个字符）
    构造器：public FileReader(File file):创建一个字符输入流与源文件对象接通
           public FileReader(String filePath):创建一个字符输入流与源文件路径接通
    方法：public int read():读取一个字符的编号返回！读取完毕返回-1
         public int read(char[] buffer):读取一个字符数组，读取多少个字符就返回多少个数量，读取完毕返回-1
 */
public class FileReaderDemo01 {
    public static void main(String[] args) throws Exception {
        // 目标：每次读取一个字符
        // 1、创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("day09-file-recursion-io-demo\\src\\data03.txt");

        // 2、读取一个字符返回其编号，没有可读的字符了返回-1
//        int code = fr.read();
//        System.out.print((char) code);
//
//        int code1 = fr.read();
//        System.out.print((char) code1);

        // 3、使用循环读取字符
        int code;
        while ((code = fr.read()) != -1) {
            System.out.print((char) code);
        }

    }
}
