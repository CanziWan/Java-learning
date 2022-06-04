package com.tungee.d9_api_object;
/*
    目标：掌握Object类中equals方法的使用
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("mike", 'm', 19);
        Student s2 = new Student("mike", 'm', 19);
        // equals默认是比较2个对象的地址是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
    }
}
