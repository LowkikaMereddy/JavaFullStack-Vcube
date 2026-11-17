package com.LogicalStatements;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year : ");
		int year = sc.nextInt();
		
		if((year%4==0 && year%100!=0)|| year%400==0) {
				System.out.println("yah it is leapyear");
		}
		else
			System.out.println("it is not a leapyear");
	
		
		System.out.println("Main Method Ended");

	}

}
