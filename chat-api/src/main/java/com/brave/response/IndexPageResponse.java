package com.brave.response;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/2 0002
 * @package : com.brave.response
 * @describe :
 **/
public class IndexPageResponse implements Serializable
{
    //来自用户实体
    private int id;
    //来自用户实体
    private String nickname;
    //来自用户实体
    private String personalSign;
    //来自用户实体
    private BigDecimal price;
    //来自用户实体
    private String status;
    //来自文件附件实体
    private String posterUrl;
    //来自用户实体
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPersonalSign() {
        return personalSign;
    }

    public void setPersonalSign(String personalSign) {
        this.personalSign = personalSign;
    }

    public BigDecimal getPrice() {
        return price == null ? BigDecimal.ZERO : price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price == null ? BigDecimal.ZERO : price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}