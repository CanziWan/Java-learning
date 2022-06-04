package com.tungee.d5_resource;

import java.io.*;

/*
    目标：学会使用finally释放资源
 */
public class TryCatchFinallyDemo01 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            // System.out.println(10 / 0);

            // 1、创建一个字节输入流管道与源文件(视频/图片/文本)接通
            // InputStream is = new FileInputStream("D:\\JavaProject\\用户购票功能.avi");
            // InputStream is = new FileInputStream("D:\\resources\\beauty.jpg");
            is = new FileInputStream("day09-file-recursion-io-demo\\src\\out04.txt");

            // 2、创建一个字节输出流管道与目标文件接通
            // OutputStream os = new FileOutputStream("D:\\new.avi");
            // OutputStream os = new FileOutputStream("D:\\resources\\newBeauty.jpg");
            os = new FileOutputStream("day09-file-recursion-io-demo\\src\\out05.txt");

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
        } finally {
            // 无论代码是正常结束，还是出现异常都要最后执行这里，除非JVM退出了
            System.out.println("===== finally =====");

            // 4、关闭流
            try {
                if ( os!= null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println(test(10, 2));
    }

    // 即使try中有return语句，也要执行finally语句
    public static int test(int a, int b) {
        try {
            int c = a / b;
            // System.exit(0); // 关闭JVM
            return c;
        } catch (Exception e) {
            e.printStackTrace();
            return -111111; // 计算出现bug
        } finally {
            System.out.println("------finally------");
            // 即使前面的语句有return执行，也必须执行完finally的代码，除非JVM退出了
            // 开发中不建议在这里加return语句，如果加了，返回的永远是这里的数据了，这样会出问题！
            return 100;
        }
    }
}
