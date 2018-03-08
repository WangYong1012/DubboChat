package com.brave;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/2/23 0023
 * @package : com.brave
 * @describe :
 **/
@EnableSwagger2
@SpringBootApplication
public class ConsumerApplicationBootstrap
{
    //SLF4J
    private static final Logger log = LoggerFactory.getLogger(ConsumerApplicationBootstrap.class);
    
    //程序起点
    public static void main(String[] args)
    {
        SpringApplication.run(ConsumerApplicationBootstrap.class, args);
        log.info("Consumer Application started..");
    }
}