package com.tungee.d5_map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/*
    目标：认识Map集合体系的特点：按照键  无序，不重复，无索引 ；值不做要求
 */
public class MapDemo1 {
    public static void main(String[] args) {
        // 1、创建一个Map集合对象
        // Map<String, Integer> maps = new HashMap<>(); // 一行经典代码（多态）
        Map<String, Integer> maps = new LinkedHashMap<>();
        maps.put("Iphone", 3);
        maps.put("Java", 1);
        maps.put("MacBook Pro", 100);
        maps.put("Java", 100); // 覆盖前面的数据
        maps.put(null, null);
        System.out.println(maps);
    }
}
