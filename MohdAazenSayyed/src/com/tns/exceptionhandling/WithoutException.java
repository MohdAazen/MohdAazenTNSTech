package com.tns.exceptionhandling;

public class WithoutException {

	public static void main(String[] args) {
		int d =0;
		
//		try{
//			int a = 42/d; //exception  
//			String s ="manu";
//			System.out.println("My name is "+s);
//		}
//		
//		
//		catch(ArithmeticException ae)
//		{
//			System.out.println("Exception caught "+ae.getMessage());
//		}
//		System.out.println("Will not be printed");
		
//		try{
//			int a = 42/d; //exception  
//			String s ="manu";
//			System.out.println("My name is "+s);
//		}
//		catch(NullPointerException npe)
//		{
//			System.out.println("Exception caught "+npe.getMessage());
//		}
////		catch(ArithmeticException ae)
////		{
////			System.out.println("Exception caught "+ae.getMessage());
////		}
////		
////		catch(Exception e)
////		{
////			System.out.println("Exception caught "+e.getMessage());
////		}
//		System.out.println("Will not be printed");
	
		
		try{
			int a = 42/d; //exception  
			String s ="manu";
			System.out.println("My name is "+s);
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception caught "+npe.getMessage());
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception caught "+ae.getMessage());
			System.exit(0);
		}
		
		catch(Exception e)
		{
			System.out.println("Exception caught "+e.getMessage());
		}
		finally {
			System.out.println("I will execute anyhow ");
		}
		System.out.println("Will not be printed");
	}
		
		
}
