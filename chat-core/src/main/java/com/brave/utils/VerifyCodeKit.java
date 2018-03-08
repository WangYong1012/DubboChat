package com.brave.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/1/2 0002.
 */
public class VerifyCodeKit
{
    //校验数字类型
    private static final Pattern p = Pattern.compile("^[0-9]*$");
    
    //校验手机号
    public static boolean validVerifyCode(String verifyCode)
    {
        //非空校验
        if(null == verifyCode || 6 != verifyCode.length())
        {
            return false;
        }
        Matcher m = p.matcher(verifyCode);
        return m.matches();
    }
}