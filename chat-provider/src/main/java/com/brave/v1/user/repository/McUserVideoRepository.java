package com.brave.v1.user.repository;

import com.brave.entity.user.McUserVideoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018-03-06
 * @package : com.brave.v1.user.repository
 * @describe :
 **/
public interface McUserVideoRepository extends JpaRepository<McUserVideoEntity, Integer>
{
    /**
     * 2018年3月6日 19:26:17
     * 查询出对应的视频对象
     * @param videoId
     * @return
     */
    McUserVideoEntity findFirstByVideoId(String videoId);
    
    
    
    
}