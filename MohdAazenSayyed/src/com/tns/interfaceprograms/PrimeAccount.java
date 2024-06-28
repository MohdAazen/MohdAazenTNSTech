package com.tns.interfaceprograms;

public class PrimeAccount implements Amazon {

	@Override
	public void welcome() {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Non Prime Account of Amazon");
	}

	@Override
	public void thankyou() {
		// TODO Auto-generated method stub
		System.out.println("Thank You purchasing from Amazon");
	}
}
