package com.tungee.d6_collection_update_delete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test {
    public static void main(String[] args) {
        // 1、准备数据
        List<String> list = new ArrayList<>();
        list.add("tungee");
        list.add("Java");
        list.add("Java");
        list.add("zhang");
        list.add("zhang");
        list.add("li");
        System.out.println(list);
        // [tungee, Java, Java, zhang, zhang, li]
        //    it

        // 需求：删除全部的Java信息
        // a、迭代器遍历删除（可以解决并发修改异常）
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            String ele = it.next();
//            if (ele.equals("Java")) {
//                // list.remove("Java");     // ConcurrentModificationException
//                it.remove(); // 使用迭代器删除当前位置的元素，保证不后移，能够成功遍历到全部元素
//            }
//        }
//        System.out.println(list);

        // b、foreach遍历删除（无法解决并发修改异常）
//        for (String s : list) {
//            if (s.equals("Java")) {
//                list.remove("Java");     // ConcurrentModificationException
//            }
//        }

        // c、Lambda表达式（无法解决并发修改异常）
//        list.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                if (s.equals("Java")) {
//                    list.remove("Java");     // ConcurrentModificationException
//                }
//            }
//        });

//        list.forEach(s -> {
//            if (s.equals("Java")) {
//                list.remove("Java");     // ConcurrentModificationException
//            }
//        });

        // d、for循环（不会出现并发修改异常,但是数据删除出现了问题:会漏删元素）
//        for (int i = 0; i < list.size(); i++) {
//            String ele = list.get(i);
//            if (ele.equals("Java")) {
//                list.remove("Java");
//            }
//        }
//        System.out.println(list);

        // for循环删除解决方案一:从后往前删
        // [tungee, Java, Java, zhang, zhang, li]
        //                                    i
//        for (int i = list.size() - 1; i >= 0; i--) {
//            String ele = list.get(i);
//            if (ele.equals("Java")) {
//                list.remove("Java");
//            }
//        }
//        System.out.println(list);

        // for循环删除解决方案二:从前往后删,每删除一个元素i自减1
        // [tungee, Java, Java, zhang, zhang, li]
        //     i
        for (int i = 0; i < list.size(); i++) {
            String ele = list.get(i);
            if (ele.equals("Java")) {
                list.remove("Java");
                i--;
            }
        }
        System.out.println(list);

    }
}
