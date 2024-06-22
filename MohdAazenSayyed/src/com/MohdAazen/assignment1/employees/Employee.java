package com.MohdAazen.assignment1.employees;

public class Employee {

	private String name;
	private int employeeId,salary;
	
	public Employee(String name, int employeeId, int salary) {
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getSalary() {
		return salary;
	}
}


/*
 Assignment Question

Objective: To demonstrate understanding of Java packages and access modifiers. Instructions: 
Create a Package Structure: Create a Java package named com.yourname.assignment. 
•Inside this package, create two sub-packages named employees and utilities. 
Employees Package: Inside the employees package, create a class named Employee. 
• Include private attributes such as name, employeeId, and salary. 
• Implement appropriate access modifiers (e.g., private, protected, public) for the class members. 
• Provide getter and setter methods to access and modify the private attributes
Subclasses: 
• Create two subclasses within the employees package: Manager and Developer. 
• Each subclass should extend the Employee class. 
• Introduce additional attributes specific to managers and developers. 
• Implement getter and setter methods for the additional attributes. 

*/