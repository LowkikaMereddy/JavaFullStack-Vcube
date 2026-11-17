package com.LogicalStatements;

import java.util.Scanner;

public class TestDemoPOC1 {

	public static void main(String[] args) {
		System.out.println("Welcome to Restaurant !!");
		Scanner sc = new Scanner(System.in);
		String yn = "";
		double vegcost = 0;
		double nonvegcost = 0;
		
		do {
		System.out.println("Enter Category : ");
		String catg = sc.next();

		
		switch (catg) {
		case "veg"->{
			String vyn = "";
			do {
			    System.out.println("Enter the item : ");
			    String item = sc.next();
			
			
			switch(item){
			case "vb" -> {
				System.out.println("veg biryani --> 200");
				double vbcost = 200;
				vegcost = vegcost + vbcost;
			}
			case "pb" -> {
				System.out.println("paneer biryani --> 300");
				double pbcost = 300;
				vegcost = vegcost + pbcost;
			}
			case "mb" -> {
				System.out.println("mashroom biryani --> 400");
				double mbcost = 400;
				vegcost = vegcost + mbcost;
			}
			case "vfr" -> {
				System.out.println("veg fired rice --> 250");
				double vfrcost = 250;
				vegcost = vegcost + vfrcost;
			}
			default -> System.out.println("This item is not available");
			}
			System.out.println("Do you want to continue with the Veg Items .? Click Y for Yes !! N for No ");
			vyn = sc.next();

		} while (vyn.equalsIgnoreCase("y"));
			System.out.println("Total Veg Cost is : " + vegcost);
		}
		case "nonveg"->{
			String nvyn = "";
			do {
			    System.out.println("Enter the item : ");
			    String item = sc.next();
			
			
			switch(item){
			case "cb" -> {
				System.out.println("chicken biryani --> 299");
				double cbcost = 299;
				nonvegcost = nonvegcost + cbcost;
			}
			case "cfb" -> {
				System.out.println("chicken fired biryani --> 350");
				double cfbcost = 350;
				nonvegcost = nonvegcost + cfbcost;
			}
			case "mb" -> {
				System.out.println("mutton biryani --> 400");
				double mbcost = 400;
				nonvegcost = nonvegcost + mbcost;
			}
			case "cfr" -> {
				System.out.println("chicken fired rice --> 250");
				double cfrcost = 300;
				nonvegcost = nonvegcost + cfrcost;
			}
			default -> System.out.println("Entered item is not available");
			}
			System.out.println("Do you want to continue with the Non-Veg Items .? Click Y for Yes !! N for No ");
			nvyn = sc.next();

		} while (nvyn.equalsIgnoreCase("y"));

			System.out.println("Total Non-Veg Cost is : " + nonvegcost);
		}
		default -> System.out.println("Entered category is not available");
		}
		System.out.println("Do you want to continue with the cateroies .? Click Y for Yes !! N for No ");
		yn = sc.next();

	   } while (yn.equalsIgnoreCase("y"));

		System.out.println("Total Cost is : " + (vegcost + nonvegcost));
	}
}

