package com.tungee.d6_innerclass;
/*
    外部类
 */
public class Outer {
    public static int num = 100;
    private String hobby;

    public Outer() {
    }

    public Outer(String hobby) {
        this.hobby = hobby;
    }

    /*
            成员内部类：不能加static修饰，属于外部类对象的
         */
    public class Inner {
        private String name;
        private int age;
        // public static int a = 100;    // JDK 16 开始支持静态成员了

//        public static void test() {    // JDK 16 开始支持静态成员了
//            System.out.println(a);
//        }

        public void show() {
            System.out.println("name:" + name);
            System.out.println("num:" + num);
            System.out.println("hobby:" + hobby);
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
}
