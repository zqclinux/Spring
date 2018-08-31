package test;

import com.zqc.domain.User;
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
 * Data:2018/8/28
 * Time:18:13
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class UserMapperTest {

    @Test
    public void save() throws Exception {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        System.out.println("go");
        User user = new User("admin", "男", 25);
        session.insert("com.zqc.mapper.UserMapper.save", user);

        session.commit();
        session.close();
    }
}