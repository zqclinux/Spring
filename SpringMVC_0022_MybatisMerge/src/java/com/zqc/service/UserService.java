package com.zqc.service;

import com.zqc.domain.User;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/10
 * Time:13:40
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public interface UserService {
    User login(String loginName, String password);
}
