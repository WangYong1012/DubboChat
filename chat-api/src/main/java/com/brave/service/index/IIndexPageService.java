package com.brave.service.index;

import com.brave.response.IndexPageResponse;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018-03-02
 * @package : com.brave.service.index
 * @describe :
 **/
@Component
public interface IIndexPageService
{
    /**
     * 2018年3月2日 14:01:02
     * 首页-新人列表
     * @param pageSize
     * @param pageNumber
     * @return
     */
    List<IndexPageResponse> getIndexNewList(int pageSize, int pageNumber);

    /**
     * 2018年3月2日 14:01:13
     * 首页-关注列表
     * @param pageSize
     * @param pageNumber
     * @param userId
     * @return
     */
    List<IndexPageResponse> getIndexCareList(int pageSize, int pageNumber, int userId);

    /**
     * 2018年3月2日 14:01:35
     * 首页-推荐列表
     * @param pageSize
     * @param pageNumber
     * @return
     */
    List<IndexPageResponse> getIndexRecommendList(int pageSize, int pageNumber);
}