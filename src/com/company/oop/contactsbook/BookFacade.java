package com.company.oop.contactsbook;

/**
 * Created by Mike on 09.04.2016.
 */
public class BookFacade implements IBookFacade{
    private IBookService bookService;

    public BookFacade(IBookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void add(Contact contact) {
        bookService.add(contact);
    }

    @Override
    public Contact[] getAll() {
        return bookService.getAll();
    }
}
