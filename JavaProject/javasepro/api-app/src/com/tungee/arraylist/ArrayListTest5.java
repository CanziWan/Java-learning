package com.tungee.arraylist;

import java.util.ArrayList;

/*
    案例：集合存储自定义元素并遍历
 */
public class ArrayListTest5 {
    public static void main(String[] args) {
        // 1、定义电影类
        // 2、创建三个电影对象
        Movie m1 = new Movie("《肖申克的救赎》", 9.7, "罗宾斯");
        Movie m2 = new Movie("《霸王别姬》", 9.6, "张国荣、张丰毅");
        Movie m3 = new Movie("《阿甘正传》", 9.5, "汤姆.汉克斯");
        // 3、创建一个电影类型的ArrayList集合，存储三部电影对象
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        System.out.println(movies);
        // 4、遍历电影类型的集合中的每个电影对象，访问它的信息即可
        for (int i = 0; i < movies.size(); i++) {
            // i = 0 1 2
            Movie m = movies.get(i);
            System.out.println("电影名称：" + m.getName());
            System.out.println("电影得分：" + m.getScore());
            System.out.println("电影主演：" + m.getActor());
            System.out.println("----------------------------");
        }
    }
}
