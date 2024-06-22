package com.MohdAazen.assignment1.employees;

public class Developer extends Employee {

	String progLang;
	
	public String getProgLang() {
		return progLang;
	}

	public void setProgLang(String progLang) {
		this.progLang = progLang;
	}

	public Developer(String name, int employeeId, int salary) {
		super(name, employeeId, salary);
		// TODO Auto-generated constructor stub
	}

}
