package com.tungee.d9_map_impl;

import com.tungee.d1_set.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
    public static void main(String[] args) {
        // Map集合是根据键去除重复元素
        Map<Student, String> maps = new HashMap<>();

        Student s1 = new Student("张三", 20, '男');
        Student s2 = new Student("张三", 20, '男');
        Student s3 = new Student("李四", 12, '男');

        maps.put(s1, "北京");
        maps.put(s2, "上海");
        maps.put(s3, "广州");

        System.out.println(maps);
    }
}
