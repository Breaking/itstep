package com.company.oop.contactsbook;

/**
 * Created by Mike on 05.04.2016.
 */
public class Contact {
    private long id;
    private String name;
    private String phone;
    private String address;
    private int dayOfBirthday;
    private int monthOfBirthday;
    private int yearOfBirthday;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
