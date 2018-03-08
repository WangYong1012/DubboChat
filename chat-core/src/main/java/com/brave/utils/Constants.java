package com.brave.utils;

import java.math.BigDecimal;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018-02-23
 * @package : com.brave.service.util
 * @describe : 程序中所有使用的变量均需要再此命名
 **/
public class Constants
{
    //提示信息
    public static final String APP_PARAM_ERROR_CODE = "1001";
    public static final String APP_PARAM_ERROR_MSG = "传递参数错误";

    public static final String APP_VERIFYCODE_ERROR_CODE = "1002";
    public static final String APP_VERIFYCODE_ERROR_MSG = "验证码不正确";

    public static final String APP_NO_RECORD_CODE = "1003";
    public static final String APP_NO_RECORD_MSG = "没有对应记录";

    public static final String APP_PARAM_EXPIRED_CODE = "1004";
    public static final String APP_PARAM_EXPIRED_MSG = "用户数据已过期";

    public static final String VERIFYCODE_EXIST_CODE = "1005";
    public static final String VERIFYCODE_EXIST_MSG = "已经获取过验证码.";

    public static final String VERIFYCODE_EXPIRED_CODE = "1006";
    public static final String VERIFYCODE_EXPIRED_MSG = "验证码已过期.";

    public static final String USER_BALANCE_NOT_ENOUGH_CODE = "1007";
    public static final String USER_BALANCE_NOT_ENOUGH_MSG = "用户余额不足.";
    
    public static final String APP_USER_PASSWORD_ERROR_CODE = "1008";
    public static final String APP_USER_PASSWORD_ERROR_MSG = "用户名或密码错误";

    public static final String RABBIT_MQ_HAS_MESSAGE_CODE = "1009";
    public static final String RABBIT_MQ_HAS_MESSAGE_MSG = "用户存在尚未生成的账单信息, 请稍后再试.";
    
    //服务器端出错提示
    public static final String SERVER_EXCEPTION_CODE = "2001";
    public static final String SERVER_EXCEPTION_MSG = "服务器内部错误";

    public static final String SERVER_ACCOUNT_EXIST_CODE = "2002";
    public static final String SERVER_ACCOUNT_EXIST_MSG = "帐号已存在";

    public static final String SERVER_MOBILE_EXIST_CODE = "2003";
    public static final String SERVER_MOBILE_EXIST_MSG = "手机号已存在";

    public static final String SERVER_MOBILE_NO_REGISTER_CODE = "2004";
    public static final String SERVER_MOBILE_NO_REGISTER_MSG = "手机号未注册.";
    
    public static final String SERVER_NICKNAME_EXIST_CODE = "2005";
    public static final String SERVER_NICKNAME_EXIST_MSG = "昵称已存在.";

    //调用成功
    public static final String INVOKE_SUCCESS_CODE = "200";
    public static final String INVOKE_SUCCESS_MSG = "调用成功";

    public static final String OPERATE_SAVE_SUCCESS = "保存成功";


    //注册默认用户名
    public static final String DEFAULT_REGISTER_USERNAME = "普通用户";
    //注册默认头像地址
    public static final String DEFAULT_REGISTER_HEAD_URL = "http://www.jnxbkp.com/img/default-headimg.png";
    //大V认证申请
    public static final String BIGV_AUTHENTICATION = "大V认证申请";
    public static final String BIGV_AUTHENTICATION_PASS = "大V认证申请通过";

    public static final String AUTHENTICATION_EXISTS_CODE ="3001";
    public static final String AUTHENTICATION_EXISTS_MSG ="已提交过申请, 请不要重复申请.";

    //图片文件相关
    public static final String PURPOSE_IMAGE_COMMON = "COMMON";
    public static final String PURPOSE_IMAGE_POSTER = "POSTER";
    //图片类型
    public static final String FILE_TYPE_VIDEO = "VIDEO";
    public static final String FILE_TYPE_IMAGE = "IMAGE";
    //资金分成
    public static final double M_COIN_BIGV_PERCENT = 0.5;
    public static final double M_COIN_AGENT_PERCENT = 0.2;

    public static final String APP_NO_RECORD_LIVE_CODE = "300";
    public static final String APP_NO_RECORD_LIVE_MSG = "没有数据";

    
    //常量字符串
    public static final BigDecimal BIGDECIMAL_60 = BigDecimal.valueOf(60);
    public static final BigDecimal BIGDECIMAL_05 = BigDecimal.valueOf(0.5);

    public static final String ROLE_BIGV_NAME = "BIGV";
    public static final String ROLE_AGENT_NAME = "AGENT";
    public static final String ROLE_COMMON_NAME = "COMMON";




    //
    
    
    
    
    
    
    
}