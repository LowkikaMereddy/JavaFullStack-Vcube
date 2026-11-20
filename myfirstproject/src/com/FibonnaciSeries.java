package com.LoopingStatements;

import java.util.Scanner;

public class FibonnaciSeries {
	static void Fibonnaci(int n) {
	int n1 = 0;
	int n2 = 1;
	System.out.print(n1+ " " +n2);
	for(int i=1; i<=10; i++) {
		int n3 = n1+n2;
		System.out.print(" " + n3);
		n1 = n2;
		n2 = n3;
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you want to print :");
		int n = sc.nextInt();
		Fibonnaci(n);

	}

}
