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
import java.sql.*;
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
                System.out.println("Id: " + student.getId() + ",Name: " + student.getName());
            }
        }
        session.commit();
        session.close();
    }

    @Test
    public void TestMySql(){

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mybatis?useSSL=false";
        String user = "root";
        String password = "123456";
        Connection conn = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,password);
            String string = "SELECT * FROM TB_STUDENT";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(string);
            System.out.println("简单查询：");
            while (resultSet.next()){
                System.out.println("name: " + resultSet.getString("name") +
                        ",id: " + resultSet.getString("id"));
            }

            String prepareString = "SELECT * FROM TB_STUDENT WHERE id = ?";
            preparedStatement = conn.prepareStatement(prepareString);
            preparedStatement.setString(1,"2");
            resultSet = preparedStatement.executeQuery();
            System.out.println("prepareQuery:");
            while (resultSet.next()){
                System.out.println("Id: " + resultSet.getString("id")
                        + ",Name: " + resultSet.getString("name")
                        + ",Age: " + resultSet.getString("age"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
                conn.close();
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}