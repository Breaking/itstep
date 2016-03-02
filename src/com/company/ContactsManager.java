package com.company;

import java.util.Scanner;

/**
 * Created by Mike on 16.02.2016.
 */
public class ContactsManager {
    public static int MAX = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[MAX];
        String[] phones = new String[MAX];
        String[] addresses = new String[MAX];
        int[] daysOfBirthdays = new int[MAX];
        int[] monthsOfBirthdays = new int[MAX];
        int[] yearsOfBirthdays = new int[MAX];

        boolean[] ids = new boolean[MAX];

        while (true) {
            System.out.println("*******Contacts manager********");
            System.out.println("Enter your choice: ");
            System.out.println("1-Add");
            System.out.println("2-Delete");
            System.out.println("3-Search");
            System.out.println("4-View all");
            System.out.println("5-Sort contacts");
            System.out.println("0-Exit");
            //System.out.println();
            String mainMenu = scanner.nextLine();

            if ("0".equals(mainMenu)) {
                System.out.println("Bye :)");
                break;
            } else if ("1".equals(mainMenu)) {
                addContact(scanner, names, phones, addresses, daysOfBirthdays, monthsOfBirthdays, yearsOfBirthdays, ids);
            } else if ("2".equals(mainMenu)) {
                deleteContact(scanner, ids);
            } else if ("4".equals(mainMenu)) {
                viewAllContacts(names, phones, addresses, daysOfBirthdays, monthsOfBirthdays, yearsOfBirthdays, ids);
            } else if ("5".equals(mainMenu)) {
                sortChoice(scanner, names, ids);
            } else {
                System.out.println("Incorrect input");
            }
        }

    }


    public static void printHeader() {
        System.out.println("All records: ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("| ID |        NAME       |    PHONE    |         ADDRESS         | BIRTHDAY |");
        System.out.println("-----------------------------------------------------------------------------");

    }

    public static void printLine(){

    }

    public static void viewAllContacts(String[] names, String[] phones, String[] addresses, int[] daysOfBirthdays, int[] monthsOfBirthdays,
                                       int[] yearsOfBirthdays, boolean[] ids) {
        printHeader();
        for (int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                System.out.printf("|" + "%5s", i + "|");
                System.out.printf("%20s", names[i] + "|");
                System.out.printf("%14s", phones[i] + "|");
                System.out.printf("%26s", addresses[i] + "|");
                System.out.printf(" %10s", daysOfBirthdays[i] + "." + monthsOfBirthdays[i] + "." + yearsOfBirthdays[i] + "|");
                System.out.println();
            }
        }
        System.out.println("-----------------------------------------------------------------------------");
    }

    public static void addContact(Scanner scanner, String[] names, String[] phones, String[] addresses, int[] daysOfBirthdays, int[] monthsOfBirthdays,
                                  int[] yearsOfBirthdays, boolean[] ids) {
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

        int id = findId(ids);
        names[id] = name;
        phones[id] = phone;
        addresses[id] = address;
        daysOfBirthdays[id] = dayOfBirthday;
        monthsOfBirthdays[id] = monthOfBirthday;
        yearsOfBirthdays[id] = yearOfBirthday;
        ids[id] = true;
    }

    public static void deleteContact(Scanner scanner, boolean[] ids) {
        System.out.println("|Deleting|");
        System.out.println("Enter ID number:");
        int id = Integer.valueOf(scanner.nextLine());
        if (id < MAX && ids[id]) {
            ids[id] = false;
            System.out.println("Contact deleted!");
        } else {
            System.out.println("There is no contact with this ID!!!");
        }

    }

    public static void sortChoice(Scanner scanner, String[] names, boolean[] ids) {
        System.out.println("|Sorting|");

        while (true) {
            System.out.println("1-Sort by NAME");
            System.out.println("2-Sort by Year of Birth");
            System.out.println("0-Back to previous menu");

            String sortMenu = scanner.nextLine();
            if ("0".equals(sortMenu)) {
                break;
            } else if ("1".equals(sortMenu)) {
                sortViewByName(ids, names);
            } else if ("2".equals(sortMenu)) {

            } else {
                System.out.println("Incorrect input");
            }
        }

    }

    public static void sortViewByName(boolean[] ids, String[] names){
        int minI = 0;
        int k = 0;
        String[] namesSearch = new String[ids.length];





    }

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
