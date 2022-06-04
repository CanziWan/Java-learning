package com.tungee.d6_extends_test;

public class Test {
    public static void main(String[] args) {
        // 目标：理解继承的设计思想
        Student student = new Student();
        student.setName("张三");  // 使用父类的
        student.setAge(99); // 使用父类的
        System.out.println(student.getName());  // 使用父类的
        System.out.println(student.getAge());   // 使用父类的
        student.queryCourse();  // 使用父类的
        student.writeInfo();    // 子类的方法

    }
}
