package zqc.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import zqc.domain.Book;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/13
 * Time:12:25
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/json")
public class BookController {

    private static final Log logger = LogFactory.getLog(BookController.class);

    // @RequestBody根据json数据，转换成对应的Object
//    @RequestMapping(value = "/testRequestBody")
//    public void setJson(@RequestBody Book book,
//                        HttpServletResponse response){
//        // ObjectMapper类是Jackson库的主要类。它提供一些功能将Java对象转换成对应的JSON格式的数据
//        ObjectMapper mapper = new ObjectMapper();
//        // 将book对象转换成json输出
//
////        book = new Book();
////        System.out.println("DDDD");
//        try {
//            logger.info(mapper.writeValueAsString(book));
//            book.setAuthor("肖文吉");
//            response.setContentType("text/html;charset=UTF-8");
//            // 将book对象转换成json写出到客户端
//            response.getWriter().println(mapper.writeValueAsString(book));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        System.out.println("over");
//    }

    @RequestMapping(value = "/test",produces = "text/html;charset=UTF-8")
    public void setJson(HttpServletRequest request){
        Integer id = new Integer(request.getParameter("id"));
        String name = request.getParameter("name");
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        System.out.println("over");
    }
}
