package com.tns.assignmentEight;

import java.util.Scanner;

public class DemoNestedTryCatch {
	public static int  arr[] = {1,2,3,4,5};
	public static int divisionInput(int num1,int num2)
	{		
		return num1/num2;
	}
	
	public static String  str;	
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		try {
		System.out.println("Enter the index of element you want to see : ");
		int elementNumber = sc.nextInt();
		System.out.println("The element at index is "+arr[elementNumber]);
		
			System.out.println("Enter Dividend: ");
			int num1 = sc.nextInt();
			
			System.out.println("Enter Divisor: ");
			int num2 = sc.nextInt();
			
			try {
				
				System.out.println(divisionInput(num1,num2));
				
				try {
					System.out.println("Enter the index of charcter : ");
					int characterAt  = sc.nextInt();
					System.out.println(str.charAt(characterAt));
				}
				catch(NullPointerException ne )
				{
					System.out.println("1--> Exception caught "+ne.getMessage());
				}
			}
			catch(ArithmeticException ae)
			{
				System.out.println("2--> Exception caught " +ae.getMessage());
			}
		}
		
		catch(Exception e)
		{
			System.out.println("3--> Exception caught " +e.getMessage());
		}
	}

}
