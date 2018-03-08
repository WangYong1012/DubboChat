package com.brave.tools;

import com.brave.entity.user.McUserInfoEntity;
import com.brave.entity.user.RedisUserInfoEntity;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/2 0002
 * @package : com.brave.tools
 * @describe :
 **/
@Component
public class RedisKit
{
    @Autowired
    private RedisTemplate redisTemplate;
    
    private static final Gson gson = new Gson();

    
    
    
    /**
     * 2018年3月2日 14:45:39
     * 验证当前Token并返回相应用户数据
     * @param token
     * @return
     */
    public RedisUserInfoEntity checkTokenAndGetInfo(String token)
    {
        ValueOperations operations = redisTemplate.opsForValue();
        Object obj = operations.get(token);
        if(null == obj)
        {
            return null;
        }
        return gson.fromJson(obj.toString(), RedisUserInfoEntity.class);
    }

    /**
     * 校验短信验证码是否正确
     * @param mobile
     * @param verifyCode
     * @return
     * 0：成功
     * 1：失败
     * 2：已过期
     */
    public int checkMobileVerifyCode(String mobile, String verifyCode)
    {
        try
        {
            ValueOperations operations = redisTemplate.opsForValue();
            Object obj = operations.get(mobile.trim());
            if(null != obj)
            {
                if(obj.toString().equalsIgnoreCase(verifyCode.trim()))
                {
                    return 0;
                }else
                {
                    return 1;
                }
            }else
            {
                return 2;
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return 3;
        }
    }
}