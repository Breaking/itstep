package com.company.oop.contactsbook;

import javax.swing.*;

/**
 * Created by Mike on 19.04.2016.
 */
public class ContactFactory {

    public Contact create(){
        Contact contact = new Contact();
        contact.setId(Long.valueOf(JOptionPane.showInputDialog("id: ")));
        contact.setName(JOptionPane.showInputDialog("name: "));
        contact.setPhone(JOptionPane.showInputDialog("phone: "));
        contact.setAddress(JOptionPane.showInputDialog("address: "));
        contact.setDayOfBirthday(Integer.valueOf(JOptionPane.showInputDialog("day: ")));
        contact.setMonthOfBirthday(Integer.valueOf(JOptionPane.showInputDialog("month: ")));
        contact.setYearOfBirthday(Integer.valueOf(JOptionPane.showInputDialog("year: ")));

        return contact;
    }
}
