package com.rakshithashri.assignment.utilities;

import java.util.List;

import com.rakshithashri.assignment.employees.Employee;

public class EmployeeUtilities {
	 /**
     * Calculates the total salary of all employees in the list.
     *
     * @param employees the list of employees
     * @return the total salary
     */
    public static double calculateTotalSalary(List<Employee> employees) {
        double total = 0;
        for (Employee e : employees) {
            total += e.getSalary();
        }
        return total;
    }

    /**
     * Prints details of all employees in the list.
     *
     * @param employees the list of employees
     */
    public static void printEmployeeDetails(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println("Name: " + e.getName() + ", ID: " + e.getEmployeeId() + ", Salary: " + e.getSalary());
        }
    }
}


