package com.tns.assignmentDay4;

public class MainTicket {

	public static void main(String[] args) {
		Ticketing per1= new Ticketing("Aazen");
		per1.displayInfo();
		Ticketing.remainingTickets();
		
		Ticketing per2= new Ticketing("Kalim");
		per2.displayInfo();
		Ticketing.remainingTickets();
	}
}
