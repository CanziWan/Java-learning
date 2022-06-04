package com.tungee.d2_collection_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        // HashSet:添加的元素是无序，不重复，无索引
        Collection<String> c = new ArrayList<>();

        // 1、添加元素，添加成功返回true
        c.add("Java");
        c.add("HTML");
        System.out.println(c.add("HTML"));
        c.add("MySQL");
        c.add("Java");
        System.out.println(c.add("tungee"));
        System.out.println(c);

        // 2、清空集合的元素
        // c.clear();
        // System.out.println(c);

        // 3、判断集合是否为空 是空返回true，反之。
        // System.out.println(c.isEmpty());

        // 4、获取集合的大小
        System.out.println(c.size());

        // 5、判断集合中是否包含某个元素
        System.out.println(c.contains("Java")); // true
        System.out.println(c.contains("java")); // false
        System.out.println(c.contains("tungee")); // true

        // 6、删除某个元素：如果有多个重复元素默认删除前面的第一个！
        System.out.println(c.remove("java")); // false
        System.out.println(c);
        System.out.println(c.remove("Java")); // true
        System.out.println(c);

        // 7、把集合转换成数组   [HTML, HTML, MySQL, Java, tungee]
        Object[] arrs = c.toArray();
        System.out.println("数组：" + Arrays.toString(arrs));

        System.out.println("-----------------------------拓展------------------------------");

        Collection<String> c1 = new ArrayList<>();
        c1.add("java1");
        c1.add("java2");

        Collection<String> c2 = new ArrayList<>();
        c2.add("tungee");
        c2.add("NWPU");

        // addAll 把c2集合中的元素全部添加到c1中去
        c1.addAll(c2);

        System.out.println(c1);
        System.out.println(c2);

    }
}
