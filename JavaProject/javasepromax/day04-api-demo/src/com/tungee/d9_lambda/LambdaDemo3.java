package com.tungee.d9_lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo3 {
    public static void main(String[] args) {
        // 案例一：
        Integer[] ages1 = {34, 12, 42, 23};
        /*
            参数一：被排序的数组 必须是引用类型的元素
            参数二：匿名内部类对象，代表了一个比较器对象
         */
//        Arrays.sort(ages1, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2 - o1; // 降序
//            }
//        });

//        Arrays.sort(ages1, (Integer o1, Integer o2) -> {
//                return o2 - o1; // 降序
//            }
//        );

//        Arrays.sort(ages1, (o1, o2) -> {
//                return o2 - o1; // 降序
//            }
//        );

        Arrays.sort(ages1, (o1, o2) -> o2 - o1 ); // 降序
        System.out.println(Arrays.toString(ages1));


        System.out.println("----------------------------------------");

        // 案例二：
        JFrame win = new JFrame("LoginPage");

        JButton btn = new JButton("button");
//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Hello World!");
//            }
//        });

//        btn.addActionListener((ActionEvent e) -> {
//                System.out.println("Hello World!");
//            }
//        );

//        btn.addActionListener((e) -> {
//                System.out.println("Hello World!");
//            }
//        );

//        btn.addActionListener(e -> {
//                System.out.println("Hello World!");
//            }
//        );

        btn.addActionListener(e -> System.out.println("Hello World!"));

        win.add(btn);
        win.setSize(400, 300);
        win.setVisible(true);
    }
}
