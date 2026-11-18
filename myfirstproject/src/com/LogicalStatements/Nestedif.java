package com.LogicalStatements;

import java.util.Scanner;

//WA POC related  to Matrimonial management : (Proof Of Concept) 

public class Nestedif {

	public static void main(String[] args) {
		System.out.println("Main Method Started ");
		System.out.println("Welcome to matrimonial site");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String fullname = sc.nextLine();
		
		System.out.println("Oh !! Nice Meet you mr." + fullname);
		
		System.out.println("Enter your assets information :");
		double assets = sc.nextDouble();
		
		if(assets >= 50000000.00) {
			System.out.println("okay");
			System.out.println("contine the discussion!!");
			
			System.out.println("Enter you salary :");
			double salary = sc.nextDouble();
			
			if(salary >= 200000.00) {
				System.out.println("okay,continue the discussion");
				
				System.out.println("Enter your age: ");
				int age = sc.nextInt();
				
				if(age >= 25 && age <= 29) {
					System.out.println("okay good to go");
					
					System.out.println("enter your height & weight");
					float height = sc.nextFloat();
					double weight = sc.nextDouble();
					
					if((height >= 5.5 && height <= 6.1) && weight >= 65 && weight <= 72){
						System.out.println("nice");
					} else {
						System.out.println("you need to go gym");
					}
				} else {
					System.out.println("sorry");
				}
			}else {
				System.out.println("your profile not okay for us");
			}
			
		}else {
			System.out.println("we're not okay");
		}

	}

}
