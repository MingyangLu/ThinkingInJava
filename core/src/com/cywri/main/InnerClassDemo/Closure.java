package com.cywri.main.InnerClassDemo;

import java.util.function.Consumer;

public class Closure {

    private Integer length;

    public Accsee accsee = new Accsee() {
        @Override
        public Integer get() {
            return length;
        }
    };
}

interface Accsee{
    Integer get();
}