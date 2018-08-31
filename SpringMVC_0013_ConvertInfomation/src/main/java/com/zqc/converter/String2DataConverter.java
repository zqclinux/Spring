package com.zqc.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/31
 * Time:9:45
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class String2DataConverter implements Converter<String, Date> {
    // 日期类型模板：如yyyy-MM-dd
    private String datePattern;

    public String getDatePattern() {
        return datePattern;
    }

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    // Converter<S,T>接口的类型转换方法
    @Override
    public Date convert(String date) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat(this.datePattern);
            // 将日期字符串转换成Date类型返回
            return dateFormat.parse(date);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("日期转换失败!");
            return null;
        }

    }
}
