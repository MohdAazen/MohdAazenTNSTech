package com.tns.assignmentDay4;

public class Ticketing {
	private static int numOfTickets = 10;
	private static String movieName="Chandu Champion";
	public String nameOfPerson;	
	
	static {
		System.out.println("---Welcome to Ticketing---");
	}
	
	public Ticketing(String name)
	{
		this.nameOfPerson = name;
		numOfTickets--;
	}
	
	public void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("Your name is : "+this.nameOfPerson+" The movie is: "+this.movieName);
	}
	
	public static void remainingTickets()
	{
		System.out.println("Remaining Tickets: "+numOfTickets);
	}
}
