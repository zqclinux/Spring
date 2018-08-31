package com.zqc.domain;

import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:13:48
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class User implements Serializable {
    private String username;
    private MultipartFile image;

    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
