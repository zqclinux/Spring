package com.zqc.service.impl;

import com.zqc.domain.User;
import com.zqc.mapper.UserMapper;
import com.zqc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/10
 * Time:13:42
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */

/**
 * User服务层接口实现类
 *
 * @Service("userService")用于将当前类注释为一个Spring的bean，名为userService
 */
@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String loginName, String password) {
        return userMapper.findWithLoginNameAndPassword(loginName, password);
    }
}
