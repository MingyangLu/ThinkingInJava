package com.cywri.spring5_demo.bean;

import org.springframework.beans.factory.FactoryBean;

public class MyBean implements FactoryBean<Dept> {
    public Dept getObject() throws Exception {
        return new Dept();
    }

    public Class<?> getObjectType() {
        return Dept.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
