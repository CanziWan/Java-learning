package com.tungee.d1_polymorphic;

public class Dog extends Animal {
    public String name = "zi lei dog";

    @Override
    public void run() {
        System.out.println("🐕 run ...");
    }

    /*
        独有功能
     */
    public void lookDoor() {
        System.out.println("Dog is looking!");
    }
}
