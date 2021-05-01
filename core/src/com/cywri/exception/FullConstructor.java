package com.cywri.exception;

class MyException extends Exception{
    MyException(){};
    MyException(String msg){
        super(msg);
    }
}
public class FullConstructor {
    public static void f() throws MyException{
        System.out.println("This exception from f():");
        throw new MyException();
    }

    public static void g() throws MyException{
        System.out.println("This exception from g():");
        throw new MyException("Originated from g()");
    }

    public static void main(String[] args){
        try {
            f();
        } catch (MyException e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (MyException e) {
            e.printStackTrace();
        }

    }
}
