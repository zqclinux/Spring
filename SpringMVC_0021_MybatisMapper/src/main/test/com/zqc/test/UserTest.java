package com.zqc.test;


import com.zqc.domain.Clazz;
import com.zqc.domain.Person;
import com.zqc.domain.Student;
import com.zqc.factory.MySqlSessionFactory;
import com.zqc.mapper.ClazzMapper;
import com.zqc.mapper.PersonMapper;
import com.zqc.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.sql.*;
import java.util.List;

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
    public void TestMySql() {

        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/mybatis?useSSL=false";
        String user = "root";
        String password = "123456";
        Connection conn = null;
        Statement statement = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            String string = "SELECT * FROM TB_STUDENT";
            statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery(string);
            System.out.println("简单查询：");
            while (resultSet.next()) {
                System.out.println("name: " + resultSet.getString("name") +
                        ",id: " + resultSet.getString("id"));
            }

            String prepareString = "SELECT * FROM TB_STUDENT WHERE id = ?";
            preparedStatement = conn.prepareStatement(prepareString);
            preparedStatement.setString(1, "2");
            resultSet = preparedStatement.executeQuery();
            System.out.println("prepareQuery:");
            while (resultSet.next()) {
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

    @Test
    public void TestOne2One() {
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        PersonMapper personMapper = session.getMapper(PersonMapper.class);
        Person person = personMapper.selectPersonById(1);
        System.out.println(person);
        session.commit();
        session.close();
    }


    @Test
    public void TestOne2More() {
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        ClazzMapper clazzMapper = session.getMapper(ClazzMapper.class);
        Clazz clazz = clazzMapper.selectClazzById(1);
        System.out.println("ID: " + clazz.getId() +
                ",Name: " + clazz.getName() +
                ",Code: " + clazz.getCode());
        List<Student> studentList = clazz.getStudentList();
        for (Student student : studentList) {
            System.out.println(student);
        }
        session.commit();
        session.close();
    }

    @Test
    public void More2one(){
        SqlSession session = MySqlSessionFactory.getSqlSessionFactory();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        Student student = studentMapper.selectStudentById(1);
        System.out.println(student);
        System.out.println(student.getClazz());
    }

}