package com.tungee.d1_polymorphic;

public class Tortoise extends Animal {
    public String name = "zi lei tortoise";
    @Override
    public void run() {
        System.out.println("🐢 can't run ...");
    }
}
