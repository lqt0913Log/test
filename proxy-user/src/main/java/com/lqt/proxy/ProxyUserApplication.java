package com.lqt.proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@EnableDiscoveryClient
@EnableHystrixDashboard
//@EnableHystrix
//@EnableCircuitBreaker
public class ProxyUserApplication {
    public static void main(String[] args) {
        SpringApplication.run( ProxyUserApplication.class, args );
        readFileContent("E:\\1.txt");
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static String readFileContent(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        StringBuffer sbf = new StringBuffer();
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempStr;
            while ((tempStr = reader.readLine()) != null) {
                sbf.append(tempStr);
            }
            reader.close();
            return sbf.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return sbf.toString();
    }
}
