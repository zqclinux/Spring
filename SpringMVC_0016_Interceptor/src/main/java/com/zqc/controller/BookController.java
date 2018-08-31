package com.zqc.controller;

import com.zqc.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:15:55
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class BookController {
    @RequestMapping(value = "/main")
    public String main(Model model) {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("java.jpg", "java从入门到放弃", "隔壁老王", 54.0));
        bookList.add(new Book("jsp.jpg", "jsp从入门到颈椎病康复指南", "请叫我大王吧", 64.3));
        model.addAttribute("bookList", bookList);
        return "main";
    }
}
