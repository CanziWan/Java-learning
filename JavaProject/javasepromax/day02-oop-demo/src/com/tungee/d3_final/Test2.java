package com.tungee.d3_final;

public class Test2 {

    /*
        二、修饰静态成员变量（public static final修饰的也称为常量了）
     */
    public static final String schoolName = "瓜大";

    /*
        三、修饰实例成员变量（几乎不用）
     */
    private final String name = "张三";

    public static void main(String[] args) {
        // 目标：理解final修饰变量的作用：3、final修饰变量，总规则：变量有且仅能被赋值一次（理解语法）
        // 变量有几种：
        // 1、局部变量
        // 2、成员变量
        //        --- 实例成员变量
        //        --- 静态成员变量

        // 一、修饰局部变量
        final double rate = 3.14;
        // rate = 3.15; // 报错，第二次赋值
        buy(0.8);

        // schoolName = "西工大"; // 报错，第二次赋值

        Test2 t = new Test2();
        System.out.println(t.name);
        // t.name = "李四";  // 报错，第二次赋值

        // 注意：final修饰引用类型的变量，其地址值不能改变，但是指向的对象的内容可以改变的
        final Teacher teacher = new Teacher("学习");
        // teacher = null; // 报错，第二次赋值
        System.out.println(teacher.getHobby());
        teacher.setHobby("运动");
        System.out.println(teacher.getHobby());
    }

    public static void buy(final double z) {
        // z = 0.1;    // 报错，第二次赋值
    }
}


class Teacher {
    private String hobby;

    public Teacher(String hobby) {
        this.hobby = hobby;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
