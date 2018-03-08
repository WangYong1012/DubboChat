package com.brave.v1.user.controller;

import com.alibaba.fastjson.JSONObject;
import com.brave.dto.user.UserUpdateStatusDTO;
import com.brave.service.user.IUserLoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/2/23 0023
 * @package : com.brave.v1.us`er.controller
 * @describe :
 **/
@Api("用户相关")
@RestController
@RequestMapping("/v1/user")
public class UserLoginController
{
    @Autowired
    private IUserLoginService userLoginService;
    
    /**
     * 2018年2月23日 10:15:20
     * 修改用户在线状态
     * @param userUpdateStatusDTO
     * @return
     */
    @ApiOperation("修改用户在线状态")
    @ApiImplicitParam(name = "userUpdateStatusDTO", value = "UserUpdateStatusDTO", required = true, dataType = "UserUpdateStatusDTO")
    @PostMapping(value = "/updateStatus", produces = "application/json")
    public String updateStatus(@RequestBody UserUpdateStatusDTO userUpdateStatusDTO)
    {
        try
        {
            System.out.println("UpdateStatus User ...");
            Map<String, Object> result = userLoginService.updateStatus(51, "ONLINE");
            System.out.println(JSONObject.toJSONString(result));
            return JSONObject.toJSONString(result);
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return "ERROR";
        }
    }
    
    
    
    
    
    
}