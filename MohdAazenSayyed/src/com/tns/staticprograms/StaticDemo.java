package com.tns.staticprograms;

public class StaticDemo {

	public static void main(String[] args) {
		
		
		Employee ob = new Employee("aazen",20,Employee.eid);
		System.out.println(ob);
		System.out.println(Employee.eid);
		
		System.out.println(Employee.eid);System.out.println(Employee.eid);
		System.out.println(Employee.companyName);
		
	}
}
