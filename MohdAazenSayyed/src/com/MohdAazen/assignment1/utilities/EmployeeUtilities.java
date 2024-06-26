package com.MohdAazen.assignment1.utilities;

import com.MohdAazen.assignment1.employees.Developer;
import com.MohdAazen.assignment1.employees.Employee;
import com.MohdAazen.assignment1.employees.Manager;

public class EmployeeUtilities {

	public static void getPrintedInfoMan(Manager m)
	{
		System.out.println("Name : "+m.getName());
		System.out.println("Salary : "+m.getSalary());
		System.out.println("Employee Id : "+m.getEmployeeId());
		System.out.println("Team size : "+m.getTeam_size());	
	}	
	public static void getPrintedInfoDev(Developer d)
	{
		System.out.println("Name : "+d.getName());
		System.out.println("Salary : "+d.getSalary());
		System.out.println("Employee Id : "+d.getEmployeeId());
		System.out.println("Team size : "+d.getProgLang());
	}
}

/*
 
 Utilities Package: 
• Inside the utilities package, create a class named EmployeeUtilities. 

• Implement methods in EmployeeUtilities that use the employees from the employees package. 
• Demonstrate the proper usage of access modifiers within the EmployeeUtilities class. 

*/