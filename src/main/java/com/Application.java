package com;

import com.pojo.ConfigBean;
import com.pojo.dataBase.DataBaseBean;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * Created by chenyantao
 * 2017/12/1.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@MapperScan("com.mapper")
@PropertySource(value="classpath:jdbc2.properties")
@EnableConfigurationProperties({ConfigBean.class})
@RestController
public class Application extends SpringBootServletInitializer {

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private DataBaseBean dataBaseBean;

    @Bean
    public DataSource getDataSource(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
        hikariConfig.setJdbcUrl(dataBaseBean.getJdbcUrl());
        hikariConfig.setUsername(dataBaseBean.getJdbcUsername());
        hikariConfig.setPassword(dataBaseBean.getJdbcPassword());
        hikariConfig.setMinimumIdle(5);
        hikariConfig.setMaximumPoolSize(dataBaseBean.getJdbcMaxActive());
        hikariConfig.setConnectionTestQuery("SELECT 1");
        hikariConfig.setConnectionTimeout(3000);
        hikariConfig.setIdleTimeout(300000);
        hikariConfig.setMaxLifetime(1800000);
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;
    }

    /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    @RequestMapping("/")
    public String hexo(){
        return configBean.getName();
    }
}