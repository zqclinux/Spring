package com.zqc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/9/9
 * Time:16:26
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/{formName}")
    public String loginForm(@PathVariable String formName) {
        // 动态跳转页面
        return formName;
    }
}
