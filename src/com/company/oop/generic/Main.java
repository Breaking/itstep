package com.company.oop.generic;

import com.company.oop.contactsbook.Contact;

import java.util.ArrayList;

/**
 * Created by Mike on 31.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        MyArray<Integer> integerMyArray = new MyArray<>();
        integerMyArray.add(1).add(2).add(3);

        System.out.println(integerMyArray.getObject(1));

        MyArray<Contact> contactMyArray = new MyArray<>();
        contactMyArray.add(new Contact());
        contactMyArray.add(new Contact());
        contactMyArray.add(new Contact());
        for (int i = 0; i <contactMyArray.size() ; i++) {
            System.out.println(contactMyArray.getObject(i).getName());
            System.out.println(contactMyArray.getObject(i).getPhone());
        }


        ArrayList<String> strings = new ArrayList<>();
        strings.add("123");
        for (int i = 0; i < strings.size(); i++){
            System.out.println(strings.get(i));
        }

    }
}
