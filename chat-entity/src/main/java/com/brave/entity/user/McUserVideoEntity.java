package com.brave.entity.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/6 0006
 * @package : com.brave.entity.user
 * @describe :
 **/
@Entity
@Table(name = "mc_user_videos")
public class McUserVideoEntity implements Serializable
{
    @Id
    @GeneratedValue
    private int id;

    private int userId;

    private String videoName;

    private String videoId;

    private String videoUrl;

    private int videoType;

    private int videoStatus;

    private int videoCount;

    private int videoUp;

    private int videoLike;

    private Date createDate;

    private Date updateDate;

    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName == null ? "" : videoName.trim();
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? "" : videoId.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? "" : videoUrl.trim();
    }

    public int getVideoType() {
        return videoType;
    }

    public void setVideoType(int videoType) {
        this.videoType = videoType;
    }

    public int getVideoStatus() {
        return videoStatus;
    }

    public void setVideoStatus(int videoStatus) {
        this.videoStatus = videoStatus;
    }

    public int getVideoCount() {
        return videoCount;
    }

    public void setVideoCount(int videoCount) {
        this.videoCount = videoCount;
    }

    public int getVideoUp() {
        return videoUp;
    }

    public void setVideoUp(int videoUp) {
        this.videoUp = videoUp;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? "" : remark.trim();
    }

    public int getVideoLike() {
        return videoLike;
    }

    public void setVideoLike(int videoLike) {
        this.videoLike = videoLike;
    }
}