package com.Methods;

//no-return_type & with paramters

public class MethodsDemo3 {
	static void addition(int a, int b) {
		System.out.println("addition method called");
		System.out.println("sum of two numbers is "+ (a+b));//string plus anything is string
	}
	static void subtraction(float a, float b) {
		System.out.println("subtraction of two num");
		System.out.println("Difference between two numbers is : " + (a-b));
	}
	static void multiplication(float a, float b, float c) {
		System.out.println("multiplication method called");
		System.out.println("product of numbers is : " + a * b * c);
	}
	static void divison(float a, float b, float c) {
		System.out.println("divison method called");
		System.out.println("quotient of numbers is : " + a / b * c);
	}
	static void modulus(double d1, double d2) {
		System.out.println("modulus method called");
		System.out.println("reminder of numbers is : " + d1 % d2);
	}

	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		addition(20, 50); // 20 & 50 are arguments ----> call by the value
		subtraction(50, 10);
		multiplication(2, 6, 8); //int can convert to float
		divison(2, 6, 8);
		modulus(22, 9);
		
		System.out.println("main method ended!!");

	}

}
