package com.company.oop.employees;

/**
 * Created by Mike on 09.04.2016.
 */
public class NewEmployee extends AbstractEmployee {

    @Override
    public void print() {
        System.out.println(getName() + " - trainee");
        System.out.println("works in - " + getDepartment().getTitle());

    }
}
