package com.zqc.controller;

import com.zqc.domain.User;
import com.zqc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpSession;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/10
 * Time:13:50
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @RequestMapping(value = "/login")
    public ModelAndView login(String loginName, String password,
                              ModelAndView mv, HttpSession session) {
        User user = userService.login(loginName, password);
        if (user != null) {
            session.setAttribute("user", user);
            mv.setView(new RedirectView("/main"));
        } else {
            mv.addObject("message",
                    "登录名或密码错误，请重新输入");
            mv.setViewName("loginForm");
        }
        return mv;
    }
}
