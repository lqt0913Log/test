package com.lqt.common;

import com.lqt.common.domain.TestBean;
import com.lqt.common.processor.TestBeanProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ TestBeanProcessor.class})
public class CommonApplication {
    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(CommonApplication.class,args);
    }
    @ConditionalOnMissingBean
    @Bean(initMethod = "initFromBean",destroyMethod = "destroyFromBean")
    public TestBean testBean(){
        return new TestBean("testBean"){{
            setName("testName");
        }};
    }
}
