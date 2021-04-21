package com.cywri.spring5_demo.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;


    /**
     *  bean的后置处理器，在执行创建bean的init-method前后会调用
     */
    public class BeanPost1 implements BeanPostProcessor {

        @Override
        public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("二号前置处理器执行");
            return bean;
        }

        @Override
        public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
            System.out.println("二号后置处理器执行");
            return bean;
        }
    }

