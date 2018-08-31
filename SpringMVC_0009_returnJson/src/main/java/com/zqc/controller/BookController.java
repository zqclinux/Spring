package com.zqc.controller;

import com.alibaba.fastjson.JSONObject;
import com.zqc.domain.Book;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/16
 * Time:14:09
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/json")
public class BookController {
    private static final Log logging = LogFactory.getLog(BookController.class);
    @RequestMapping("/test")
    public void setJson(@RequestBody Book book,
                        HttpServletResponse response) throws Exception{
        System.out.println("over");
        logging.info(JSONObject.toJSONString(book));
        book.setAuthor("Nima");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(JSONObject.toJSONString(book));

    }
    @RequestMapping("/tt")
    public String out(){
        System.out.println("输出信息");
        return "tt";
    }
    @RequestMapping(value = "/get")
    @ResponseBody
    public Object getJson(){
        List<Book> list = new ArrayList<>();
        list.add(new Book(1,"java从入门到放弃","郭德纲"));
        list.add(new Book(2,"数据结构从入门到崩溃","兰若寺"));
        System.out.println(list);
        return list;
    }
}
