package com.myfirstproject;

public class TestDemo {
	
	static void method1() {
		System.out.println("method called1");
		method2();
	}
	static void method2() {
		System.out.println("method called2");
		TestDemo p1 = new TestDemo();
		p1.method3();
	}
	public int studentId;
	
		void method3() {
			System.out.println("method called3");
			method4();
		}
		void method4() {
			System.out.println("method called4");
		}
		public static void main(String[] args) {
			method1();
			
		
	}
}