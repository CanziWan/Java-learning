package com.tungee.d3_collections;

import java.util.*;

public class CollectionsDemo02 {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>(); // 可以重复
        apples.add(new Apple("红富士", "红色", 9.9, 500));
        apples.add(new Apple("青苹果", "绿色", 15.9, 300));
        apples.add(new Apple("绿苹果", "青色", 29.9, 401));
        apples.add(new Apple("黄苹果", "黄色", 9.8, 500));

        // 方法一：类中自定义比较规则
//        Collections.sort(apples); // 可以，Apple类已经重写了比较规则
//        System.out.println(apples);

        // 方法二：sort方法自带比较器对象
//        Collections.sort(apples, new Comparator<Apple>() {
//            @Override
//            public int compare(Apple o1, Apple o2) {
//                return Double.compare(o1.getPrice(), o2.getPrice()); // 按照价格升序排序
//            }
//        });

        // 简化
        Collections.sort(apples, (o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice())); // 按照价格升序排序
        System.out.println(apples);
    }
}
