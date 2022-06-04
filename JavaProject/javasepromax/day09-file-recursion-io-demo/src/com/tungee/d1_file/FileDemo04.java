package com.tungee.d1_file;

import java.io.File;
import java.util.Arrays;

/*
    目标：学习File针对目录的遍历
 */
public class FileDemo04 {
    public static void main(String[] args) {
        // 1、定位一个目录
        File f1 = new File("D:/resources");
        String[] names = f1.list();
        for (String name : names) {
            System.out.println(name);
        }

        // 2、一级文件对象
        // 获取当前目录下所有的“一级文件对象”到一个文件对象数组中去返回（重点）
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }

        // 注意事项
        File dir = new File("D:/aaaaaaaaaaaaaa");
        File[] files1 = dir.listFiles();
        System.out.println(files1); // null

        File dir1 = new File("D:/resources/beauty.jpg");
        File[] files2 = dir1.listFiles();
        System.out.println(files2); // null

        File dir2 = new File("D:/resources/ddd");
        File[] files3 = dir2.listFiles();
        System.out.println(Arrays.toString(files3)); // []
    }
}
