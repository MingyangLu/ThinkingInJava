package com.cywri.main;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

import static com.cywri.utils.Print.print;

public class Interface {
    public static void process(Processor processor,Object object){
        print("Using process "+processor.name());
        print(processor.process(object));
    }
    public static String s = "Disagreement with beliefs is by defination incorret.";

    public static void main(String[] args){
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
        process(new ProcessAdaptor(),s);
    }
}

interface  Processor{
    String name();
    Object process(Object input);
}

class Upcase implements Processor{
    public String name(){
        return getClass().getName();
    }

    public String process(Object input){
        String str = (String)input;
        return str.toUpperCase();
    }
}

class Downcase implements Processor{
    public String name(){
        return getClass().getName();
    }

    public String process(Object input){
        return ((String)input).toLowerCase();
    }
}

class Splitter implements Processor{
    public String name(){
        return getClass().getName();
    }

    public String process(Object input){
        String str = (String)input;
        String[] strSplit = str.split(" ");
        String result = Arrays.toString(strSplit);
        return result;
    }
}

class Filter {
    public String name(){
        return getClass().getName();
    }

    public String process(Object input){
        String str = (String)input;
        String[] strSplit = str.split(" ");
        String result = Arrays.toString(strSplit);
        return result;
    }
}

class ProcessAdaptor implements Processor{


    Filter filter = new Filter();

    public String name(){
        return filter.getClass().getName();
    }

    public String process(Object input){
        return filter.process(input);
    }
}