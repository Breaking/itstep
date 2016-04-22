package com.company.oop.contactsbook;

/**
 * Created by Mike on 21.04.2016.
 */
public interface IBookFacade {
    void add(Contact contact);
    Contact[] getAll();
}
