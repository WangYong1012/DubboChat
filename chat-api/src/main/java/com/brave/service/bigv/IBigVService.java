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

    /**
     * 2018年3月8日 17:14:09
     * 查询是否关注过该大V
     * @param redisUserInfo
     * @param userId
     * @param videoId
     * @return
     */
    boolean findAnchorIsCared(RedisUserInfoEntity redisUserInfo, int userId, String videoId);
    
    
    
    
    
}
