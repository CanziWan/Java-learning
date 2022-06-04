package com.tungee.memory;

public class Test {
    public static void main(String[] args) {
        // 创建学生对象
        Student s1 = new Student();
        s1.name = "xiaoming";
        s1.sex = '男';
        s1.hobby = "打篮球";
        s1.study();

        // 把s1变量赋值给一个学生类型的变量s2
        Student s2 = s1;
        System.out.println(s1);
        System.out.println(s2);

        s2.hobby = "打羽毛球";
        System.out.println(s2.name);
        System.out.println(s2.sex);
        System.out.println(s1.hobby);
        s2.study();

    }
}
