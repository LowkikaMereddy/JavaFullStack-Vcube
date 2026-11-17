package com.myfirstproject;

public class Customer {
	
	   int id;
	   String cName;
	   
	   @Override
	protected void finalize() {
		   System.out.println("finalise method");
	}
	   
	 void display() {
	       Customer c5 = new Customer();
	       System.out.println(c5);

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		System.out.println(c1);
		
		Customer c2 = new Customer();
		System.out.println(c2);
		
		Customer c3 = new Customer();
		System.out.println(c3);
		
		Customer c4 = new Customer();
		System.out.println(c4);
		
		c2 = c4;
		System.out.println(c2);
		System.out.println(c4);
		
		
		c1 = null;
		c2 = null;
				
		display();

		
		System.gc();

	}

}
