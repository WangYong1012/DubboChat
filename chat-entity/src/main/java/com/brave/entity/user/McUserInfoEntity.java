package com.brave.entity.user;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mc_user_info")
public class McUserInfoEntity implements Serializable
{
    @Id
    @GeneratedValue
    private int id;

    private String username;

    private String nickname;

    private int height;

    private String headUrl;

    private int sex;

    private Double weight;

    private String constellation;

    private String description;

    private String country;

    private String province;

    private String city;

    private String thirdAccount;

    private String password;

    private String salt;

    private String status;

    private String token;

    private int isAgent;

    private int isBigv;

    private int isCommon;

    private String roleType;

    private int isRecommand;

    private int userType;

    private String loginType;

    private String userTag;

    private String personalSign;

    private int startlv;

    private String deviceId;

    private int deviceType;

    private BigDecimal price;

    private BigDecimal balance;

    private Double percent;

    private Date createDate;

    private Date reviewDate;

    private Date updateDate;

    private String remark;

    private String wirthdrawAccount;

    private String wirthdrawName;

    private String wechat;

    private String microBlog;

    private int fansNum;

    public String getWirthdrawAccount() {
        return wirthdrawAccount == null ? "" : wirthdrawAccount;
    }

    public void setWirthdrawAccount(String wirthdrawAccount) {
        this.wirthdrawAccount = wirthdrawAccount == null ? wirthdrawAccount : wirthdrawAccount;
    }

    public String getWirthdrawName() {
        return wirthdrawName == null ? "" : wirthdrawName;
    }

    public void setWirthdrawName(String wirthdrawName) {
        this.wirthdrawName = wirthdrawName == null ? "" : wirthdrawName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? "" : username.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? "" : nickname.trim();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getHeadUrl() {
        return headUrl;
    }

    public void setHeadUrl(String headUrl) {
        this.headUrl = headUrl == null ? "" : headUrl.trim();
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation == null ? "" : constellation.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? "" : description.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? "" : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? "" : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? "" : city.trim();
    }

    public String getThirdAccount() {
        return thirdAccount;
    }

    public void setThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount == null ? "" : thirdAccount.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? "" : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? "" : salt.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? "" : status.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? "" : token.trim();
    }

    public int getIsAgent() {
        return isAgent;
    }

    public void setIsAgent(int isAgent) {
        this.isAgent = isAgent;
    }

    public int getIsBigv() {
        return isBigv;
    }

    public void setIsBigv(int isBigv) {
        this.isBigv = isBigv;
    }

    public int getIsCommon() {
        return isCommon;
    }

    public void setIsCommon(int isCommon) {
        this.isCommon = isCommon;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType == null ? "" : roleType.trim();
    }

    public int getIsRecommand() {
        return isRecommand;
    }

    public void setIsRecommand(int isRecommand) {
        this.isRecommand = isRecommand;
    }

    public int getUserType() {
        return userType;
    }

    public void setUserType(int userType) {
        this.userType = userType;
    }

    public String getLoginType() {
        return loginType;
    }

    public void setLoginType(String loginType) {
        this.loginType = loginType == null ? "" : loginType.trim();
    }

    public String getPersonalSign() {
        return personalSign == null ? "" : personalSign;
    }

    public void setPersonalSign(String personalSign) {
        this.personalSign = personalSign == null ? "" : personalSign.trim();
    }

    public BigDecimal getPrice() {
        return price == null ? BigDecimal.ZERO : price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price == null ? BigDecimal.ZERO : price;
    }

    public int getStartlv() {
        return startlv;
    }

    public void setStartlv(int startlv) {
        this.startlv = startlv;
    }

    public Double getPercent() {
        return percent == null ? 0 : percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent == null ? 0 : percent;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
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

    public String getUserTag() {
        return userTag;
    }

    public void setUserTag(String userTag) {
        this.userTag = userTag;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }


    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public int getFansNum() {
        return fansNum;
    }

    public void setFansNum(int fansNum) {
        this.fansNum = fansNum;
    }

    public String getDeviceId() {
        return deviceId == null ? "" : deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId == null ? "" : deviceId;
    }

    public BigDecimal getBalance() {
        return balance == null ? BigDecimal.ZERO : balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance == null ? BigDecimal.ZERO : balance;
    }

    public String getMicroBlog() {
        return microBlog == null ? "" : microBlog;
    }

    public void setMicroBlog(String microBlog) {
        this.microBlog = microBlog == null ? "" : microBlog;
    }

    //用户状态集合
    public static List<String> UserStatusList = new ArrayList<>(5);
    static
    {
        UserStatusList.add("ONLINE");       //在线
        UserStatusList.add("BUSY");         //勿扰
        UserStatusList.add("TALKING");      //在聊
        UserStatusList.add("OFFLINE");      //离线
        UserStatusList.add("_ONLINE");      //一直在线
    }
}