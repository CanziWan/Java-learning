package com.tungee.d3_collections;

import java.util.*;

public class CollectionsDemo01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        // names.add("Java");
        // names.add("tungee");
        // names.add("nwpu");
        // names.add("MySQL");
        // 1、批量添加数据
        Collections.addAll(names,"Java", "tungee", "nwpu", "MySQL");
        System.out.println(names);

        // 2、public static void shuffle(List<?> list):打乱集合顺序
        Collections.shuffle(names);
        System.out.println(names);

        // 3、public static void sort(List<T> list):将集合中元素按默认规则进行排序（排值特性的元素）
        List<Integer> list = new ArrayList<>();
//        list.add(23);
//        list.add(24);
//        list.add(12);
//        list.add(8);
        Collections.addAll(list, 23, 24, 12, 8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
