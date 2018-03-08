package com.brave.v1.index;

import com.brave.entity.user.McUserCareEntity;
import com.brave.entity.user.McUserInfoEntity;
import com.brave.response.IndexPageResponse;
import com.brave.service.index.IIndexPageService;
import com.brave.v1.user.repository.McUserCareRepository;
import com.brave.v1.user.repository.McUserInfoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/2 0002
 * @package : com.brave.v1.index
 * @describe :
 **/
@Service(value = "indexService")
public class IndexPageServiceImpl implements IIndexPageService
{
    @Autowired
    private McUserInfoRepository userInfoRepository;
    @Autowired
    private McUserCareRepository userCareRepository;
    
    @Override
    public List<IndexPageResponse> getIndexNewList(int pageSize, int pageNumber)
    {
        Pageable page = new PageRequest(pageNumber, pageSize);
        Page<McUserInfoEntity> userInfoList = userInfoRepository.findNewUserInfoList(page);
        List<IndexPageResponse> responseList = new ArrayList<>(pageSize);
        userInfoList.getContent().stream().forEach(x -> 
        {
            IndexPageResponse response = new IndexPageResponse();
            BeanUtils.copyProperties(x, response);
            responseList.add(response);
        });
        return responseList;
    }

    @Override
    public List<IndexPageResponse> getIndexCareList(int pageSize, int pageNumber, int userId)
    {
        Pageable pageable = new PageRequest(pageNumber, pageSize);
        Page<McUserCareEntity> userCareList = userCareRepository.findByGzid(userId, pageable);
        //初始化集合
        List<IndexPageResponse> responseList = new ArrayList<>(pageSize);
        userCareList.getContent().stream().forEach(x -> 
        {
            McUserInfoEntity userInfo = userInfoRepository.findOne(x.getBgzid());
            IndexPageResponse response = new IndexPageResponse();//
            BeanUtils.copyProperties(userInfo, response);
            responseList.add(response);
        });
        return responseList;
    }

    @Override
    public List<IndexPageResponse> getIndexRecommendList(int pageSize, int pageNumber)
    {
        Pageable pageable = new PageRequest(pageNumber, pageSize);
        Page<McUserInfoEntity> userInfoList = userInfoRepository.findRecommendUserInfoList(pageable);
        List<IndexPageResponse> responseList = new ArrayList<>(pageSize);
        userInfoList.getContent().stream().forEach(x -> 
        {
            IndexPageResponse response = new IndexPageResponse();
            BeanUtils.copyProperties(x, response);
            responseList.add(response);
        });
        return responseList;
    }
}