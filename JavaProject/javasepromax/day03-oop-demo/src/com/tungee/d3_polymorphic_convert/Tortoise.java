package com.tungee.d3_polymorphic_convert;

public class Tortoise extends Animal {
    @Override
    public void run() {
        System.out.println("🐢 can't run ...");
    }

    /*
        独有功能
     */
    public void layEggs() {
        System.out.println("Tortoise is laying eggs!");
    }
}
