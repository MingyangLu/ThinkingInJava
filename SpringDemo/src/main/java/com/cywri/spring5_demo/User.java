package com.cywri.spring5_demo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class User {

    @Test
    public void test(){
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //获取bean对象
        User user = applicationContext.getBean("user",User.class);

        user.add();

    }

    public void add(){
        System.out.println("add......");
    }
}

