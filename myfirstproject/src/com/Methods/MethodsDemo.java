package com.Methods;

public class MethodsDemo {

	public static void main(String[] args) {
		System.out.println("main method started!!");
		
		hello();//calling the methods : static methods call directly
		MethodsDemo t = new MethodsDemo();
		t.welcome();
		
		System.out.println("main method ended!!");

	}
	public static void hello() {
		System.out.println("good morning");
	}
	void welcome() {
		System.out.println("welcome to java world");
	}

}
