package com.rakshithashri.assignment.employees;

public class Employee {
	 private String name;
	    private int employeeId;
	    private double salary;

	    /**
	     * Constructs an Employee with the specified name, employeeId, and salary.
	     *
	     * @param name the employee's name
	     * @param employeeId the employee's ID
	     * @param salary the employee's salary
	     */
	    public Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	}

