package com.zqc.test;

import com.zqc.domain.User;
import com.zqc.factory.MySqlSessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:17:34
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class UserTest {
    @Test
    public void save() throws Exception {
        System.out.println("start...");
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        System.out.println("go");
        User user = new User("admin", "男", 25);
        session.insert("com.zqc.mapper.UserMapper.save", user);
        session.commit();
        session.close();
    }

    @Test
    public void insert() {
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        User user = new User("zqc", "男", 34);
        session.insert("com.zqc.mapper.UserMapper.insert", user);
        session.commit();
        session.close();
    }

    @Test
    public void select() {
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        User user = session.selectOne("com.zqc.mapper.UserMapper.selectUser", 16);
        System.out.println(user.toString());
        session.commit();
        session.close();
    }

    @Test
    public void update(){
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        User user = session.selectOne("com.zqc.mapper.UserMapper.selectUser",16);
        user.setAge(18);
        user.setName("BigWang");
        session.update("com.zqc.mapper.UserMapper.modifyUser",user);
        session.commit();
        session.close();
    }

    @Test
    public void delete(){
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        session.delete("com.zqc.mapper.UserMapper.removeUser",15);
        session.commit();
        session.close();
    }
}