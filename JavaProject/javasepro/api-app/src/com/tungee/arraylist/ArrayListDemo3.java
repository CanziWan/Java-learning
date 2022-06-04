package com.tungee.arraylist;

import java.util.ArrayList;

/*
    目标：掌握ArrayList集合的常用API
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java");
        list.add("MySQL");
        list.add("MyBatis");
        list.add("HTML");

        System.out.println("-----------1--------------");

        // 1、获取某个索引位置处的元素值
        String e = list.get(3);
        System.out.println(e);

        System.out.println("-----------2--------------");

        // 2、获取集合的大小（元素个数）
        int size = list.size();
        System.out.println(size);

        System.out.println("-----------3--------------");

        // 3、完成集合的遍历
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        System.out.println("-----------4--------------");

        // 4、删除某个索引位置处的元素值，并返回被删除的元素值
        System.out.println(list);  // [Java, Java, MySQL, MyBatis, HTML]
        String e2 = list.remove(2);
        System.out.println(e2);
        System.out.println(list);

        System.out.println("-----------5--------------");

        // 5、直接删除元素值，删除成功返回true，删除失败返回false
        System.out.println(list.remove("MyBatis"));
        System.out.println(list);
        System.out.println(list.remove("Java"));
        System.out.println(list);

        System.out.println("-----------6--------------");

        // 6、修改某个索引位置处的元素值
        System.out.println(list);
        String s = list.set(0, "MySQL");
        System.out.println(s);
        System.out.println(list);

    }
}
