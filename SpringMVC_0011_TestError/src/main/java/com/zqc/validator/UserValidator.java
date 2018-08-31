package com.zqc.validator;

import com.zqc.domain.User;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * Created by Interllij IDEA
 * User:Zqc
 * Data:2018/8/30
 * Time:20:09
 * Email:quanchaozhao@yeah.net
 * To change this template use File | Settings | File Templates.
 */
public class UserValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object object, Errors errors) {
        // 验证username、sex和age是否为null
        ValidationUtils.rejectIfEmpty(errors, "username", null, "用户名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "sex", null, "性别不能为空");
        ValidationUtils.rejectIfEmpty(errors, "age", null, "年龄不能为空");
    }

}