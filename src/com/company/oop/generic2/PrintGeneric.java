package com.company.oop.generic2;

/**
 * Created by Mike on 12.04.2016.
 */
public class PrintGeneric<T> {
    private T t;  //T - class (like x v uravnenii)

    public PrintGeneric(T t) {
        this.t = t;
    }

    public String toString() {
        return "{" + t + "}";
    }

    public T getObject(){
        return t;
    }
}