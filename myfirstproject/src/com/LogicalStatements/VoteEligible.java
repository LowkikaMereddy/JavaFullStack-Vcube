package com.LogicalStatements;

import java.util.Scanner;

public class VoteEligible {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = sc.nextInt();
		
		if (age >= 18) 
			System.out.println("Eligible for vote");
		
		else 
			System.out.println("Not Eligible for vote");
			
		System.out.println("Main Method ended");

	}

}
