package com.lqt.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import zipkin2.server.internal.EnableZipkinServer;

import javax.sql.DataSource;

@SpringBootApplication
@EnableZipkinServer  // 开启 ZipkinServer
public class ZipkinSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipkinSpringApplication.class,args);
    }
    // 事务管理器
    @Bean
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }
}
