package com.itheima;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
    MyBatis 代理开发
 */
public class MyBatisDemo2 {
    public static void main(String[] args) throws IOException {
        // 1、加载 MyBatis 核心配置文件，获取 SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2、获取SqlSession对象，用它来执行SQL
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3、执行SQL
        // List<User> users = sqlSession.selectList("test.selectAll");
        // 3.1 获取 UserMapper 接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectAll();

        System.out.println(users);

        // 4、释放资源
        sqlSession.close();

    }
}
