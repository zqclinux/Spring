package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import zqc.domain.com.User;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/10
 * Time:14:01
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {
    public UserController() {
        super();
    }

    private static final Log logger = LogFactory.getLog(UserController.class);
    @ModelAttribute
    public void userModel(String loginName, String password,
                          Model model){
        logger.info("userModel");
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        model.addAttribute("user",user);
    }
    @RequestMapping(value = "/login1")
    public String login(Model model){
        logger.info("login");
        User user = (User) model.asMap().get("user");
        System.out.println(user);
        user.setUserName("测试");
        return "result1";
    }
}
