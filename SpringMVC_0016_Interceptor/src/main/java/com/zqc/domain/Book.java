package com.zqc.domain;

import java.io.Serializable;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:15:42
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class Book implements Serializable {
    private Integer id;                // id
    private String name;            // 书名
    private String author;            // 作者
    private Double price;            // 价格
    private String image;            // 封面图片

    public Book() {
        super();
    }

    public Book(String image, String name, String author, Double price) {
        super();
        this.image = image;
        this.name = name;
        this.author = author;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
