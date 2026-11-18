package com.LogicalStatements;

import java.util.Scanner;

public class TestDemoPOC2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter customer type: ");
		String ct = sc.next();
		
		System.out.println("Enter units consumed");
		int units = sc.nextInt();

		double ctcost=0;
		
		switch(ct) {
		case "Domestic"->{
			System.out.println("domestic type -> 5");
			double DomesticRs = 5;
			ctcost = units * DomesticRs;
			
		}
		case "Commerical"->{
			System.out.println("commerical type -> 8");
			double CommericalRs = 8;
			ctcost = units * CommericalRs;
		}
		case "Industrail"->{
			System.out.println("Industrial type -> 10");
			double IndustrialRs = 10;
			ctcost = units * IndustrialRs;
		}
		default->{
			System.out.println("you entered WRONG");
		}
		}
		System.out.println("your type is :" + ct);
		System.out.println("total currentbill is :" + ctcost);
		

	}

}
