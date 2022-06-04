package com.tungee.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
    JDBC快速入门
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception {
        // 1、注册驱动
        // Class.forName("com.mysql.jdbc.Driver");   // MySQL5之后的驱动包，可以省略注册驱动的步骤

        // 2、获取连接
        String url = "jdbc:mysql://124.222.154.126:3306/db1?useSSL=false";
        String userName = "root";
        String password = "12345Ssdlh++.";
        Connection conn = DriverManager.getConnection(url, userName, password);

        // 3、定义sql
        String sql = "update account set money = 2000 where id = 1";

        // 4、获取执行sql的对象  Statement
        Statement stmt = conn.createStatement();

        // 5、执行sql
        int count = stmt.executeUpdate(sql); // 受影响的行数

        // 6、处理结果
        System.out.println(count);

        // 7、释放资源
        stmt.close();
        conn.close();

    }

    @Test // 单元测试方法
    public void testDML() throws Exception {

    }
}
