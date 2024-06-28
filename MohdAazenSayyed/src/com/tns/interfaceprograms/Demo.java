package com.tns.interfaceprograms;

public class Demo {

	public static void main(String[] args) {
		Amazon ob = new PrimeAccount();
		Amazon.aboutUs();
		ob.welcome();
		ob.thankyou();
		
		Amazon obtwo = new NonPrimeAccount();
		Amazon.aboutUs();
		obtwo.welcome();
		obtwo.serviceCharges();
		obtwo.thankyou();
		
	}
}
