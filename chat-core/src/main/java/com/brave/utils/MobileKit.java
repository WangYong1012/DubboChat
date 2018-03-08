package com.brave.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
public class MobileKit
{
    private static final Pattern p = Pattern.compile("^((13[0-9])|(15[0-9])|(18[0-9])|(17[0-9]))\\d{8}$");
    
    //校验手机号
    public static boolean validMobile(String mobile)
    {
        //非空校验
        if(null == mobile || 0 == mobile.length())
        {
            return false;
        }
        Matcher m = p.matcher(mobile);
        return m.matches();
    }
}