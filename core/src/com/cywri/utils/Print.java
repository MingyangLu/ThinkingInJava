package com.cywri.utils;

import javax.swing.*;
import java.io.PrintStream;

public class Print {

    public static void print(Object object){
        System.out.println(object);
    }

    public static void print(){
        System.out.println();
    }

    //with no break
    public static void printnb(Object object){
        System.out.println(object);
    }

    public static PrintStream printf(String format, Object... args){
        return System.out.printf(format, args);
    }
}
