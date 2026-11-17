package com.Methods;

//no-return_type and no parameters
//calculate the values using methods

public class MethodsDemo2 {
	void addition() {
		System.out.println("addition method called");
		int a = 10;
		int b = 20;
		System.out.println(a+b);
	}
	void subtraction() {
		System.out.println("subtraction method called");
		int a = 20;
		int b = 5;
		System.out.println(a-b);
	}
	void multiplication() {
		System.out.println("multiplication method called");
		int a = 20;
		int b = 5;
		System.out.println(a*b);
	}
	void division() {
		System.out.println("division method called");
		int a = 20;
		int b = 5;
		System.out.println(a/b);
	}
	void modulus() {
		System.out.println("modulus method called");
		int a = 98;
		int b = 8;
		System.out.println(a%b);
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		MethodsDemo2 m = new MethodsDemo2();
		
		m.addition();
		m.subtraction();
		m.multiplication();
		m.division();
		m.modulus();
		
		System.out.println("main method ended!!");

	}

}
