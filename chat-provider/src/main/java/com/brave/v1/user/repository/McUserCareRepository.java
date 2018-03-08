package com.brave.v1.user.repository;

import com.brave.entity.user.McUserCareEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface McUserCareRepository extends JpaRepository<McUserCareEntity, Integer>
{
    
    @Query("SELECT c FROM McUserCareEntity c WHERE c.gzid = :gzid AND c.sfgz = 1 ORDER BY c.createtime DESC")
    Page<McUserCareEntity> findByGzid(@Param("gzid") int gzid, Pageable pageable);
    
    McUserCareEntity findFirstByGzaccountAndBgzaccount(@Param("gzaccount") String gzAccount, @Param("bgzaccount") String bgzaccount);

    List<McUserCareEntity> findByGzidAndBgzidAndSfgz(@Param("gzid") int gzid, @Param("bgzid") int bgzid, @Param("sfgz") int sfgz);
    
    McUserCareEntity findFirstByGzidAndBgzidAndSfgz(@Param("gzid") int gzid, @Param("bgzid") int bgzid, @Param("sfgz") int sfgz);
    
}