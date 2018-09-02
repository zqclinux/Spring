package com.zqc.mapper;

import com.zqc.domain.Student;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/1
 * Time:19:34
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public interface StudentMapper {
    Student selectStudentById(Integer id);
}
