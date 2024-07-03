package com.tns.exceptionhandling;

import java.util.Scanner;

public class UserDefined {

	
	  static void validate(int age) throws Age
	{
		
		if(age<18)
		{
			throw new Age ("You cannot vote ");
		}
		else {
			System.out.println("You can vote");
		}
	}
}
