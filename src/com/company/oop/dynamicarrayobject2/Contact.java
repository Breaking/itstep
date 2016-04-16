package com.company.oop.dynamicarrayobject2;

/**
 * Created by Mike on 14.04.2016.
 */
public class Contact implements Printable {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void print() {
        System.out.println(name + "|" + phone);
    }
}
