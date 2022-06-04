package com.tungee.d2_stream;

import java.util.*;
import java.util.stream.Stream;

/*
    集合获取Stream流： stream();
    数组获取Stream流： Arrays.stream(数组); / Stream.of(数组);
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        /** ----------------- Collection集合获取Stream流 ------------------- **/
        Collection<String> list = new ArrayList<>();
        Stream<String> s = list.stream();


        /** -------------------- Map集合获取Stream流 ----------------------- **/
        Map<String, Integer> maps = new HashMap<>();
        // 键流
        Stream<String> keyStream = maps.keySet().stream();
        // 值流
        Stream<Integer> valueStream = maps.values().stream();
        // 键值对流（拿整体）
        Stream<Map.Entry<String, Integer>> keyAndValueStream = maps.entrySet().stream();

        /** --------------------- 数组获取Stream流 ------------------------ **/
        // 法一：
        String[] names = {"张三", "李四", "王五", "娃哈哈"};
        Stream<String> nameStream = Arrays.stream(names);
        // 法二：
        Stream<String> nameStream2 = Stream.of(names);
    }
}
