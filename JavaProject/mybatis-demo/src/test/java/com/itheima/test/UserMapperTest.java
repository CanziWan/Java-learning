package com.itheima.test;

import com.itheima.mapper.BrandMapper;
import com.itheima.mapper.UserMapper;
import com.itheima.pojo.Brand;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;

public class UserMapperTest {
    @Test
    public void testSelect() throws IOException {
        // 1、加载 MyBatis 核心配置文件，获取 SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2、获取 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3、获取 Mapper 接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 4、执行方法
        String username = "zhangsan";
        String password = "123";

        // User user = userMapper.select(username, password);
        User user = userMapper.select(new HashSet());

        System.out.println(user);

        // 5、释放资源
        sqlSession.close();
    }

    @Test
    public void testSelectById() throws IOException {
        // 1、加载 MyBatis 核心配置文件，获取 SqlSessionFactory 对象
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2、获取 SqlSession 对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3、获取 Mapper 接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 4、执行方法
        User user = userMapper.selectById(1);

        System.out.println(user);

        // 5、释放资源
        sqlSession.close();
    }
}
