package com.company.oop.generic2;

/**
 * Created by Mike on 12.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        PrintGeneric<String> stringPrintGeneric = new PrintGeneric<>("hello");
        System.out.println(stringPrintGeneric.toString());
        System.out.println(stringPrintGeneric.getObject());


        PrintGeneric<Integer> integerPrintGeneric = new PrintGeneric<>(10000);
        System.out.println(integerPrintGeneric.toString());
        System.out.println((integerPrintGeneric.getObject().doubleValue()));
    }
}
