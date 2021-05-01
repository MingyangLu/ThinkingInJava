package com.cywri.spring5_demo;

import com.cywri.spring5_demo.user.User;

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
