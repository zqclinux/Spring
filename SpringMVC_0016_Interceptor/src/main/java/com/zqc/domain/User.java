package com.zqc.domain;

import java.io.Serializable;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:15:38
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private Integer id;            // id
    private String loginName;    // 登录名
    private String password;    // 密码
    private String userName;    // 用户名

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "userName: " + userName + ",password: " + password;
    }
}

