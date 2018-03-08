package com.brave.v1.bigv.controller;

import com.brave.base.BaseController;
import com.brave.dto.bigv.UserCareDTO;
import com.brave.entity.user.RedisUserInfoEntity;
import com.brave.service.bigv.IBigVService;
import com.brave.utils.Constants;
import com.brave.tools.RedisKit;
import com.brave.utils.CheckParamsKit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/6 0006
 * @package : com.brave.v1.bigv
 * @describe :
 **/
@Api(value = "大V相关", description = "大V认证、评价、亲密榜、审核失败原因、关注")
@RestController
@RequestMapping("/v1/bigV")
public class BigVController extends BaseController
{
    @Autowired
    private RedisKit redisKit;
    @Autowired
    private IBigVService bigVService;

    /**
     * 2018年3月6日 19:12:10
     * 关注大V
     * @param userCareDTO
     * @return
     */
    @ApiOperation("关注大V")
    @ApiImplicitParam(name = "userCareDTO", value = "用户关注操作实体", required = true, dataType = "UserCareDTO")
    @PostMapping(value = "/careUser", produces = "application/json")
    public String careUser(@RequestBody UserCareDTO userCareDTO)
    {
        try
        {
            Map<String, Object> resultMap = CheckParamsKit.checkObject(userCareDTO);
            //参数校验
            if(0 != resultMap.size())
            {
                return error(resultMap, Constants.APP_PARAM_ERROR_CODE, Constants.APP_PARAM_ERROR_MSG);
            }
            //是否过期
            RedisUserInfoEntity redisUserInfo = redisKit.checkTokenAndGetInfo(userCareDTO.getToken());
            if(null == redisUserInfo)
            {
                return error(Constants.APP_PARAM_EXPIRED_CODE, Constants.APP_PARAM_EXPIRED_MSG);
            }
            // 关注实现
            resultMap = bigVService.findUserCareList(userCareDTO, redisUserInfo.getUsername());
            if (resultMap.containsKey("fansNum")) {
                // 关注成功
                return success(resultMap);
            } else
            {
                return error(resultMap, Constants.APP_PARAM_ERROR_CODE, Constants.APP_PARAM_ERROR_MSG);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return error(Constants.SERVER_EXCEPTION_CODE, ex.getMessage());
        }
    }

    
    @ApiOperation("获取是否已关注大v")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "token", value = "token", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "videoId", value = "视频id", required = true, dataType = "string", paramType = "query"),
            @ApiImplicitParam(name = "anchorId", value = "大vID", required = true, dataType = "int", paramType = "query") })
    @GetMapping(value = "/getAnchorSfgz", produces = "application/json")
    public String getAnchorSfgz(@RequestParam("token") String token, @RequestParam("anchorId") int anchorId,
                                @RequestParam("videoId") String videoId)
    {
        Map<String, Object> resultMap = new HashMap<>(2);
        try
        {
            //参数校验
            if(0 >= anchorId)
            {
                resultMap.put("anchorId", "anchorId参数不可为0.");
            }
            
            if(null == videoId ||"".equals(videoId))
            {
                resultMap.put("videoId", "videoId参数不可为空.");
            }
            
            if(0 != resultMap.size())
            {
                return error(resultMap, Constants.APP_PARAM_ERROR_CODE, Constants.APP_PARAM_ERROR_MSG);
            }
            
            //是否过期
            RedisUserInfoEntity redisUserInfo = redisKit.checkTokenAndGetInfo(token);
            if(null == redisUserInfo)
            {
                return error(Constants.APP_PARAM_EXPIRED_CODE, Constants.APP_PARAM_EXPIRED_MSG);
            }
            boolean flag = bigVService.findAnchorIsCared(redisUserInfo, anchorId, videoId);
            return success(flag);
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return error(Constants.SERVER_EXCEPTION_CODE, ex.getMessage());
        }
    }
    
    
    
}