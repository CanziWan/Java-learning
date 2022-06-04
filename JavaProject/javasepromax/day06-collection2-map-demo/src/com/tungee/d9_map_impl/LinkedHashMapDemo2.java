package com.tungee.d9_map_impl;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class LinkedHashMapDemo2 {
    public static void main(String[] args) {
        // 1、创建一个Map集合对象
        Map<String, Integer> maps = new LinkedHashMap<>(); // 有序，不重复，无索引
        maps.put("Iphone", 3);
        maps.put("Java", 1);
        maps.put("MacBook Pro", 100);
        maps.put("Java", 100); // 覆盖前面的数据
        maps.put(null, null);
        System.out.println(maps);
    }
}
