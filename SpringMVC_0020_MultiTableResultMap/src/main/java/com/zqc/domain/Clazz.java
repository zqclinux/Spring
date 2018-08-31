package com.zqc.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:21:00
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class Clazz implements Serializable {
    private Integer id;
    private String code;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "[ id: " + id + ",code: " + code + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
