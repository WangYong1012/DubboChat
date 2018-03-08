package com.brave.utils;

import com.alibaba.fastjson.JSONObject;
import com.brave.functions.MustNotBeNull;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/3/6 0006
 * @package : com.brave.utils
 * @describe :
 **/
public class CheckParamsKit
{
    /**
     * 2018年3月6日 13:53:53
     * 检查对象的属性是否符合要求
     * @param obj
     * @return
     */
    public static Map<String, Object> checkObject(Object obj)
    {
        Map<String, Object> resultMap = new HashMap<>(5);
        try
        {
            Class cls = obj.getClass();
            Field[] fields = cls.getDeclaredFields();
            //请注意校验参数的种类
            for(Field field : fields)
            {
                field.setAccessible(true);
                Annotation annotation = field.getAnnotation(MustNotBeNull.class);
                if(null != annotation)
                {
                    //当前的参数不可为空, 就做非空校验
                    //1.Integer
                    if(field.getType() == int.class)
                    {
                        int value = (int) field.get(obj);
                        if(0 == value)
                        {
                            resultMap.put(field.getName(), field.getName() + "参数不可为0.");
                        }
                    }

                    //2.Double
                    if(field.getType() == double.class)
                    {
                        double value = (double) field.get(obj);
                        if(0 == value)
                        {
                            resultMap.put(field.getName(), field.getName() + "参数不可为0.");
                        }
                    }

                    //3.Long
                    if(field.getType() == long.class)
                    {
                        double value = (long) field.get(obj);
                        if(0 == value)
                        {
                            resultMap.put(field.getName(), field.getName() + "参数不可为0.");
                        }
                    }

                    //4.String
                    if(field.getType() == String.class)
                    {
                        String value = (String) field.get(obj);
                        if(StrKit.isBlank(value) || "".equals(value))
                        {
                            resultMap.put(field.getName(), field.getName() + "参数不可为空.");
                        }
                        //额外加一个手机号校验,手机号统一使用String类型,以便校验
                        if("mobile".equalsIgnoreCase(field.getName()))
                        {
                            boolean result = MobileKit.validMobile(value);
                            if(!result)
                                resultMap.put(field.getName(), field.getName() + "参数格式不正确.");
                        }
                        if("verifyCode".equalsIgnoreCase(field.getName()))
                        {
                            boolean result = VerifyCodeKit.validVerifyCode(value);
                            if(!result)
                                resultMap.put(field.getName(), field.getName() + "参数格式不正确.");
                        }
                    }

                    //6.List
                    if(field.getType() == List.class)
                    {
                        List list = (List) field.get(obj);
                        if(null == list || list.isEmpty())
                        {
                            resultMap.put(field.getName(), field.getName() + "参数不可为空.");
                        }
                    }

                    //7.Map
                    if(field.getType() == Map.class)
                    {
                        Map map = (Map) field.get(obj);
                        if(null == map || map.isEmpty())
                        {
                            resultMap.put(field.getName(), field.getName() + "参数不可为空.");
                        }
                    }
                }
            }
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return resultMap;
    }
}