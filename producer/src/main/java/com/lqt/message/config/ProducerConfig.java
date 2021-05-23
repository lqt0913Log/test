package com.lqt.message.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
@Getter
@Setter
@ConfigurationProperties(prefix = "rocketmq.producer")
@Configuration
public class ProducerConfig {
    private String namesrvAddr;
    private String groupName;

//    public String getNamesrvAddr() {
//        return namesrvAddr;
//    }
//
//    public void setNamesrvAddr(String namesrvAddr) {
//        this.namesrvAddr = namesrvAddr;
//    }
//
//    public String getGroupName() {
//        return groupName;
//    }
//
//    public void setGroupName(String groupName) {
//        this.groupName = groupName;
//    }
}
