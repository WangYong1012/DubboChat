package com.brave.v1.index.controller;

import com.brave.base.BaseController;
import com.brave.entity.user.RedisUserInfoEntity;
import com.brave.response.IndexPageResponse;
import com.brave.service.index.IIndexPageService;
import com.brave.utils.Constants;
import com.brave.tools.RedisKit;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/1 0001
 * @package : com.brave.v1.index.controller
 * @describe :
 **/
@Api(value = "首页相关", description = "APP首页使用到的接口")
@RestController
@RequestMapping("/v1/user")
public class IndexController extends BaseController
{
    @Autowired
    private RedisKit redisKit;
    @Autowired
    private IIndexPageService indexPageService;

    /**
     * 2018年3月6日 15:48:59
     * 首页-新人列表
     * @param pageNumber
     * @param pageSize
     * @param token
     * @return
     */
    @ApiOperation("首页-新人列表")
    @GetMapping(value = "/new/{pageNumber}/{pageSize}/{token}", produces = "application/json")
    public String indexNew(@PathVariable("pageNumber") int pageNumber, @PathVariable("pageSize") int pageSize,
                           @PathVariable("token") String token)
    {
        Map<String, Object> resultMap = new HashMap<>(3);
        try
        {
            //参数校验
            if(0 >= pageNumber)
            {
                resultMap.put("pageNumber", "pageNumber参数不可为0.");
            }
            if(0 >= pageSize)
            {
                resultMap.put("pageSize", "pageSize参数不可为0.");
            }
            if(0 >= resultMap.size())
            {
                return error(resultMap, Constants.APP_PARAM_ERROR_CODE, Constants.APP_PARAM_ERROR_MSG);
            }
            //是否过期
            RedisUserInfoEntity redisUserInfo = redisKit.checkTokenAndGetInfo(token);
            if(null == redisUserInfo)
            {
                return error(Constants.APP_PARAM_EXPIRED_CODE, Constants.APP_PARAM_EXPIRED_MSG);
            }
            //查询
            List<IndexPageResponse> indexNewList = indexPageService.getIndexNewList(pageSize, pageNumber);
            if(null == indexNewList)
            {
                throw new Exception(Constants.SERVER_EXCEPTION_MSG);
            }else
            {
                return success(indexNewList);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return error(Constants.SERVER_EXCEPTION_CODE, ex.getMessage());
        }
    }

    /**
     * 2018年3月6日 15:49:39
     * 首页-关注列表
     * @param pageNumber
     * @param pageSize
     * @param token
     * @return
     */
    @ApiOperation("首页-关注列表")
    @GetMapping(value = "/care/{pageNumber}/{pageSize}/{token}", produces = "application/json")
    public String indexCare(@PathVariable("pageNumber") int pageNumber, @PathVariable("pageSize") int pageSize,
                            @PathVariable("token") String token)
    {
        Map<String, Object> resultMap = new HashMap<>(3);
        try
        {
            //参数校验
            if(0 >= pageNumber)
            {
                resultMap.put("pageNumber", "pageNumber参数不可为0.");
            }
            if(0 >= pageSize)
            {
                resultMap.put("pageSize", "pageSize参数不可为0.");
            }
            if(0 >= resultMap.size())
            {
                return error(resultMap, Constants.APP_PARAM_ERROR_CODE, Constants.APP_PARAM_ERROR_MSG);
            }
            //是否过期
            RedisUserInfoEntity redisUserInfo = redisKit.checkTokenAndGetInfo(token);
            if(null == redisUserInfo)
            {
                return error(Constants.APP_PARAM_EXPIRED_CODE, Constants.APP_PARAM_EXPIRED_MSG);
            }
            return success(indexPageService.getIndexCareList(pageSize, pageNumber, redisUserInfo.getId()));
        }catch(Exception ex)
        {
            return error(Constants.SERVER_EXCEPTION_CODE, ex.getMessage());
        }
    }

    /**
     * 2018年3月6日 15:49:50
     * 首页-推荐列表
     * @param pageNumber
     * @param pageSize
     * @param token
     * @return
     */
    @ApiOperation("首页-推荐列表")
    @GetMapping(value = "/recommend/{pageNumber}/{pageSize}/{token}", produces = "application/json")
    public String indexRecommend(@PathVariable("pageNumber") int pageNumber, @PathVariable("pageSize") int pageSize,
                                 @PathVariable("token") String token)
    {
        Map<String, Object> resultMap = new HashMap<>(3);
        try
        {
            //参数校验
            if(0 >= pageNumber)
            {
                resultMap.put("pageNumber", "pageNumber参数不可为0.");
            }
            if(0 >= pageSize)
            {
                resultMap.put("pageSize", "pageSize参数不可为0.");
            }
            if(0 >= resultMap.size())
            {
                return error(resultMap, Constants.APP_PARAM_ERROR_CODE, Constants.APP_PARAM_ERROR_MSG);
            }
            //数据过期
            RedisUserInfoEntity redisUserInfo = redisKit.checkTokenAndGetInfo(token);
            if(null == redisUserInfo)
            {
                return error(Constants.APP_PARAM_EXPIRED_CODE, Constants.APP_PARAM_EXPIRED_MSG);
            }
            //查询数据
            List<IndexPageResponse> responseList = indexPageService.getIndexRecommendList(pageSize, pageNumber);
            if(null == responseList)
            {
                throw new Exception(Constants.SERVER_EXCEPTION_MSG);
            }else
            {
                return success(responseList);
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
            return error(Constants.SERVER_EXCEPTION_CODE, ex.getMessage());
        }
    }
}