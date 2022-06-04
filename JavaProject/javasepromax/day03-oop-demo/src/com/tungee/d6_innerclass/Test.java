package com.tungee.d6_innerclass;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.setName("inner");
        in.show();
        // Outer.Inner.test();  // JDK 16 开始支持静态成员了

        System.out.println("------------------");

        Outer.Inner in1 = new Outer("play basketball").new Inner();
        in1.show();
    }
}
