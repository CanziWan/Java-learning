package com.tungee.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/*
    结合Lambda表达式进行循环
 */
public class CollectionDemo03 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("NWPU");
        lists.add("MyBatis");
        lists.add("MySQL");
        System.out.println(lists);
        // [Java, NWPU, MyBatis, MySQL]
        //   s

//        lists.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        lists.forEach(s -> {
//                System.out.println(s);
//        });

        // lists.forEach(s -> System.out.println(s));

        lists.forEach(System.out::println); // 方法引用

    }
}
