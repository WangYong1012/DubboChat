package com.brave.entity.cost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "mc_user_recharge")
public class McUserRechargeEntity
{
    @Id
    @GeneratedValue
    private int id;

    private int userId;

    private String nickName;

    private int consumeId;

    private String detailNo;

    private int callTime;

    private BigDecimal amount;

    private BigDecimal amountrmb;

    private String callId;
    
    private BigDecimal balance;

    private int type;

    private int status;

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? "" : nickName.trim();
    }

    public int getConsumeId() {
        return consumeId;
    }

    public void setConsumeId(int consumeId) {
        this.consumeId = consumeId;
    }

    public String getDetailNo() {
        return detailNo;
    }

    public void setDetailNo(String detailNo) {
        this.detailNo = detailNo == null ? "" : detailNo.trim();
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAmountrmb() {
        return amountrmb == null ? BigDecimal.ZERO : amountrmb;
    }

    public void setAmountrmb(BigDecimal amountrmb) {
        this.amountrmb = amountrmb == null ? BigDecimal.ZERO : amountrmb;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public int getCallTime() {
        return callTime;
    }

    public void setCallTime(int callTime) {
        this.callTime = callTime;
    }

    public String getCallId() {
        return callId == null ? "" : callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }
}