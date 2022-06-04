package com.tungee.d1_file;

import java.io.File;
import java.io.IOException;

/*
    目标：学习File类的创建和删除的方法
 */
public class FileDemo03 {
    public static void main(String[] args) throws IOException {
        // a、创建新文件，创建成功返回true，反之（不需要这个，以后文件写出去的时候都会自动创建）
        File f = new File("day09-file-recursion-io-demo\\src\\data.txt");
        System.out.println(f.createNewFile());
        File f1 = new File("day09-file-recursion-io-demo\\src\\data02.txt");
        System.out.println(f1.createNewFile()); // (几乎不用的，因为以后文件都是自动创建的！)

        // b、mkdir创建一级目录
        File f2 = new File("D:/resources/aaa");
        System.out.println(f2.mkdir());

        // c、mkdirs创建多级目录（重点）
        File f3 = new File("D:/resources/ccc/ddd/eee/fff");
        // System.out.println(f3.mkdir()); // false
        System.out.println(f3.mkdirs()); // 支持多级创建

        // d、删除文件或者空文件夹
        System.out.println(f1.delete());
        File f4 = new File("D:/resources/xueshan.jpg");
        System.out.println(f4.delete()); // 占用一样可以删除

        // 只能删除空文件夹，不能删除非空文件夹
        File f5 = new File("D:/resources/aaa");
        System.out.println(f5.delete()); // 占用一样可以删除
    }
}
