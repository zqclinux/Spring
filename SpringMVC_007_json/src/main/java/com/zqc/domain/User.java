package com.zqc.domain;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/15
 * Time:18:01
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class User {
    private Integer id;
    private String name;
    private String author;

    public User() {
    }

    public User(Integer id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
