package com.cywri.main;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UpConvertDemo {

    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        Collection<String> collection = new ArrayList<>();
        Class clazz1 = list.getClass();
        System.out.println(clazz1.getName());
        Method[] methods = clazz1.getMethods();
        for (Method method:
             methods) {
            System.out.println(method);
        }

        Class clazz2 = list.getClass();
        System.out.println(clazz2.getName());
        Method[] methods2 = clazz2.getMethods();
        for (Method method:
                methods2) {
            System.out.println(method);
        }


    }
}
