package com.tns.staticprograms;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleStaticBlocks msb = new MultipleStaticBlocks();
		
		MultipleStaticBlocks.display();
		
		System.out.println(msb.toString());
		
		
		MultipleStaticBlocks msb1 = new MultipleStaticBlocks();
		MultipleStaticBlocks.display();
		System.out.println(msb1.toString());
	}

}
