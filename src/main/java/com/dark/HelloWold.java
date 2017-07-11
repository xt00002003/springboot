package com.dark;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot
 * User: dark xue
 * Date: 2017/7/6
 * Time: 16:16
 * description:
 */
@RestController
public class HelloWold {

    private final Logger logger=Logger.getLogger(HelloWold.class);

    @Autowired
    private ProjectProperties projectProperties;

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/hello")
    public String hello(){
        return projectProperties.getName()+""+projectProperties.getDes();
    }
    @GetMapping(value = "/index")
    public String index(){

        return projectProperties.getName()+""+projectProperties.getDes();
    }


}
