package com.tungee.d8_map_test;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/*
    需求：统计投票人数（每人只能选择一个景点）
 */
public class MapTest1 {
    public static void main(String[] args) {
        // 1、把80个学生选择的数据拿进来
        String[] selects = {"A", "B", "C", "D"};
        StringBuilder sb = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 80; i++) {
            sb.append(selects[r.nextInt(selects.length)]);
        }
        System.out.println(sb);

        // 2、定义一个Map集合记录最终统计的结果： A = 30, B = 20, C = 20, D = 10    键是景点，值是选择的数量
        Map<Character, Integer> infos = new HashMap<>(); // {}

        // 3、遍历80个学生选择的数据
        for (int i = 0; i < sb.length(); i++) {
            // 4、提取当前选择景点的字符
            char ch = sb.charAt(i);
            // 5、判断Map集合中是否存在这个键
            if (infos.containsKey(ch)) {
                // 让其值 + 1
                infos.put(ch, infos.get(ch) + 1);
            }else {
                // 说明此景点第一次被选
                infos.put(ch, 1);
            }
        }

        // 4、输出Map集合
        System.out.println(infos);

    }
}
