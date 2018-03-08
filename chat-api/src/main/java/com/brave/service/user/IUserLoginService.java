package com.brave.service.user;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/2/23 0023
 * @package : com.brave.service.user
 * @describe :
 **/
@Component
public interface IUserLoginService
{
    /**
     * 2018年2月23日 09:55:37
     * 修改用户在线状态
     * @param userId
     * @param status
     * @return
     */
    Map<String, Object> updateStatus(int userId, String status);
    
    
    
    
    
    
    
    
}