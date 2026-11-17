package com.myfirstproject;

public class Demo {
	
	static {
		System.out.println("method1");
	}
	{
		System.out.println("instance method");
	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Demo p1 = new Demo();
		System.out.println("main method ended");
		
		}
		static {
		System.out.println("method2");
		
	}
}