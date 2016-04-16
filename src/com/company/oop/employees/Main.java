package com.company.oop.employees;

/**
 * Created by Mike on 09.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee();
        HourSalaryEmployee hourSalaryEmployee = new HourSalaryEmployee();
        NewEmployee newEmployee = new NewEmployee();

        Department qa = new Department("QA");
        Department market = new Department("Marketing");
        Department dev = new Department("Development");

        EmployeeFactory employeeFactory = new EmployeeFactory();

        fixedSalaryEmployee = (FixedSalaryEmployee) employeeFactory.create(fixedSalaryEmployee);
        hourSalaryEmployee = (HourSalaryEmployee) employeeFactory.create(hourSalaryEmployee);
        newEmployee = (NewEmployee) employeeFactory.create(newEmployee);

        newEmployee.setDepartment(dev);
        fixedSalaryEmployee.setDepartment(market);
        hourSalaryEmployee.setDepartment(qa);




        fixedSalaryEmployee.print();
        hourSalaryEmployee.print();
        newEmployee.print();

    }
}
