package com.zqc.mapper;

import com.zqc.domain.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/10
 * Time:13:37
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public interface BookMapper {
    @Select("select * from tb_book")
    List<Book> findAll();
}
