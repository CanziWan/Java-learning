package com.tungee.d3_collection_traversal;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/*
    利用迭代器进行集合的循环
 */
public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("tungee");
        lists.add("NWPU");
        lists.add("zhang");
        lists.add("li");
        System.out.println(lists);
        // [tungee, NWPU, zhang, li]
        //    it

        // 1、得到当前集合的迭代器对象
        Iterator<String> it = lists.iterator();
//        String ele = it.next();
//        System.out.println(ele);
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
        // System.out.println(it.next()); // NoSuchElementException 出现无此元素异常的错误

        // 2、定义while循环
        while (it.hasNext()) {
            String ele = it.next();
            System.out.println(ele);
        }

        System.out.println("-----------------------------------");

    }
}
