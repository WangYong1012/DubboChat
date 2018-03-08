package com.brave.v1.user.repository;

import com.brave.entity.user.McUserInfoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018-02-28
 * @package : com.brave.v1.user.repository
 * @describe :
 **/
public interface McUserInfoRepository extends JpaRepository<McUserInfoEntity, Integer>
{
    /**
     * 2018年3月2日 21:05:26
     * 获取首页新人列表
     * @param pageable
     * @return
     */
    @Query("SELECT u FROM McUserInfoEntity  u WHERE u.isBigv = 3 AND u.price > 0 AND u.roleType = 'BIGV' ORDER BY u.createDate DESC")
    Page<McUserInfoEntity> findNewUserInfoList(Pageable pageable);

    /**
     * 2018年3月2日 21:05:41
     * 获取首页推荐列表
     * @param pageable
     * @return
     */
    @Query("SELECT u FROM McUserInfoEntity u WHERE u.isBigv = 3 AND u.price > 0 AND u.roleType = 'BIGV' AND u.isRecommand > 0 ORDER BY u.isRecommand DESC")
    Page<McUserInfoEntity> findRecommendUserInfoList(Pageable pageable);

    /**
     * 2018年3月6日 18:02:47
     * 使用手机号查询出对应的用户
     * @param username
     * @return
     */
    McUserInfoEntity findFirstByUsername(String username);
    
    
    
    
}
