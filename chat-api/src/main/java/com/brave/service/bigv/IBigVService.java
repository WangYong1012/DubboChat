package com.brave.service.bigv;

import com.brave.dto.bigv.UserCareDTO;
import com.brave.entity.user.McUserInfoEntity;
import com.brave.entity.user.RedisUserInfoEntity;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018-03-06
 * @package : com.brave.service.bigv
 * @describe :
 **/
@Component
public interface IBigVService
{
    
    Map<String, Object> findUserCareList(UserCareDTO userCareDTO, String username);
    
    boolean findAnchorIsCared(RedisUserInfoEntity redisUserInfo, int userId, String videoId);
    
    
    
    
    
}
