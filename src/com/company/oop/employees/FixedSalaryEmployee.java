package com.company.oop.employees;

import java.math.BigDecimal;

/**
 * Created by Mike on 05.04.2016.
 */
public class FixedSalaryEmployee extends AbstractEmployee implements Salary {
    private BigDecimal salary;

    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println(getName() + " fixed salary employee with salary - " + getSalary());
        System.out.println("works in - " + getDepartment().getTitle());
    }
}
