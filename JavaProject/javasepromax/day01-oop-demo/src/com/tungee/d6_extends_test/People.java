package com.tungee.d6_extends_test;
/*
    父类
 */
public class People {
    private String name;
    private int age;

    /*
        查看课程表
     */
    public void queryCourse() {
        System.out.println(name + "在查看课程表！");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
