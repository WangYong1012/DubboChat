package com.brave.functions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author : WangYong
 * @project : ChatServer
 * @creatDate : 2018-01-03
 * @package : com.jnxbkp.funcs
 * @describe :
 **/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MustNotBeNull
{
    //参数不可为空接口
    boolean value() default true;
}
