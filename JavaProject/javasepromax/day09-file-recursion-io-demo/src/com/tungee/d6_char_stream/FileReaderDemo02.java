package com.tungee.d6_char_stream;

import java.io.FileReader;
import java.io.Reader;

/*
    目标：学习文件字符输入流（每次读取一个字符数组）
    构造器：public FileReader(File file):创建一个字符输入流与源文件对象接通
           public FileReader(String filePath):创建一个字符输入流与源文件路径接通
    方法：public int read():读取一个字符的编号返回！读取完毕返回-1
         public int read(char[] buffer):读取一个字符数组，读取多少个字符就返回多少个数量，读取完毕返回-1
 */
public class FileReaderDemo02 {
    public static void main(String[] args) throws Exception {
        // 目标：每次读取一个字符数组
        // 1、创建一个字符输入流管道与源文件接通
        Reader fr = new FileReader("day09-file-recursion-io-demo\\src\\data04.txt");

        // 2、用循环，每次读取一个字符数组的数据   1024 + 1024 + 8
        char[] buffer = new char[1024]; // 1K字符
        int len;
        while ((len = fr.read(buffer)) != -1) {
            // 读取多少，倒出多少(常用)
            String rs = new String(buffer, 0, len); // 解码
            System.out.print(rs);
        }

    }
}
