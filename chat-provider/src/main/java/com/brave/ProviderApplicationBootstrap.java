package com.brave;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : WangYong
 * @project : DubboChat
 * @creatDate : 2018/2/23 0023
 * @package : com.brave
 * @describe :
 **/
@SpringBootApplication
public class ProviderApplicationBootstrap
{
    //SLF4J
    private static final Logger log = LoggerFactory.getLogger(ProviderApplicationBootstrap.class);
    
    //程序起点
    public static void main(String[] args)
    {
        SpringApplication.run(ProviderApplicationBootstrap.class, args);
        log.info("Provider Application started..");
    }
}