package com.zqc.domain;

import java.io.Serializable;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:12:09
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private String loginname;
    private String password;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [loginname=" + loginname + ", password=" + password + "]";
    }
}
