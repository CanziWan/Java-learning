package com.tungee.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的遍历：
    方法二：键值对
 */
public class MapDemo02 {
    public static void main(String[] args) {
        // 添加元素：无序，不重复，无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("哇哈哈", 30);
        maps.put("iphoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        // maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 哇哈哈=30}
        System.out.println(maps);

        /*
            maps = {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 哇哈哈=30}

            使用foreach遍历Map集合，发现Map集合的键值对元素是没有类型的，所以不可以直接用foreach遍历集合

            可以通过调用Map的方法 entrySet() 把Map集合转成Set集合形式 maps.entrySet();

            Set<Map.Entry<String, Integer>> entries = maps.entrySet();
            [(huawei=1000), (手表=10), (生活用品=10), (iphoneX=100), (哇哈哈=30)]
                 entry

            此时可以使用foreach遍历了
         */

        // 1、把Map集合转换成Set集合
        Set<Map.Entry<String, Integer>> entries = maps.entrySet();
        // 2、开始遍历
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + "====>" + value);
        }

    }
}
