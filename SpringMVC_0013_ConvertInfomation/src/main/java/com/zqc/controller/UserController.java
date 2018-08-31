package com.zqc.controller;

import com.zqc.domain.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:9:43
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {

        // 动态跳转页面
        return formName;
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(
            @ModelAttribute User user,
            Model model) {
        logger.info(user);
        model.addAttribute("user", user);
        return "success";
    }

}
