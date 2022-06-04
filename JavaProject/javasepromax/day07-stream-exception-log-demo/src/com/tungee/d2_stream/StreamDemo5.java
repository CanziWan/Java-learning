package com.tungee.d2_stream;

import java.util.*;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
    目标：收集Stream流的数据到  集合或者数组  中去
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张11");
        list.add("周22");
        list.add("赵3");
        list.add("张4");
        list.add("张55");
        list.add("张55");

        Stream<String> s1 = list.stream().filter(s -> s.startsWith("张"));
        List<String> zhangList = s1.collect(Collectors.toList());
        zhangList.add("Java1");
        System.out.println(zhangList);

        // 注意注意注意：“流只能使用1次”
        Stream<String> s2 = list.stream().filter(s -> s.startsWith("张"));
        Set<String> zhangSet = s2.collect(Collectors.toSet());
        System.out.println(zhangSet);

        Stream<String> s3 = list.stream().filter(s -> s.startsWith("张"));
        // Object[] arrs = s3.toArray();
//        String[] arrs = s3.toArray(new IntFunction<String[]>() {
//            @Override
//            public String[] apply(int value) {
//                return new String[value];
//            }
//        });
        String[] arrs = s3.toArray(String[]::new);
        System.out.println("Arrays数组内容：" + Arrays.toString(arrs));

    }
}
