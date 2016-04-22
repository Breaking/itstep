package com.company.oop.contactsbook;

/**
 * Created by Mike on 09.04.2016.
 */
public class ContactArray {
    private Contact[] contacts;

    public ContactArray(){
        this(0);
    }

    public ContactArray(int size){
        contacts = new Contact[size];
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public Contact getContact(int index){
        return contacts[index];
    }

    public int size(){
        return contacts.length;
    }

    public ContactArray add(Contact contact){
        Contact[] contacts1 = new Contact[contacts.length + 1];

        for (int i = 0; i < contacts.length ; i++) {
            contacts1[i] = contacts[i];
        }

        contacts1[contacts1.length - 1] = contact;
        contacts = contacts1;

        return this;
    }

    public ContactArray delete(int index){
        Contact[] contacts1 = new Contact[contacts.length - 1];
        int index1 = 0;

        for (int i = 0; i < contacts.length ; i++) {
            if (i != index){
                contacts1[index1] = contacts[i];
                index1++;
            }
        }

        contacts = contacts1;

        return this;

    }


}
