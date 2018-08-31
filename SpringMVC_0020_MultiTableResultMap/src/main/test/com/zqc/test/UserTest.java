package com.zqc.test;

import com.zqc.domain.Clazz;
import com.zqc.domain.Student;
import com.zqc.domain.User;
import com.zqc.factory.MySqlSessionFactory;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

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
    public void select() {
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        User user = session.selectOne("com.zqc.mapper.UserMapper.selectUser", 16);
        System.out.println(user.toString());
        session.commit();
        session.close();
    }

    @Test
    public void SelectMapTest_3() {
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        List<User> list = session.selectList("com.zqc.mapper.UserMapper.selectUserAll_3");
        for (User user : list) {
            System.out.println(user);
        }
        session.commit();
        session.close();
    }

    @Test
    public void SelectStudentAll(){
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        List<Student> studentList = session.selectList("com.zqc.mapper.UserMapper.selectStudent");
        for (Student student: studentList) {
            System.out.println(student);
        }
        session.commit();
        session.close();
    }

    @Test
    public void selectClazz(){
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        List<Clazz> clazzList = session.selectList("com.zqc.mapper.UserMapper.selectClazz");
        for (Clazz clazz: clazzList) {
            System.out.println(clazz);
            List<Student> studentList = clazz.getStudents();
            for (Student student: studentList) {
                System.out.println(student);
            }
        }
        session.commit();
        session.close();
    }
}