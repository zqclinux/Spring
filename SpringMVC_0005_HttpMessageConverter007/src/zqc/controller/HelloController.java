package zqc.controller;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/9
 * Time:18:40
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/9
 * Time:17:22
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@org.springframework.stereotype.Controller
public class HelloController {
    private static final Log logger = LogFactory.getLog(HelloController.class);

    @RequestMapping(value = "/hello")
    public ModelAndView hello() {
        logger.info("hello method is been called!");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("Name", "Zqc");
        modelAndView.addObject("Message", "Hello world!");
        modelAndView.addObject("URL", "http://www.baidu.com");
        modelAndView.setViewName("JspFile/welcome");
        return modelAndView;
    }

    @RequestMapping(value = "/sayBybe")
    public String sayBybe(Model model) {
        model.addAttribute("say","Bybe");
        model.addAttribute("URL","https://c.runoob.com/compile/11");
        return "bye";
    }
}
