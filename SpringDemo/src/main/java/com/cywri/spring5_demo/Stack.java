package com.cywri.spring5_demo;

import java.util.LinkedList;

public class Stack<T> {

    protected LinkedList<T> storage = new LinkedList<T>();

    public void push(T t){
        storage.addFirst(t);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    public String toString() {
        return storage.toString();
    }
}
