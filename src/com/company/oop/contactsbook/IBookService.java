package com.company.oop.contactsbook;

/**
 * Created by Mike on 05.04.2016.
 */
public interface IBookService {
    void add(Contact contact);
    void delete(int index);
    void view(int index);
    void edit(int index);
}
