package com.tns.staticprograms;

public class MultipleStaticBlocks {

	private int section;
	private static int srNo;
	
	static {
		System.out.println("--Static Block");
		srNo=1000;
	}
	
	MultipleStaticBlocks()
	{
		System.out.println("--default Constructor--");
		System.out.println("serial No is "+srNo);
		srNo++;
		section++;
	}
	
	static void display() {
		System.out.println("---Static method---");
		System.out.println("serial No is "+srNo);
	}
	

	@Override
	public String toString() {
		return "MultipleStaticBlocks [section=" + section + "]";
	}
}
