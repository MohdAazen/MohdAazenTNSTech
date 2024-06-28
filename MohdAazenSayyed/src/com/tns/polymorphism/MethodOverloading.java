package com.tns.polymorphism;

public class MethodOverloading {

	public static int add(int a , int b)
	{
		return a+b;
	}
	
	public static float add(float a , float b)
	{
		return a+b;
	}
	
	public static float add(int a , float b)
	{
		return a+b;
	}
	
//	order of parameters
	public static float add(float a , int b)
	{
		return a+b;
	}
	
//	Not considered return type
//	public static int add(float a , int b)
//	{
//		return a+b;
//	}

	public static String add(String a , String b)
	{
		return a+b;
	}
	
	
//	Constructor Overloading
	public String MethodOverloading(String a )
	{
		return a;
	}
	public MethodOverloading()
	{
		
	}
}
