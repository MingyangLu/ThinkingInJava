package com.cywri.spring5_demo.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy {

    public static void main(String[] args){
        Class[] interfaces = {};
        Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserServiceHandler());
    }
}

class UserServiceHandler implements InvocationHandler{

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}