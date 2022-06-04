package com.tungee.overload;

public class MethodDemo1 {
    public static void main(String[] args) {
        fire();
        fire("daoguo");
        fire("fao", 2);
    }

    public static void fire() {
//        System.out.println("默认发射1枚武器给米guo");
        fire("米guo");
    }

    public static void fire(String location) {
//        System.out.println("向" + location + "发射1枚武器");
        fire(location, 1);
    }

    public static void fire (String location, int num) {
        System.out.println("向" + location + "发射" + num + "枚武器");
    }
}
