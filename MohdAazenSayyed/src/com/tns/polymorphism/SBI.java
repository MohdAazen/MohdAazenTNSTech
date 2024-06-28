package com.tns.polymorphism;

public class SBI extends RBI{
	
@Override
	protected float getRateOfInterest()
	{
		return 7.0f;
	}

	public SBI getObject()
	{
		return this;
	}
}
