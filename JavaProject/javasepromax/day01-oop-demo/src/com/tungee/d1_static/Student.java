package com.tungee.d1_static;

public class Student {
    /*
        实例成员变量：无static修饰，属于对象
     */
    private String name;

    /*
        静态成员方法：有static修饰，归属于类，可以被共享访问，用类名或者对象名都可以访问
     */
    public static int getMax(int age1, int age2) {
        return age1 > age2 ? age1 : age2;
    }

    /*
        实例成员方法：无static修饰，属于对象的，只能用对象触发访问
     */
    public void study() {
        System.out.println(name + "正在学习");
    }

    public static void main(String[] args) {
        // 1、类名.静态成员方法
        System.out.println(Student.getMax(1, 2));
        // 注意：同一个类中，访问静态方法，类名可以省略不写
        System.out.println(getMax(1, 22));

        // study();    // 报错了
        // 2、对象.实例方法
        Student s = new Student();
        s.name = "张三";
        s.study();

        // 3、对象.静态成员方法（语法是可行的，但是不推荐）
        System.out.println(s.getMax(3, 5));
    }

}
