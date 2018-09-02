package com.zqc.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/1
 * Time:17:22
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class Clazz implements Serializable {
    private Integer id;
    private String name;
    private String code;
    private List<Student> studentList;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Clazz:[Id: " + id + ",Name: " + name
                + ",Code: " + code + "]";
    }
}
