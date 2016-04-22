package com.company.oop.contactsbook;

/**
 * Created by Mike on 09.04.2016.
 */
public class BookService implements IBookService {

    private ContactArray contactArray = new ContactArray();

    @Override
    public void add(Contact contact) {
        contactArray.add(contact);
    }

    @Override
    public void delete(int index) {

    }

    @Override
    public Contact[] getAll() {
        return contactArray.getContacts();
    }

    @Override
    public void view(int index) {
    }

    @Override
    public void edit(int index) {

    }
}
