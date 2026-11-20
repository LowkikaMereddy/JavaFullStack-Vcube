package com.LoopingStatements;

//WAP TO PRINT FACTORIAL OF A GIVEN NUMBER USING FOR LOOP..?

import java.util.Scanner;

public class FactorialNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number :");
		int n = sc.nextInt();
		int f = fact(n);
		System.out.println("Factorial of a number : "+f);
	}
	static int fact (int n) {
		int fact = 1;
		for (int i=n; i>=1; i--) {
			fact = fact * i;		
			}
		return fact;
	}

}
