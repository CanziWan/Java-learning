package com.tungee.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历：
    方法一：键找值
 */
public class MapDemo01 {
    public static void main(String[] args) {
        // 添加元素：无序，不重复，无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("哇哈", 30);
        maps.put("iphoneX", 100);
        maps.put("Huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        // {手表=10, 生活用品=10, iphoneX=100, 哇哈=30, Huawei=1000}
        System.out.println(maps);

        // 1、键找值：第一步：先拿到集合的全部键
        Set<String> keys = maps.keySet();
        // 2、第二步：遍历每个键，根据键提取值
        for (String key : keys) {
            int value = maps.get(key);
            System.out.println(key + "====>" + value);
        }

    }
}
