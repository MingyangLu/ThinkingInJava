package com.cywri.spring5_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThreadDemo extends Thread {

    private String tname;

    private User user;

    public void setUser(User user) {
        this.user = user;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    @Override
    public void run(){
            synchronized (user){
                user.add();
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                user.notify();
                System.out.println(tname+"已完成");
            }

    }
}
