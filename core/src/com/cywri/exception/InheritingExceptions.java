package com.cywri.exception;

class SimpleException extends Exception{}

public class InheritingExceptions{
    public void f() throws SimpleException{
        System.out.println("This exception from f():");
        throw new SimpleException();
    }


    public static void main(String[] args){
        InheritingExceptions sed = new InheritingExceptions();
        try {
            sed.f();
        } catch (SimpleException e) {
            System.err.println("Catch it!");
        }

    }

}
