package com.cywri.spring5_demo;

public class UserServiceImpl implements UserService{
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void update(){
       System.out.println("UserServiceImpl.update");
       userDao.update();
    }

}
