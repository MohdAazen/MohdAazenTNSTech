package com.MohdAazen.assignment1.employees;

public class Manager extends Employee {
	
	public Manager(String name, int employeeId, int salary) {
		super(name, employeeId, salary);
		// TODO Auto-generated constructor stub
	}

	private int team_size;
	
	public int getTeam_size() {
		return team_size;
	}

	public void setTeam_size(int team_size) {
		this.team_size = team_size;
	}
}
