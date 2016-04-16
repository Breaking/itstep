package com.company.oop.employees;

import java.math.BigDecimal;

/**
 * Created by Mike on 05.04.2016.
 */
public class HourSalaryEmployee extends AbstractEmployee implements Salary {
    private BigDecimal rate;
    private int hours;

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public BigDecimal getSalary() {
        return rate.multiply(BigDecimal.valueOf(hours));
    }

    @Override
    public void print() {
        System.out.println(getName() + " hour salary employee with salary -" + getSalary());
        System.out.println("rate - " + rate + " hours - " + hours);
        System.out.println("works in - " + getDepartment().getTitle());
    }
}
