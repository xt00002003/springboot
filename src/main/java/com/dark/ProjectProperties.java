package com.dark;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * springboot
 * User: dark xue
 * Date: 2017/7/6
 * Time: 16:32
 * description:
 */
@Component
@ConfigurationProperties(prefix = "projectMessage")
public class ProjectProperties {
    private String name;
    private String des;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
