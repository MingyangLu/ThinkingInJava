package com.cywri.spring5_demo.user;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User implements BeanNameAware {

    @Autowired
    private UserService userServiceImpl;

    public void setUserService(UserService userService) {
        this.userServiceImpl = userService;
    }

    private String beanId;

    public String getBeanId() {
        return beanId;
    }

    public void setBeanId(String beanId) {
        this.beanId = beanId;
    }

    public void add(){
        System.out.println("add......"+beanId);
        System.out.println("this"+this);
        userServiceImpl.update();
    }


    public void setBeanName(String s) {
        beanId = s;
    }
}

