package com.tungee.d7_map_traversal;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/*
    Map集合的遍历：
    方法三：Lambda表达式（JDK 8 之后）（多用）
 */
public class MapDemo03 {
    public static void main(String[] args) {
        // 添加元素：无序，不重复，无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("哈哈", 30);
        maps.put("iphoneX", 100);
        maps.put("huawei", 1000);
        maps.put("生活用品", 10);
        maps.put("手环", 10);
        // maps = {huawei=1000, 生活用品=10, 手环=10, iphoneX=100, 哈哈=30}
        System.out.println(maps);

//        maps.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String key, Integer value) {
//                System.out.println(key + "===>" + value);
//            }
//        });

        // 简化
        maps.forEach((key, value) -> {
                System.out.println(key + "===>" + value);
        });
    }
}
