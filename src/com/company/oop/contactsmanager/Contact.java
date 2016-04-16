package com.company.oop.contactsmanager;

/**
 * Created by Mike on 12.03.2016.
 */
public class Contact {
    private String name;
    private String phone;
    private String address;
    private int dayOfBirthday;
    private int monthOfBirthday;
    private int yearOfBirthday;

    public Contact() {
    }

    public Contact(String name, String phone, String address, int dayOfBirthday, int monthOfBirthday, int yearOfBirthday) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dayOfBirthday = dayOfBirthday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearOfBirthday = yearOfBirthday;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDayOfBirthday() {
        return dayOfBirthday;
    }

    public void setDayOfBirthday(int dayOfBirthday) {
        this.dayOfBirthday = dayOfBirthday;
    }

    public int getMonthOfBirthday() {
        return monthOfBirthday;
    }

    public void setMonthOfBirthday(int monthOfBirthday) {
        this.monthOfBirthday = monthOfBirthday;
    }

    public int getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(int yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }
}
