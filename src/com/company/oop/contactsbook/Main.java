package com.company.oop.contactsbook;

import java.util.Scanner;

/**
 * Created by Mike on 09.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IBookService bookService = new BookService();
        IBookFacade bookFacade = new BookFacade(bookService);

        while(true){
            ConsoleViewer.showMenu();
            String mainMenu = scanner.nextLine();

            if ("0".equals(mainMenu)) {
                ConsoleViewer.byeMessage();
                break;
            } else if ("1".equals(mainMenu)) {
                ConsoleViewer.addMessage();
                ContactFactory contactFactory = new ContactFactory();
                bookFacade.add(contactFactory.create());

            } else if ("2".equals(mainMenu)) {
            } else if ("3".equals(mainMenu)) {
            } else if ("4".equals(mainMenu)) {
                ConsoleViewer.viewAll(bookFacade.getAll());
            } else {
               ConsoleViewer.errorMessage();
            }
        }
    }

}
