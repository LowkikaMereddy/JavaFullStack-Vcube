package com.myfirstproject;

public class Wrapperclass {
	
	
	public static void main(String args[]) {

		Integer sal = 5000;
		Double GST = sal * 0.3;
		Double PF = sal * 0.2;
		Double allowance = sal * 0.2;
		Double afterdeduction  =sal- GST - PF;
		Double monthsal=afterdeduction+allowance;
		Double Annualnetsal = monthsal*12;

		System.out.println(monthsal);
		System.out.println(Annualnetsal);
		
	}

}
