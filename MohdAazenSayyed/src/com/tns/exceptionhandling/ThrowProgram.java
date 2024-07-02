package com.tns.exceptionhandling;

public class ThrowProgram {
	public static void  validate(int age)
	{
		if(age < 18)
		{
			throw new ArithmeticException("Invalid Age ");
			
		}
		else {
			System.out.println("you can vote");
		}
	}
}
