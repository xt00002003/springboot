package com.dark;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by dark on 2017/7/6.
 */
@EnableDiscoveryClient
@SpringBootApplication
@MapperScan("com.dark.dao")
public class HelloApplication {
    public static void  main(String[] args){
        SpringApplication.run(HelloApplication.class,args);
    }
}
