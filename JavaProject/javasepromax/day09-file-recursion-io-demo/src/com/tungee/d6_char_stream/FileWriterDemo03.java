package com.tungee.d6_char_stream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
    目标：学习文件字符输出流
 */
public class FileWriterDemo03 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个字符输出流管道与目标文件接通
        // Writer fw = new FileWriter("day09-file-recursion-io-demo\\src\\out08.txt"); // 覆盖管道，每次启动都会清空文件之前的数据
        Writer fw = new FileWriter("day09-file-recursion-io-demo\\src\\out08.txt", true); // 追加管道，每次启动不会清空文件之前的数据

        // a.public void write(int c):写一个字符出去
        fw.write(98);
        fw.write('a');
        fw.write('徐'); // 不会乱码
        fw.write("\r\n"); // 换行

        // b.public void write(String c):写一个字符串出去
        fw.write("abc我是谁");
        fw.write("\r\n"); // 换行

        // c.public void write(char[] buffer):写一个字符数组出去
        char[] chars = "abc我是谁".toCharArray();
        fw.write(chars);
        fw.write("\r\n"); // 换行

        // d.public void write(String c, int pos, int len):写字符串的一部分出去
        fw.write("abc我是谁", 0, 5);
        fw.write("\r\n"); // 换行

        // e.public void write(char[] buffer, int pos, int len):写字符数组的一部分出去
        fw.write(chars, 3, 3);
        fw.write("\r\n"); // 换行

        // fw.flush(); // 刷新后流可以继续使用
        fw.close(); // 关闭包含刷新，关闭后流不能用
    }
}
