package com.myfirstproject;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println(Class.forName("com.myfirstproject.Hello"));
		
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));

	}

}
