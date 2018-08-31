package com.zqc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.zqc.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletResponse;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/15
 * Time:18:01
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/json")
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);
    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public void setJson(@RequestBody User user, HttpServletResponse response) throws Exception{
        ObjectMapper mapper = new ObjectMapper();
        logger.info(mapper.writeValueAsString(user));
        user.setAuthor("HS");
        System.out.println(user.getName());
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println(mapper.writeValueAsString(user));
    }
    @RequestMapping("/just")
    public String outINfo(){
        System.out.println("For test");
        logger.info("just for test!");
        return "result";
    }
}
