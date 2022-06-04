package com.tungee.d1_static;

public class User {
    /*
        在线人数
        注意：static修饰的成员变量：静态成员变量，只在内存中有一份，可以被共享
     */
    public static int onlineNumber = 161;

    /*
        实例成员变量：无static修饰，属于每个对象的
     */
    private String name;
    private int age;
}
