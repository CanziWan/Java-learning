package com.tungee.d2_modifier;

public class Test {
    public static void main(String[] args) {
        // 目标：符理解权限修饰的修饰范围。理解每一种修饰后的作用范围
        Fu f = new Fu();
        // f.privateMethod();   // 报错，私有的
        f.method();
        f.protectedMethod();
        f.publicMethod();
    }
}
