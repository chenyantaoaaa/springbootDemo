package com.pojo.dataBase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by chenyantao
 * 2017/12/3.
 */
@PropertySource(value="classpath:jdbc2.properties")
@Component
public class DataBaseBean {
    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcPassword;

    @Value("${jdbc.initialSize}")
    private Integer jdbcInitialSize;

    @Value("${jdbc.maxActive}")
    private Integer jdbcMaxActive;

    @Value("${jdbc.maxIdle}")
    private Integer jdbcMaxIdle;

    @Value("${jdbc.minIdle}")
    private Integer jdbcMinIdle;

    public String getJdbcUrl() {
        return jdbcUrl;
    }

    public void setJdbcUrl(String jdbcUrl) {
        this.jdbcUrl = jdbcUrl;
    }

    public String getJdbcUsername() {
        return jdbcUsername;
    }

    public void setJdbcUsername(String jdbcUsername) {
        this.jdbcUsername = jdbcUsername;
    }

    public String getJdbcPassword() {
        return jdbcPassword;
    }

    public void setJdbcPassword(String jdbcPassword) {
        this.jdbcPassword = jdbcPassword;
    }

    public Integer getJdbcInitialSize() {
        return jdbcInitialSize;
    }

    public void setJdbcInitialSize(Integer jdbcInitialSize) {
        this.jdbcInitialSize = jdbcInitialSize;
    }

    public Integer getJdbcMaxActive() {
        return jdbcMaxActive;
    }

    public void setJdbcMaxActive(Integer jdbcMaxActive) {
        this.jdbcMaxActive = jdbcMaxActive;
    }

    public Integer getJdbcMaxIdle() {
        return jdbcMaxIdle;
    }

    public void setJdbcMaxIdle(Integer jdbcMaxIdle) {
        this.jdbcMaxIdle = jdbcMaxIdle;
    }

    public Integer getJdbcMinIdle() {
        return jdbcMinIdle;
    }

    public void setJdbcMinIdle(Integer jdbcMinIdle) {
        this.jdbcMinIdle = jdbcMinIdle;
    }
}
