package com.zqc.factory;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:18:45
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class MySqlSessionFactory {
    private static SqlSessionFactory sqlSessionFactory = null;
    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSessionFactory() {
        return sqlSessionFactory.openSession();
    }

    public static void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        MySqlSessionFactory.sqlSessionFactory = sqlSessionFactory;
    }
}
