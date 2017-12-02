package com;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
public class Application extends SpringBootServletInitializer {
    /**
     * Main Start
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Value("${jdbc.ule_minishop_item-master.url}")
    private String jdbcUrl;

    @Value("${jdbc.ule_minishop_item-master.username}")
    private String jdbcUsername;

    @Value("${jdbc.ule_minishop_item-master.password}")
    private String jdbcPassword;

    @Value("${jdbc.ule_minishop_item-master.initialSize}")
    private Integer jdbcInitialSize;

    @Value("${jdbc.ule_minishop_item-master.maxActive}")
    private Integer jdbcMaxActive;

    @Value("${jdbc.ule_minishop_item-master.maxIdle}")
    private Integer jdbcMaxIdle;

    @Value("${jdbc.ule_minishop_item-master.minIdle}")
    private Integer jdbcMinIdle;

    @Bean
    public DataSource getDataSource(){
        HikariConfig hikariConfig = new HikariConfig();
        hikariConfig.setDriverClassName("com.mysql.jdbc.Driver");
        hikariConfig.setJdbcUrl(jdbcUrl);
        hikariConfig.setUsername(jdbcUsername);
        hikariConfig.setPassword(jdbcPassword);
        hikariConfig.setMinimumIdle(5);
        hikariConfig.setMaximumPoolSize(jdbcMaxActive);
        hikariConfig.setConnectionTestQuery("SELECT 1");
        hikariConfig.setConnectionTimeout(3000);
        hikariConfig.setIdleTimeout(300000);
        hikariConfig.setMaxLifetime(1800000);
        HikariDataSource dataSource = new HikariDataSource(hikariConfig);
        return dataSource;
    }
}