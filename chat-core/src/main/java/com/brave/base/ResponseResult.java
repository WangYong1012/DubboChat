package com.brave.base;

import java.util.Map;

/**
 * @author : WangYong
 * @project : ChatServer
 * @creatDate : 2018-01-03
 * @package : com.jnxbkp.tools
 * @describe :
 **/
public class ResponseResult
{
    private String code;
    private String msg;
    private Map<String, Object> data;
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}