package com.brave.base;

import com.alibaba.fastjson.JSONObject;
import com.brave.utils.Constants;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/1 0001
 * @package : com.brave.base
 * @describe :
 **/
public class BaseController
{
    /**
     * 2018年3月2日 10:40:25
     * 仅支持返回固定格式
     * @param obj
     * @return
     */
    public String success(Object obj)
    {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("resultCode", Constants.INVOKE_SUCCESS_CODE);
        resultMap.put("resultMsg", Constants.INVOKE_SUCCESS_MSG);
        resultMap.put("data", obj);
        return JSONObject.toJSONString(resultMap);
    }

    /**
     * 2018年3月2日 10:40:15
     * 支持自定义消息格式
     * @param param
     * @param version
     * @return
     */
    public String success(Map<String, Object> param, String version)
    {
        ResponseResult result = new ResponseResult();
        result.setCode("200");
        result.setMsg(Constants.INVOKE_SUCCESS_MSG);
        result.setData(param);
        return JSONObject.toJSONString(result);
    }

    /**
     * 2018年3月2日 10:41:08
     * 返回错误消息，异常消息
     * @param errorCode
     * @param errorMsg
     * @return
     */
    public String error(String errorCode, String errorMsg)
    {
        Map<String, Object> param = new HashMap<>(4);
        ResponseResult result = new ResponseResult();
        result.setData(new HashMap<>());
        result.setCode(errorCode);
        result.setMsg(errorMsg);
        param.put("resultList", new HashMap<>());
        param.put("type", "");
        param.put("typeCode", 0);
        return JSONObject.toJSONString(result);
    }

    /**
     * 2018年3月2日 10:41:19
     * 返回错误消息，自定义消息
     * @param obj
     * @param errorCode
     * @param errorMsg
     * @return
     */
    public String error(Object obj, String errorCode, String errorMsg)
    {
        Map<String, Object> errorMap = new HashMap<>();
        errorMap.put("resultCode", errorCode);
        errorMap.put("resultMsg", errorMsg);
        errorMap.put("errorMsg", obj);
        return JSONObject.toJSONString(errorMap);
    }
}