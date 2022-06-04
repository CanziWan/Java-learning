package com.tungee.d2_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
    目标：学习Stream流的常用API

          forEach: 逐一处理（遍历）
          count: 统计个数
              - - long count();
          filter: 过滤元素
              - - Stream<T> filter(Predicate<? super T> predicate)
          limit: 取前几个元素
          skip: 跳过前几个
          map: 加工方法
          concat: 合并流
          distinct: 去重复
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张11");
        list.add("周22");
        list.add("赵3");
        list.add("张4");
        list.add("张55");
        list.add("张55");

        // filter: 过滤元素 & forEach: 逐一处理（遍历）
        // Stream<T> filter(Predicate<? super T> predicate);
        list.stream().filter(s -> s.startsWith("张")).forEach(s -> System.out.println(s));

        System.out.println("-----------------------------------------");

        // count: 统计个数
        long size = list.stream().filter(s -> s.length() == 3).count();
        System.out.println(size);

        System.out.println("-----------------------------------------");

        // limit: 取前几个元素
        // list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(s -> System.out.println(s));
        list.stream().filter(s -> s.startsWith("张")).limit(2).forEach(System.out::println); // 方法引用写法

        System.out.println("-----------------------------------------");

        // skip: 跳过前几个
        list.stream().filter(s -> s.startsWith("张")).skip(2).forEach(System.out::println); // 方法引用写法

        System.out.println("-----------------------------------------");

        // Map加工方法：第一个参数原材料 -> 第二个参数是加工后的结果
        // 给集合元素的前面都加上一个：  TUNGEE的：
        list.stream().map(s -> "TUNGEE的：" + s).forEach(System.out::println);

        // 需求：把所有的名称 都加工成一个学生对象
        // list.stream().map(s -> new Student(s)).forEach(s -> System.out.println(s));
        list.stream().map(Student::new).forEach(System.out::println); // 构造器引用  方法引用

        System.out.println("-----------------------------------------");

        // concat: 合并流
        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        Stream<String> s2 = Stream.of("Java1", "Java2");
        // public static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
        Stream<String> s3 = Stream.concat(s1, s2);
        // distinct: 去重复
        s3.distinct().forEach(System.out::println);

    }
}
