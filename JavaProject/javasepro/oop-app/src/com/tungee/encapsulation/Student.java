package com.tungee.encapsulation;
/*
    定义一个学生类
 */
public class Student {
    // 1、成员变量 使用private修饰，只能在本类中访问了
    private int age;

    /*
        2、提供成套的getter和setter方法暴露其取值和赋值
     */
    public void setAge(int age){
        if(age >= 0 && age <= 200) {
            this.age = age;
        }else {
            System.out.println("您的年龄数据有问题！");
        }
    }

    public int getAge(){
        return age;
    }
}
