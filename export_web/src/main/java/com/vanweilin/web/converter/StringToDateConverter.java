package com.vanweilin.web.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther: Administrator
 * @Project: ssm_project
 * @Date: 2020/9/11 19:20
 * @Description:
 */
@Component
public class StringToDateConverter implements Converter<String, Date> {

    @Override
    public Date convert(String s) {
        if (!StringUtils.isEmpty(s)) {
            try {
                Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(s);
                return parse;
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
