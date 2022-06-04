package com.tungee.d9_map_impl;

import com.tungee.d1_set.Apple;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/*
    TreeMap集合的排序方法：
    1.自带排序（默认对键进行排序）
    2.键的类中重写compareTo方法
    3.TreeMap类中的构造器自带Comparator接口（就近原则：2和3共存时，默认使用3）
 */
public class TreeMapDemo3 {
    public static void main(String[] args) {
        // TreeMap集合自带排序（对键进行排序）
        Map<Integer, String> maps1 = new TreeMap<>();
        maps1.put(10, "李四");
        maps1.put(1, "张三");
        maps1.put(3, "王五");
        System.out.println(maps1);

        // TreeMap集合自定义排序规则    可排序，不重复（只要大小规则一样就认为重复），无索引
        Map<Apple, String> maps2 = new TreeMap<>(new Comparator<Apple>() {
            @Override
            public int compare(Apple o1, Apple o2) {
                return Double.compare(o2.getPrice(), o1.getPrice()); // 按照价格进行降序排序
            }
        });
        maps2.put(new Apple("红富士", "红色", 9.9, 500), "山东");
        maps2.put(new Apple("青苹果", "绿色", 15.9, 300), "广州");
        maps2.put(new Apple("绿苹果", "青色", 29.9, 400), "江西");
        maps2.put(new Apple("黄苹果", "黄色", 9.8, 500), "湖北");
        System.out.println(maps2);

    }
}
