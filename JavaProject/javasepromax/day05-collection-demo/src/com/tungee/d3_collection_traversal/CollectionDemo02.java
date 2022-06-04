package com.tungee.d3_collection_traversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
/*
    foreach/增强for循环（数组/集合）
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> lists = new ArrayList<>();
        lists.add("Java");
        lists.add("NWPU");
        lists.add("zhang");
        lists.add("li");
        System.out.println(lists);
        // [Java, NWPU, zhang, li]
        //   ele

        for (String ele : lists) {
            System.out.println(ele);
        }

        System.out.println("----------------------------");

        double[] scores = {100, 99.5, 59.5};
        for (double score : scores) {
            System.out.println(score);
//            if (score == 99.5) {
//                score = 100;      // 修改无意义，不会影响数组的元素值
//            }
        }
        System.out.println(Arrays.toString(scores));

    }
}
