package com.company.oop.contactsmanager;

import java.util.Scanner;

/**
 * Created by Mike on 12.03.2016.
 */
public class ContactsManager {
    public static int MAX_RECORDS = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] ids = new boolean[MAX_RECORDS];
        Contact[] contacts = new Contact[MAX_RECORDS];

        while (true) {
            System.out.println("*******Contacts manager********");
            System.out.println("Enter your choice: ");
            System.out.println("1-Add");
            System.out.println("2-Delete");
            System.out.println("3-Search");
            System.out.println("4-View all");
            System.out.println("5-Sort contacts");
            System.out.println("0-Exit");

            String mainMenu = scanner.nextLine();

            if ("0".equals(mainMenu)) {
                System.out.println("Bye :)");
                break;
            } else if ("1".equals(mainMenu)) {
                addContact(scanner, ids, contacts);
            } else if ("2".equals(mainMenu)) {

            } else if ("3".equals(mainMenu)) {

            } else if ("4".equals(mainMenu)) {
                viewAllContacts(contacts);
            } else {
                System.out.println("Incorrect input");
            }

        }

    }

    public static void printHeader() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| ID |        NAME       |    PHONE    |         ADDRESS         |  BIRTHDAY  |");
        System.out.println("-------------------------------------------------------------------------------");

    }

    public static void printFooter() {
        System.out.println("-------------------------------------------------------------------------------");
    }


    public static void addContact(Scanner scanner, boolean[] ids, Contact[] contacts) {
        System.out.println("|Adding|");
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter phone");
        String phone = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        System.out.println("Enter date of birthday:");
        System.out.println("Enter day");
        int dayOfBirthday = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter month");
        int monthOfBirthday = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter year");
        int yearOfBirthday = Integer.valueOf(scanner.nextLine());

        Contact contact = new Contact(name, phone, address, dayOfBirthday, monthOfBirthday, yearOfBirthday);

        contacts[findId(ids)] = contact;

    }

    public static void viewAllContacts(Contact[] contacts) {
        System.out.println("All records: ");
        printHeader();
        for (int i = 0; i < contacts.length; i++) {
            if (contacts[i] != null) {
                System.out.printf("|" + "%5s", i + "|");
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

    //Searching place(id) for a new contact
    public static int findId(boolean[] ids) {
        for (int i = 0; i < ids.length; i++) {
            if (!ids[i]) {
                return i;
            }
        }
        System.out.println("ERROR");
        return -1;
    }
}
