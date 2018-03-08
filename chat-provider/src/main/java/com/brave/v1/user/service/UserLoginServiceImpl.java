package com.brave.v1.user.service;

import com.brave.entity.user.McUserInfoEntity;
import com.brave.service.user.IUserLoginService;
import com.brave.v1.user.repository.McUserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/2/23 0023
 * @package : com.brave.v1.user.service
 * @describe :
 **/
@Service(value = "loginService")
public class UserLoginServiceImpl implements IUserLoginService
{
    @Autowired
    private McUserInfoRepository userInfoRepository;
    
    
    @Override
    public Map<String, Object> updateStatus(int userId, String status)
    {
        McUserInfoEntity userInfo = userInfoRepository.findOne(userId);
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("userInfo", userInfo);
        resultMap.put("resultMsg", "操作成功.");
        resultMap.put("resultCode", "Success");
        return resultMap;
    }
}