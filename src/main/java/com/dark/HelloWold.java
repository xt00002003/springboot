package com.dark;

import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ProjectProperties projectProperties;

    @GetMapping(value = "/hello")
    public String hello(){
        return projectProperties.getName()+""+projectProperties.getDes();
    }
}
