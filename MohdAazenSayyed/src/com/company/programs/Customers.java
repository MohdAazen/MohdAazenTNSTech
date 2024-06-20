package com.company.programs;

public class Customers {

	int id;
	String city,name;
	public Customers(int id , String name, String city) {
		this.city = city;
		this.name = name;
		this.id = id;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customers cone = new Customers(1,"Raj","Mumbai");
		Customers ctwo = new Customers(2,"Rahul","Jalgaon");
		Customers cthree = new Customers(3,"Sahil","Hyderabad");
	}

}
