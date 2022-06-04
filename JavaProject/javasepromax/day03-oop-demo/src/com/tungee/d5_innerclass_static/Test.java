package com.tungee.d5_innerclass_static;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.setName("inner");
        in.show();
    }
}
