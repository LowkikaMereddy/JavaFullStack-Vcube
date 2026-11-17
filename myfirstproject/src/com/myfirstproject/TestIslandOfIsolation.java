package com.myfirstproject;

class A {
	B b;
	
	@Override
	protected void finalize() {
		System.out.println("Finalize method A");
	}
}
	class B {
		A a;
		
	@Override
	protected void finalize() {
		System.out.println("Finalize method B");
	}
}

public class TestIslandOfIsolation {

	public static void main(String[] args) {
		System.out.println("main method started");
		
// IslandOfIsolation
		A a1 = new A();
		B b1 = new B();
//		TestIslandOfIsolation m=new TestIslandOfIsolation();
//		TestIslandOfIsolation m1=new TestIslandOfIsolation();
		
		

		a1.b = b1;
		b1.a = a1;
//
		a1 = null;
		b1 = null; 
		System.gc();

		System.out.println("main method ended");
	}
}

