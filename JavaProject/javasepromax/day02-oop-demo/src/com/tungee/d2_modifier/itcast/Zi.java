package com.tungee.d2_modifier.itcast;

import com.tungee.d2_modifier.Fu;

public class Zi extends Fu {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.protectedMethod();
        zi.publicMethod();

        Fu fu = new Fu();
        fu.publicMethod();
    }
}
