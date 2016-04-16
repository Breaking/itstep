package com.company.oop.employees;

import javax.swing.*;
import java.math.BigDecimal;

/**
 * Created by Mike on 08.04.2016.
 */
public class EmployeeFactory {
    public AbstractEmployee create(AbstractEmployee employee){
        if (employee instanceof FixedSalaryEmployee){
            fillFixedSalaryEmployee((FixedSalaryEmployee)employee);
        } else if(employee instanceof HourSalaryEmployee){
            fillHourSalaryEmployee((HourSalaryEmployee)employee);
        } else if(employee instanceof NewEmployee){
            fillNewEmployee((NewEmployee)employee);
        }
        return employee;
    }

    private void fillFixedSalaryEmployee(FixedSalaryEmployee employee){
        employee.setName(JOptionPane.showInputDialog("name: "));
        employee.setSalary(BigDecimal.valueOf(Long.valueOf(JOptionPane.showInputDialog("salary: "))));

    }

    private void fillHourSalaryEmployee(HourSalaryEmployee employee){
        employee.setName(JOptionPane.showInputDialog("name: "));
        employee.setHours(Integer.valueOf(JOptionPane.showInputDialog("hours: ")));
        employee.setRate(BigDecimal.valueOf(Long.valueOf(JOptionPane.showInputDialog("rate: "))));
    }

    private void fillNewEmployee(NewEmployee employee){
        employee.setName(JOptionPane.showInputDialog("name: "));
    }

}
