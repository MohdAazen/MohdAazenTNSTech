package com.tns.polymorphism;

public class ConstructorOverloading {

	public ConstructorOverloading(String name)
	{
		System.out.println("The name is "+ name);
	}
	
	public ConstructorOverloading(String firstName,String midName,String lastName)
	{
		System.out.println("The name is "+ firstName+" " + midName +" "+ lastName);
	}
	
	public ConstructorOverloading(int a, int b)
	{
		System.out.println("The addition of numbers is "+ (a+b));
	}
//	change in number of parameters than above
	public ConstructorOverloading(int a, int b,int c)
	{
		System.out.println("The addition of numbers is "+ (a+b+c));
	}
	
	public ConstructorOverloading(float a, int b,float c)
	{
		System.out.println("The addition of numbers is "+ (a+b+c));
	}
	
//	change in order of parameters than above
	public ConstructorOverloading( int a,float b,float c)
	{
		System.out.println("The addition of numbers is "+ a*b*c);
	}
}
