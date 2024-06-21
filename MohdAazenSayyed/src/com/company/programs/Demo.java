package com.company.programs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("Enter the name: ");
		name = sc.nextLine();
		System.out.println("Hello World "+name);
	}
}
