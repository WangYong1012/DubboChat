package com.brave.entity.dict;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "mc_dict_tag")
public class McDictTagEntity implements Serializable
{
    @Id
    @GeneratedValue
    private int id;

    private String tagName;

    private String tagStatus;

    private String tagColor;

    private int tagSort;

    private Date createDate;

    private Date updateDate;

    private String remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? "" : tagName.trim();
    }

    public String getTagStatus() {
        return tagStatus;
    }

    public void setTagStatus(String tagStatus) {
        this.tagStatus = tagStatus == null ? "" : tagStatus.trim();
    }

    public String getTagColor() {
        return tagColor;
    }

    public void setTagColor(String tagColor) {
        this.tagColor = tagColor == null ? "" : tagColor.trim();
    }

    public int getTagSort() {
        return tagSort;
    }

    public void setTagSort(int tagSort) {
        this.tagSort = tagSort;
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
}