package com.cywri.spring5_demo.user;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao {

    void update(){
        System.out.println("UserDao.update");
    };
}
