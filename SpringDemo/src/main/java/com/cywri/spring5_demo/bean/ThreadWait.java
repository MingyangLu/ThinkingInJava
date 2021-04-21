package com.cywri.spring5_demo.bean;

import com.cywri.spring5_demo.User;

public class ThreadWait extends Thread  {
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
        try {
            synchronized (user){
                user.add();
                user.wait();
                System.out.println(tname+"已完成");
            }



        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
