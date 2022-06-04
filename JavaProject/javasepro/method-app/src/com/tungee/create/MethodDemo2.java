package com.tungee.create;

public class MethodDemo2 {
    public static void main(String[] args) {
        // 目标：学习方法的完整格式，理解其调用和执行流程
        int rs = add(10, 20);
        System.out.println("求和得到：" + rs);

        System.out.println("--------------");

        int rs1 = add(110, 210);
        System.out.println("求和得到：" + rs1);
    }

    public static int add(int a, int b) {
        int c = a + b;
        return c;
    }
}
