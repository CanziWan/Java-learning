package com.tungee.d4_byte_stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamDemo04 {
    public static void main(String[] args) throws Exception {
        // 1、创建一个文件字节输出流管道与目标文件接通
        OutputStream os = new FileOutputStream("day09-file-recursion-io-demo/src/out04.txt", true); // 追加数据管道：追加数据，不会清空之前的数据
        // OutputStream os = new FileOutputStream("day09-file-recursion-io-demo/src/out04.txt"); // 先清空之前的数据，写新的数据进去

        // 2、从内存中写数据到文件
        // a、public void write(int a):写一个字节出去
        os.write('a');
        os.write(98);
        os.write("\r\n".getBytes()); // 换行
        // os.write('徐'); // 3个字节：[ooo] ，写出去会乱码

        // b、public void write(byte[] buffer):写一个字节数组出去
        byte[] buffer = {'a', 97, 98, 99};
        os.write(buffer);
        os.write("\r\n".getBytes()); // 换行

        byte[] buffer2 = "我adsf是gasdwem谁".getBytes();
        // byte[] buffer2 = "我是谁".getBytes("GBK");
        os.write(buffer2);
        os.write("\r\n".getBytes()); // 换行

        // c、public void write(byte[] buffer, int pos, int len):写一个字节数组的一部分出去
        byte[] buffer3 = {'a', 97, 98, 99};
        os.write(buffer3, 0, 3);
        os.write("\r\n".getBytes()); // 换行


        // os.flush(); // 写数据，必须刷新数据。可以继续使用流。
        os.close(); // 释放资源，包含了刷新数据操作。关闭后流不可以再使用了。
    }
}
