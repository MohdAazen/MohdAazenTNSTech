package com.tns.abstractkeyword;

public abstract class TaxPayers {
	abstract void calTax();
	protected int tax;
	void show()
	{
		System.out.println("The tax is "+tax);
	}
	
}
