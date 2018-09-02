package com.zqc.mapper;

import com.zqc.domain.Person;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/1
 * Time:15:10
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public interface PersonMapper {
    Person selectPersonById(Integer id);
}
