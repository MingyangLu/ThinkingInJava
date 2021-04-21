package com.cywri.spring5_demo;

import com.cywri.spring5_demo.bean.Dept;
import com.cywri.spring5_demo.bean.MyBean;
import com.cywri.spring5_demo.bean.Order;
import com.cywri.spring5_demo.bean.ThreadWait;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.*;

public class TestBean {

    public static void main(String[] args){
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        //获取bean对象
        User user1 = applicationContext.getBean("user",User.class);
        User user2 = applicationContext.getBean("user",User.class);

        ThreadDemo threadDemo1 = new ThreadDemo();
        ThreadWait threadDemo2 = new ThreadWait();
        threadDemo1.setTname("线程一");
        threadDemo1.setUser(user1);
        threadDemo2.setTname("线程二");
        threadDemo2.setUser(user2);


        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("a",new Object());
        hashMap.put("b",new Object());
        hashMap.put("c",new Object());
        hashMap.put("a",new Object());

        threadDemo1.start();
        threadDemo2.start();
        System.out.println(user1);
        System.out.println(user2);


    }

    @Test
    public void testOrder(){
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        Order order =  applicationContext.getBean("order",Order.class);
        System.out.println("bean可以使用了（对象获取）");
        ((ClassPathXmlApplicationContext) applicationContext).close();

    }
}
