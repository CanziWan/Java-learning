package com.tungee.d2_recursion;

import java.io.File;
import java.io.IOException;

/*
    目标：非规律化递归案例--文件搜索
    需求：去D盘搜索 ideaIU-2021.1.1.exe 文件
 */
public class RecursionDemo05 {
    public static void main(String[] args) {
        // 2、传入目录和文件名
        searchFile(new File("D:/"), "ideaIU-2021.1.1.exe");
    }

    /**
     * 1、搜索某个目录下的全部文件，找到我们想要的文件
     * @param dir 被搜索的源目录
     * @param fileName 想要搜索的文件名称
     */
    public static void searchFile(File dir, String fileName) {
        // 3、判断dir是否是目录
        if (dir != null && dir.isDirectory()) {
            // 可以找了
            // 4、提取当前目录下的一级文件对象
            File[] files = dir.listFiles(); // null  []
            // 5、判断是否存在一级文件对象，存在才可以遍历
            if (files != null && files.length != 0) {
                for (File file : files) {
                    // 6、判断当前遍历的一级文件对象是文件 还是 目录
                    if (file.isFile()) {
                        // 7、判断是否是要找的，是则把其路径输出即可
                        if (file.getName().contains(fileName)) {
                            System.out.println("找到了" + file.getAbsolutePath());
                            // 启动它
                            try {
                                Runtime r = Runtime.getRuntime();
                                r.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }else {
                        // 8、是文件夹，需要继续递归寻找
                        searchFile(file, fileName);
                    }
                }
            }
        }else {
            System.out.println("对不起，当前搜索的位置不是文件夹！");
        }
    }
}
