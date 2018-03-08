package com.brave.entity.user;

/**
 * 2018年3月3日 11:28:11
 * 在Redis中存放UserInfo信息
 */
public class RedisUserInfoEntity
{
    private int id;
    
    private String username;

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
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
        this.username = username;
    }
}