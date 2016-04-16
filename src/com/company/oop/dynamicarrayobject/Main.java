package com.company.oop.dynamicarrayobject;

/**
 * Created by Mike on 31.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        ObjectArray objectArray = new ObjectArray();

        objectArray.add(0).add(1).add(2).add(3).add(4);

        System.out.println(objectArray.getObject(4));

        objectArray.delete(0);

        for (int i = 0; i < objectArray.size() ; i++) {
            System.out.print(objectArray.getObject(i) + " ");
        }
    }
}
