package com.brave.entity.cost;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "mc_user_withdraw")
public class McUserWithdrawEntity implements Serializable
{
	
    @Id
    @GeneratedValue
    private int id;

    private String userId;
    
    private String userName;

    private BigDecimal amount;

    private BigDecimal afterAmount;

    private String collectionName;

    private String collectionAccount;

    private String mobile;

    private Date collectionTime;

    private String shr;

    private Date shsj;

    private int shjg;

    private Date createDate;

    private String bz;
    
    private String nickName;

    public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId == null ? "" : userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? "" : userId.trim();
    }

    public String getUserName() {
        return userName  == null ? "" : userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? "" : userName.trim();
    }

    public BigDecimal getAmount() {
        return amount  == null ? BigDecimal.ZERO : amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getAfterAmount() {
        return afterAmount == null ? BigDecimal.ZERO : afterAmount;
    }

    public void setAfterAmount(BigDecimal afterAmount) {
        this.afterAmount = afterAmount;
    }

    public String getCollectionName() {
        return collectionName == null ? "" : collectionName.trim();
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName == null ? "" : collectionName.trim();
    }

    public String getCollectionAccount() {
        return collectionAccount == null ? "" : collectionAccount.trim();
    }

    public void setCollectionAccount(String collectionAccount) {
        this.collectionAccount = collectionAccount == null ? "" : collectionAccount.trim();
    }

    public String getMobile() {
        return mobile == null ? "" : mobile.trim();
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? "" : mobile.trim();
    }

    public Date getCollectionTime() {
        return collectionTime;
    }

    public void setCollectionTime(Date collectionTime) {
        this.collectionTime = collectionTime;
    }


	public String getShr() {
		return shr == null ? "" : shr;
	}

	public void setShr(String shr) {
		this.shr = shr;
	}

	public Date getShsj() {
        return shsj;
    }

    public void setShsj(Date shsj) {
        this.shsj = shsj;
    }
    
	public int getShjg() {
		return shjg;
	}

	public void setShjg(int shjg) {
		this.shjg = shjg;
	}

    public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getBz() {
        return bz == null ? "" : bz.trim();
    }

    public void setBz(String bz) {
        this.bz = bz == null ? "" : bz.trim();
    }
}