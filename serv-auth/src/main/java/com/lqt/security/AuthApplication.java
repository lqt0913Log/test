package com.lqt.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.HashMap;
import java.util.Map;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run( AuthApplication.class, args );
        Map<String,Object> map = new HashMap<>();
        map.put("1","lqt");
    }
}
