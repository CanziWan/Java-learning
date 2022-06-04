package com.tungee.d3_polymorphic_convert;

public class Dog extends Animal {
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
