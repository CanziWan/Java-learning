package com.tungee.demo;
/*
    目标：完成电影信息的展示案例，理解面向对象编程的代码

    "《长津湖》", 9.7, "吴京"
    "《我和我的父亲》", 9.6, "吴京"
    "《扑水少年》", 9.5, "王川"
 */
public class Test {
    public static void main(String[] args) {
        // 1、设计电影类
        // 2、创建3个电影对象，封装电影的信息
        // 3、定义一个电影类型的数组，存储3部电影
        Movie[] movies = new Movie[3];
        movies[0] = new Movie( "《长津湖》", 9.7, "吴京");
        movies[1] = new Movie( "《我和我的父亲》", 9.6, "吴京");
        movies[2] = new Movie( "《扑水少年》", 9.5, "王川");

        // 4、遍历数组中的每个电影对象，然后获取它的信息展示出来
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println(m);
            System.out.println("电影名称：" + m.getName());
            System.out.println("电影评分：" + m.getScore());
            System.out.println("电影主演：" + m.getActor());
            System.out.println("----------------------------------------");
        }
    }
}
