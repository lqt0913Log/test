package com.lqt.common.processor;

import com.lqt.common.domain.TestBean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof TestBean){
            System.out.println("------------BeanPostProcessor#postProcessAfterInitialization :" + beanName);
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof TestBean){
            System.out.println("------------BeanPostProcessor#postProcessBeforeInitialization :" + beanName);
        }
        return bean;
    }

}
