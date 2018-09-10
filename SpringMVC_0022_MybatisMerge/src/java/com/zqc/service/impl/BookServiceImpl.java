package com.zqc.service.impl;

import com.zqc.domain.Book;
import com.zqc.mapper.BookMapper;
import com.zqc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/10
 * Time:13:46
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
/**
 * Book服务层接口实现类
 * @Service("bookService")用于将当前类注释为一个Spring的bean，名为bookService
 * */
@Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT)
@Service("bookService")
public class BookServiceImpl  implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> getAll() {
        return bookMapper.findAll();
    }
}
