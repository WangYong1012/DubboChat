package com.brave.utils;

import java.time.LocalDateTime;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/2 0002
 * @package : com.brave.utils
 * @describe :
 **/
public class TokenGenerator
{
    /**
     * 2018年3月2日 14:36:17
     * 生成Token的方法
     * @param userId
     * @param username
     * @param headUrl
     * @return
     */
    public static String generate(int userId, String username, String headUrl)
    {
        LocalDateTime time = LocalDateTime.now();
        return MD5Kit.MD5Encode(String.format("%d-%s-%s-%s", userId, username, headUrl, time));
    }
}