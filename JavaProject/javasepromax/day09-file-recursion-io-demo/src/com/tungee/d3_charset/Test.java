package com.tungee.d3_charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
    目标：学会自己进行文字的编码和解码，为以后可能用到的场景做准备
 */
public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 1、编码：把文字转换成字节
        String name = "abc我是谁";
        // byte[] bytes = name.getBytes(); // 以当前代码的默认字符集进行编码（UTF-8）
        byte[] bytes = name.getBytes("GBK"); // 以指定的字符集进行编码（GBK）
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        // 2、解码：把字节转换成对应的中文形式（编码前 和 编码后 的字符集必须一致，否则乱码）
        // String rs = new String(bytes); // 默认的UTF-8，乱码
        String rs = new String(bytes, "GBK"); // 指定GBK解码
        System.out.println(rs);
    }
}
