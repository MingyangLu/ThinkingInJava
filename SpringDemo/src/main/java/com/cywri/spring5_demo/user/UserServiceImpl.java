package com.cywri.spring5_demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public void add() {

    }

    public void update(){
       System.out.println("UserServiceImpl.update");
       userDao.update();
    }

    @Override
    public int update(int id) {
        return id;
    }

}
