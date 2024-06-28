package com.tns.polymorphism;

public class ConstructorDemo {
public static void main(String[] args) {
	
//	single argument of string type
	ConstructorOverloading cO = new ConstructorOverloading("Mohd Aazen");

//	multiple argument of string type
	cO = new ConstructorOverloading("Mohd Aazen","Kalim Ali","Sayyed");
	
//	two args of int type
	cO = new ConstructorOverloading(1,2);
	
//	three args of int type
	cO = new ConstructorOverloading(1,2,3);
	
//	two args of float and 1 of int type in F I F seq
	cO = new ConstructorOverloading(1.5f,2,5.7f);
	
//	two args of float and 1 of int type in I F F seq
	cO = new ConstructorOverloading(1,5.2f,4.3f);
}
}
