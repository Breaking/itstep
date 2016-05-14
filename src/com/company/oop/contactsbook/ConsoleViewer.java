package com.company.oop.contactsbook;

/**
 * Created by Mike on 21.04.2016.
 */
public class ConsoleViewer {

    private ConsoleViewer() {
    }

    public static void showMenu() {
        System.out.println("*******Contacts manager********");
        System.out.println("Enter your choice: ");
        System.out.println("1-Add");
        System.out.println("2-Delete");
        System.out.println("3-Search");
        System.out.println("4-View all");
        System.out.println("5-Sort contacts");
        System.out.println("0-Exit");
    }

    public static void addMessage() {
        System.out.println("|Adding|");
    }

    public static void byeMessage() {
        System.out.println("Bye :)");
    }

    public static void errorMessage() {
        System.out.println("Incorrect input");
    }

    public static void viewAll(Contact[] contacts) {
        System.out.println("All records: ");
        printHeader();
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.printf("|" + "%5s", contacts[i].getId() + "|");
                System.out.printf("%20s", contacts[i].getName() + "|");
                System.out.printf("%14s", contacts[i].getPhone() + "|");
                System.out.printf("%26s", contacts[i].getAddress() + "|");
                System.out.printf("%13s", contacts[i].getDayOfBirthday() + "." + contacts[i].getMonthOfBirthday() +
                        "." + contacts[i].getYearOfBirthday() + "|");
                System.out.println();
            } else
                break;
        }
        printFooter();
    }

    public static void printHeader() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| ID |        NAME       |    PHONE    |         ADDRESS         |  BIRTHDAY  |");
        System.out.println("-------------------------------------------------------------------------------");

    }

    public static void printFooter() {
        System.out.println("-------------------------------------------------------------------------------");
    }

}
