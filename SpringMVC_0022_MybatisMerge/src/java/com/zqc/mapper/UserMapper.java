package com.zqc.mapper;

import com.zqc.domain.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/10
 * Time:13:34
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public interface UserMapper {
    @Select("select * from tb_user_3 where loginName = #{loginName} and password = #{password}")
    User findWithLoginNameAndPassword(@Param("loginName") String loginName,
                                      @Param("password") String password);
}
