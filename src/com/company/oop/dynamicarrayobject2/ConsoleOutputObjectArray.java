package com.company.oop.dynamicarrayobject2;

/**
 * Created by Mike on 14.04.2016.
 */
public class ConsoleOutputObjectArray extends ObjectArray {
    @Override
    public void printArray() {
        for (int i = 0; i < size() ; i++) {
            if (getObject(i) instanceof Printable){
                ((Printable) getObject(i)).print();
            }

        }
    }
}
