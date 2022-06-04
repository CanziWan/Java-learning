package com.tungee.d5_collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
    List集合的遍历方法小结
 */
public class ListDemo02 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("java1");
        lists.add("java2");
        lists.add("java3");

        // 1、for循环（List集合才有）
        System.out.println("----------------------");
        for (int i = 0; i < lists.size(); i++) {
            String ele = lists.get(i);
            System.out.println(ele);
        }

        // 2、迭代器
        System.out.println("----------------------");
        Iterator<String> it = lists.iterator();
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }

        // 3、foreach/增强for
        System.out.println("----------------------");
        for (String ele : lists) {
            System.out.println(ele);
        }

        // 4、Lambda表达式
        System.out.println("----------------------");
//        lists.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        lists.forEach(s ->{
                System.out.println(s);
        });
    }
}
