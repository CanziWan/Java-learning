package com.tungee.d4_polymorphic_test;
/*
    实现类
 */
public class Mouse implements USB {
    private String name;

    public Mouse(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println(name + "\tjie ru");
    }

    /*
        独有功能
     */
    public void dbClick() {
        System.out.println(name + "\tdb click the window!");
    }

    @Override
    public void unconnect() {
        System.out.println(name + "\tba chu");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
