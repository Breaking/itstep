package com.company.oop.dynamicarrayobject2;

/**
 * Created by Mike on 31.03.2016.
 */

//dynamic array with Printable
public class Main {
    public static void main(String[] args) {
        ObjectArray objectArray = new ConsoleOutputObjectArray();

        Contact contact1 = new Contact("Vasya", "123");
        Contact contact2 = new Contact("Petya", "456");

        objectArray.add(contact1);
        objectArray.add(contact2);
        objectArray.add("2").add(1);

        objectArray.printArray();

        System.out.println();


        objectArray = new ObjectArray() {
            @Override
            public void printArray() {
                for (int i = 0; i < size() ; i++) {
                    System.out.println(getObject(i));
                }
                System.out.println();
            }
        };

        objectArray.add("1").add("2").add("3");

        objectArray.printArray();

        System.out.println(objectArray.getObject(2));

        System.out.println();
        objectArray.delete(1);

        for (int i = 0; i < objectArray.size() ; i++) {
            System.out.println(objectArray.getObject(i));

        }

    }
}
