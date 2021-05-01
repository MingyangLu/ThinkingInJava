package com.cywri.spring5_demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.cywri.spring5_demo"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
