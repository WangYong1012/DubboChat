package com.brave.v1.bigv;

import com.brave.dto.bigv.UserCareDTO;
import com.brave.entity.user.McUserCareEntity;
import com.brave.entity.user.McUserInfoEntity;
import com.brave.entity.user.McUserVideoEntity;
import com.brave.entity.user.RedisUserInfoEntity;
import com.brave.service.bigv.IBigVService;
import com.brave.utils.Constants;
import com.brave.v1.user.repository.McUserCareRepository;
import com.brave.v1.user.repository.McUserInfoRepository;
import com.brave.v1.user.repository.McUserVideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/6 0006
 * @package : com.brave.v1.bigv
 * @describe :
 **/
@Service(value = "bigVService")
@Transactional(propagation = Propagation.REQUIRED)
public class BigVServiceImpl implements IBigVService
{
    @Autowired
    private McUserInfoRepository userInfoRepository;
    @Autowired
    private McUserCareRepository userCareRepository;
    @Autowired
    private McUserVideoRepository userVideoRepository;


    /**
     * 2018年3月6日 19:10:58
     * 查询出对应的用户关注集合
     * @param userCareDTO
     * @param username
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public Map<String, Object> findUserCareList(UserCareDTO userCareDTO, String username)
    {
        Date now = new Date();
        Map<String, Object> resultMap = new HashMap<>(3);
        McUserCareEntity userCare = userCareRepository.findFirstByGzaccountAndBgzaccount(username, userCareDTO.getBgzaccount());
        
        //艺人信息
        McUserInfoEntity anchorInfo = userInfoRepository.findFirstByUsername(userCareDTO.getBgzaccount());
        //用户信息
        McUserInfoEntity userInfo = userInfoRepository.findFirstByUsername(username);
        
        //手机号不存在的情况
        if(null == anchorInfo || null == userInfo)
        {
            resultMap.put("mobile", Constants.SERVER_MOBILE_NO_REGISTER_MSG);
        }
        
        //不存在关系时
        if(null == userCare)
        {
            McUserCareEntity careEntity = new McUserCareEntity();
            careEntity.setBgzid(anchorInfo.getId());
            careEntity.setGzid(userInfo.getId());
            careEntity.setBgzaccount(anchorInfo.getUsername());
            careEntity.setGzaccount(userInfo.getUsername());
            careEntity.setBgztype(anchorInfo.getUserType());
            careEntity.setGztype(userInfo.getUserType());
            careEntity.setSfgz(1);
            careEntity.setCreatetime(now);
            userCareRepository.save(careEntity);
            //更新粉丝数量
            anchorInfo.setFansNum(anchorInfo.getFansNum() + 1);
            userInfoRepository.save(anchorInfo);
            //返还粉丝数量
            resultMap.put("fansNum", anchorInfo.getFansNum());
            return resultMap;
        }else
        {
            //存在关系时, 直接将关系更新
            if(1 == userCare.getSfgz() && "1".equals(userCareDTO.getSfgz()))
            {
                resultMap.put("sfgz", "用户已关注.");
            }
            
            if(0 == userCare.getSfgz() && "0".equals(userCareDTO.getSfgz()))
            {
                resultMap.put("sfgz", "用户未关注.");
            }
            
            if(0 != resultMap.size())
            {
                return resultMap;
            }
            
            userCare.setSfgz(Integer.parseInt(userCareDTO.getSfgz()));
            userCareRepository.saveAndFlush(userCare);
            
            if("1".equals(userCareDTO.getSfgz()))
            {
                anchorInfo.setFansNum(anchorInfo.getFansNum() + 1);
            }else
            {
                anchorInfo.setFansNum(anchorInfo.getFansNum() - 1);
            }
            userInfoRepository.save(anchorInfo);
            
            resultMap.put("fansNum", anchorInfo.getFansNum());
            return resultMap;
        }
    }

    /**
     * 2018年3月6日 19:32:55
     * 查询是否关注过
     * @param userInfo
     * @param anchorId
     * @param videoId
     * @return
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean findAnchorIsCared(RedisUserInfoEntity userInfo, int anchorId, String videoId)
    {
        McUserVideoEntity userVideoEntity = userVideoRepository.findFirstByVideoId(videoId);
        
        if(null != userVideoEntity)
        {
            userVideoEntity.setVideoCount(userVideoEntity.getVideoCount() + 1);
            userVideoRepository.save(userVideoEntity);
        }
        //查询出对应的集合
        McUserCareEntity userCareEntity = userCareRepository.findFirstByGzidAndBgzidAndSfgz(userInfo.getId(), anchorId,1);
        if(null != userCareEntity && 0 != userCareEntity.getId())
        {
            return true;
        }else
        {
            return false;
        }
    }
}