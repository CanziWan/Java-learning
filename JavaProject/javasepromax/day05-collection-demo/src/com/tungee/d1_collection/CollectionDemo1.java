package com.tungee.d1_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
    目标：明确Collection集合体系的特点
 */
public class CollectionDemo1 {
    public static void main(String[] args) {
        // List 有序 可重复 有索引
        Collection list = new ArrayList();
        list.add("Java");
        list.add("Java");
        list.add("MyBatis");
        list.add(23);
        list.add(23);
        list.add(false);
        list.add(false);
        System.out.println(list);

        // Set 无序 不重复 无索引
        Collection list1 = new HashSet();
        list1.add("Java");
        list1.add("Java");
        list1.add("MyBatis");
        list1.add(23);
        list1.add(23);
        list1.add(false);
        list1.add(false);
        System.out.println(list1);

        System.out.println("---------------------------------------");

        // Collection<String> list2 = new ArrayList<String>();
        Collection<String> list2 = new ArrayList<>();   // JDK 1.7 之后，后面类型申明可以不写
        list2.add("Java");
        // list2.add(23);
        list2.add("tungee");

        // 集合和泛型不支持基本数据类型，只能支持引用数据类型
        // Collection<int> list3 = new ArrayList<>();
        Collection<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(233);
        list3.add(2333);

        Collection<Double> list4 = new ArrayList<>();
        list4.add(23.4);
        list4.add(233.0);
        list4.add(2333.3);

    }
}
