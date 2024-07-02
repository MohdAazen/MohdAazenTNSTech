package com.tns.exceptionhandling;

public class DemoThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	ThrowProgram.validate(10);
}
catch(ArithmeticException tp){
	System.out.println("Exception handled "+tp.getMessage());
}
	}

}
