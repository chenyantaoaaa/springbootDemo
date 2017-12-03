package com.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * springboot属性配置bean
 *
 * Created by chenyantao
 * 2017/12/3.
 */
@ConfigurationProperties
public class ConfigBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
