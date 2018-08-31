package org.fkit.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/10
 * Time:17:11
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DataBindingController {
    private static final Log logger = LogFactory.getLog(DataBindingController.class);

    @RequestMapping(value = "/pathVariableTest/{userId}")
    public void pathVaribleTest(@PathVariable Integer userId) {
        logger.info("通过@pathVariable获得数据：" + userId);
    }

    @RequestMapping(value="/requestHeaderTest")
    public void requestHeaderTest(
            @RequestHeader("User-Agent") String userAgent,
            @RequestHeader(value = "Accept") String[] accepts){
        logger.info("通过@requestHeader获得的数据：" + userAgent);
        for (String accept: accepts) {
            logger.info(accept);
        }
    }

    @RequestMapping(value = "/cookieValueTest")
    public void cookieValueTest(@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId){
        logger.info("通过@cookieValueTest获得数据：" + sessionId);
    }
}
