package com.cywri.main;

public class OuterClass {

    public class InnerClass{ }

    public static class StaticInnerClass{}

    public static void main(String[] args){
//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.StaticInnerClass staticInnerClass = new StaticInnerClass();
        System.out.println(staticInnerClass.toString());
    }
}
