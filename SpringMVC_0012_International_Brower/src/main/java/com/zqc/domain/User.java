package com.zqc.domain;

import java.io.Serializable;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/30
 * Time:21:24
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private String loginname;
    private String password;
    private String username;

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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User [loginname=" + loginname + ", password=" + password
                + ", username=" + username + "]";
    }
}
