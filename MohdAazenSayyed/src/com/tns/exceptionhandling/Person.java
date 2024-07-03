package com.tns.exceptionhandling;

import java.util.Scanner;

public class Person {
	public static int rounds()
	{
		Scanner sc = new Scanner(System.in);
		int round =1;
		int totalNumOfSample=0;
		int collectedSample = 0;
		while(totalNumOfSample<30)
		{
			System.out.println("Enter the Number of Samples collected in round "+(round));
			collectedSample = sc.nextInt();
			round++;
			totalNumOfSample+=collectedSample;
			
		}
		System.out.println("No of leaf samples collected "+totalNumOfSample);
		return round;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Asif is Returning home after "+rounds()+" rounds");
	}
}
