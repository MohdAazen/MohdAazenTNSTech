/*
 Day2 Assignment 
 
Define a class Commission described as follows:
Data Members: Name, Address, Phone, Sales_amount 
Member methods:
(i) To accept details of the sales employee
(ii) to calculate the commission as follows: Sales_amount >= 100000, commission = 10%; 50000 <= Sales_amount < 100000, commission = 5%; 
30000 <= Sales_amount < 50000, commission = 3%; Sales_amount < 30000, no commission.
Write the main method to create an object of a class and call the above member method.

*/


package com.company.programsAssignment2;
import java.util.*;

//Define a class Commission described as follows:


public class Commission {
	
//Data Members: Name, Address, Phone, Sales_amount 
	String name, address;
	int sales_amount;
	double phone;
	
//(i) To accept details of the sales employee
	public void getInfo(String name,String address,int sales_amount,double phone)
	{
		this.name = name;
		this.address = address;
		this.sales_amount = sales_amount;
		this.phone = phone;
		
		showInfo();
		System.out.println("The calculated commission for the "+this.sales_amount+" is "+calcCommission(this.sales_amount));
	}
	
	public void showInfo() {
		System.out.println( "Name: " + name + ", Address: " + address + ", Sales Amount: " + sales_amount + ", Phone Number: "
				+ phone);
	}


	/*(ii) to calculate the commission as follows: 
Sales_amount >= 100000, commission = 10%; 
50000 <= Sales_amount < 100000, commission = 5%; 
30000 <= Sales_amount < 50000, commission = 3%; Sales_amount < 30000, no commission.
*/
	public static int calcCommission(int salesAmount)
	{
		if(salesAmount>=100000)
		{
			return salesAmount*10/100;
		}
		else if(salesAmount<100000 && salesAmount >=50000)
		{
			return salesAmount*5/100;
		}
		else if(salesAmount<50000 && salesAmount >=30000)
		{
			return salesAmount*3/100;
		}
		else {
			return 0;
		}
	}
	
//Write the main method to create an object of a class and call the above member method.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n, add;
		int salesAmount;
		double phNo;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name: ");
		n = sc.nextLine();
		System.out.println("Enter Your Address: ");
		add = sc.nextLine();
		System.out.println("Enter Your Sales Amount: ");
		salesAmount = sc.nextInt();
		System.out.println("Enter Your Phone Number: ");
		phNo = sc.nextDouble();
		
		Commission c = new Commission();
		c.getInfo(n,add,salesAmount,phNo);
		
	}

}
