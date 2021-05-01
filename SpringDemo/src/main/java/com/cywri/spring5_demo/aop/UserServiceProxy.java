package com.cywri.spring5_demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserServiceProxy {

    @Pointcut("execution(* com.cywri.spring5_demo.user.*.*(..))")
    public void myPoincut(){

    }

    @Before (value = "execution(* com.cywri.spring5_demo.user.User.add(..))")
    public void myBefore(JoinPoint joinPoint) {
        System.out.println( "前置通知 ： "  + joinPoint.getSignature().getName());
    }
}
