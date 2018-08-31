package com.zqc.controller;

import com.zqc.domain.User;
import com.zqc.validator.UserValidator;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:12:09
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class UserController {
    private static final Log logger = LogFactory.getLog(UserController.class);

    // 注入UserValidator对象
    @Autowired
    @Qualifier("userValidator")
    private UserValidator userValidator;

    @RequestMapping(value = "/{formName}")
    public String loginForm(
            @PathVariable String formName,
            Model model) {
        User user = new User();
        model.addAttribute("user", user);
        // 动态跳转页面
        return formName;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(
            @ModelAttribute User user,
            Model model,
            Errors errors) {
        logger.info(user);
        model.addAttribute("user", user);
        // 调用userValidator的验证方法
        userValidator.validate(user, errors);
        // 如果验证不通过跳转到loginForm视图
        if (errors.hasErrors()) {
            return "loginForm";
        }
        return "success";
    }
}
