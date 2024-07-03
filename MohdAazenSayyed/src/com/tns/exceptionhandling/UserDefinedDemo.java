package com.tns.exceptionhandling;

import java.util.Scanner;

public class UserDefinedDemo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Age");
	int age = sc.nextInt();
	
	try {
		UserDefined.validate(age);
	}
	catch(Age e)
	{
		System.out.println(e.getMessage());
	}
}
}
