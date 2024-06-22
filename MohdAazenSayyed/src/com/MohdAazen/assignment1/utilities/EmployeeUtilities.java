package com.MohdAazen.assignment1.utilities;

import com.MohdAazen.assignment1.employees.Developer;
import com.MohdAazen.assignment1.employees.Employee;
import com.MohdAazen.assignment1.employees.Manager;

public class EmployeeUtilities {

	public static void getPrintedInfoMan(Manager emp)
	{
		System.out.println("Name : "+emp.getName());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("Employee Id : "+emp.getEmployeeId());
		System.out.println("Team size : "+emp.getTeam_size());	
	}	
	public static void getPrintedInfoDev(Developer emp)
	{
		System.out.println("Name : "+emp.getName());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("Employee Id : "+emp.getEmployeeId());
		System.out.println("Team size : "+emp.getProgLang());
	}
}

/*
 
 Utilities Package: 
• Inside the utilities package, create a class named EmployeeUtilities. 

• Implement methods in EmployeeUtilities that use the employees from the employees package. 
• Demonstrate the proper usage of access modifiers within the EmployeeUtilities class. 

*/