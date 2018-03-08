package com.brave.dto.user;

import com.brave.functions.MustNotBeNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/2/23 0023
 * @package : com.brave.v1.user.dto
 * @describe :
 **/
@ApiModel
public class UserUpdateStatusDTO
{
    @MustNotBeNull
    @ApiModelProperty(name = "status", value = "状态('ONLINE','BUSY','TALKING','OFFLINE')", required = true)
    private String status;

    @MustNotBeNull
    @ApiModelProperty(name = "token", value = "Token", required = true)
    private String token;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}