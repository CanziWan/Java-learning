package com.tungee.d6_map_api;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合体系常用API
 */
public class MapDemo {
    public static void main(String[] args) {
        // 1、添加元素：无序，不重复，无索引
        Map<String, Integer> maps = new HashMap<>();
        maps.put("iphoneX", 10);
        maps.put("哇哈哈", 20);
        maps.put("iphoneX", 100); // Map集合后面重复的键对应的元素会覆盖前面重复的整个元素！
        maps.put("huawei", 100);
        maps.put("生活用品", 10);
        maps.put("手表", 10);
        // {huawei=1000, 手表=10, 生活用品=10, iphoneX=100, 哇哈哈=20}
        System.out.println(maps);

        // 2、清空集合
//        maps.clear();
//        System.out.println(maps);

        // 3、判断集合是否为空，为空则返回true，反之
        System.out.println(maps.isEmpty());

        // 4、根据键获取对应值：public V get(Object key)
        Integer key = maps.get("huawei");
        System.out.println(key);
        System.out.println(maps.get("iphoneX")); // 100
        System.out.println(maps.get("iphone")); // null

        // 5、根据键删除整个元素（删除键会返回键的值）
        System.out.println(maps.remove("iphoneX")); // 100
        System.out.println(maps);

        // 6、判断是否包含某个键，包含返回true，反之
        System.out.println(maps.containsKey("哇哈哈")); // true
        System.out.println(maps.containsKey("iphoneX")); // false
        System.out.println(maps.containsKey("ipho")); // false

        // 7、判断是否包含某个值
        System.out.println(maps.containsValue(100)); // true
        System.out.println(maps.containsValue(10)); // true
        System.out.println(maps.containsValue(22)); // false

        // maps = {huawei=100, 手表=10, 生活用品=10, 哇哈哈=20}
        // 8、获取全部键的集合：public Set<K> keySet()
        Set<String> keys = maps.keySet();
        System.out.println(keys);

        System.out.println("----------------------------------------------------------");
        // 9、获取全部值的集合：Collection<V> values();
        Collection<Integer> values = maps.values();
        System.out.println(values);

        // 10、集合的大小
        System.out.println(maps.size());

        // 11、合并其他Map集合（拓展）
        Map<String , Integer> map1 = new HashMap<>();
        map1.put("Java1", 1);
        map1.put("Java2", 100);
        Map<String , Integer> map2 = new HashMap<>();
        map2.put("Java2", 1);
        map2.put("Java3", 100);
        map1.putAll(map2); // 把集合map2的元素拷贝一份到map1中去
        System.out.println(map1);
        System.out.println(map2);

    }
}
