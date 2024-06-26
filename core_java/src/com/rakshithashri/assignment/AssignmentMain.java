package com.rakshithashri.assignment;

import java.util.ArrayList;
import java.util.List;

import com.rakshithashri.assignment.employees.Developer;
import com.rakshithashri.assignment.employees.Employee;
import com.rakshithashri.assignment.employees.Manager;
import com.rakshithashri.assignment.utilities.EmployeeUtilities;


public class AssignmentMain {

	public static void main(String[] args) {
		 Manager manager = new Manager("Alice", 101, 90000, "HR");
	        Developer developer = new Developer("Bob", 102, 80000, "Java");

	        List<Employee> employees = new ArrayList<>();
	        employees.add(manager);
	        employees.add(developer);

	        EmployeeUtilities.printEmployeeDetails(employees);
	        double totalSalary = EmployeeUtilities.calculateTotalSalary(employees);
	        System.out.println("Total Salary: " + totalSalary);
	    }
		// TODO Auto-generated method stub

	}


