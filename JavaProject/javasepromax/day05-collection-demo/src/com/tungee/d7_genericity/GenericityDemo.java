package com.tungee.d7_genericity;

import java.util.ArrayList;
import java.util.List;

public class GenericityDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java2");
        // list.add(23);

        List list1 = new ArrayList();
        list1.add("Java");
        list1.add(23.3);
        list1.add(false);
        list1.add("Spring");

//        for (Object o : list1) {
//            String ele = (String) o;     // ClassCastException
//            System.out.println(ele);
//        }

        System.out.println("-------------------------------------");

        // 存储任意类型的数据
        List<Object> list2 = new ArrayList<>();
        list2.add(23);
        list2.add(23.3);
        list2.add("Java");

        // List<int> list3 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();

    }
}
