package com.tungee.d1_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
        // 了解Set系列集合的特点: HashSet  LinkedHashSet  TreeSet
        Set<String> sets = new LinkedHashSet<>(); // 有序,不重复,无索引
        sets.add("MySQL");
        sets.add("MySQL");
        sets.add("Java");
        sets.add("Java");
        sets.add("HTML");
        sets.add("HTML");
        sets.add("SpringBoot");
        sets.add("SpringBoot");
        System.out.println(sets);
    }
}
