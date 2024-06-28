package com.tns.interfaceprograms;

public interface Amazon {

	void welcome();
	void thankyou();
	
	
	default  void serviceCharges()
	{
			int amt = 100;
			System.out.println("the Service charge is "+amt);
	}
	static void aboutUs()
	{
		System.out.println("Its a e comm website");
	}
}
