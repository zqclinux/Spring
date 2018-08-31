package com.zqc.controller;

import com.zqc.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:15:48
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {
    @RequestMapping(value = "/login")
    public ModelAndView login(
            String loginName, String password,
            ModelAndView mv, HttpSession session) {
        if (loginName != null && loginName.equals("zqc")
                && password != null && password.equals("123456")) {
            User user = new User();
            user.setLoginName(loginName);
            user.setPassword(password);
            user.setUserName("管理员");
            session.setAttribute("user", user);
            mv.setViewName("redirect:main");
        } else {
            mv.addObject("message",
                    "登录名或密码错误，请重新输入");
            mv.setViewName("loginForm");
        }
        return mv;
    }
}
