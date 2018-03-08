package com.brave.dto.bigv;

import com.brave.functions.MustNotBeNull;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/6 0006
 * @package : com.brave.v1.bigv.dto
 * @describe :
 **/
@ApiModel
public class UserCareDTO
{
    @MustNotBeNull
    @ApiModelProperty(name = "gzaccount", value = "关注者账号", required = true)
    private String gzaccount;

    @MustNotBeNull
    @ApiModelProperty(name = "bgzaccount", value = "被关注者账号", required = true)
    private String bgzaccount;

    @MustNotBeNull
    @ApiModelProperty(name = "sfgz", value = "是否关注", required = false)
    private String sfgz;

    @MustNotBeNull
    @ApiModelProperty(name = "token", value = "Token", required = true)
    private String token;

    public String getGzaccount() {
        return gzaccount;
    }

    public void setGzaccount(String gzaccount) {
        this.gzaccount = gzaccount;
    }

    public String getBgzaccount() {
        return bgzaccount;
    }

    public void setBgzaccount(String bgzaccount) {
        this.bgzaccount = bgzaccount;
    }

    public String getSfgz() {
        return sfgz;
    }

    public void setSfgz(String sfgz) {
        this.sfgz = sfgz;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}