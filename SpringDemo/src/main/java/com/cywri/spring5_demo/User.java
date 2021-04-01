package com.cywri.spring5_demo;

import org.springframework.beans.factory.BeanNameAware;

public class User implements BeanNameAware {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
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
        userService.update();
    }


    public void setBeanName(String s) {
        beanId = s;
    }
}

