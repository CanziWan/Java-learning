package com.tungee.d7_innerclass;
/*
    目标：了解局部内部类的语法
 */
public class Test {

    static {
        class Dog {

        }

        abstract class Animal {

        }

//        interface SportManInter {     // JDK 16 开始支持
//
//        }
    }

    public static void main(String[] args) {
        class Cat {
            private String name;

            // public static int onLineNumber = 100;    // JDK 15 后开始支持的

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        Cat c = new Cat();
        c.setName("ding dang cat");
        System.out.println(c.getName());
    }
}
