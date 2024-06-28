package com.tns.abstractkeyword;

public abstract class TaxPayers {
	abstract void calTax();
	protected int tax;
	 final void show()
	{
		System.out.println("The tax is "+tax);
	}
	
	 public TaxPayers()
	 {
		 
	 }
	 public  static void main(String[] args) {
		System.out.println("hello");
		main("Aazen","Sayyed");
	}
	 
	 public  static void main(String args,String sa) {
			System.out.println("hello World "+args+sa);
		}
}
