package com.tungee.d12_this;

public class Test {
    public static void main(String[] args) {
        // 目标：理解this(...)的作用：本类构造器中访问本类兄弟构造器
        Student s1 = new Student("张三","瓜大");
        System.out.println(s1.getName());
        System.out.println(s1.getSchoolName());

        /*
             如果学生不填写学校，默认这个对象的学校是Tungee
         */
        Student s2 = new Student("李四");
        System.out.println(s2.getName());
        System.out.println(s2.getSchoolName());

    }
}
