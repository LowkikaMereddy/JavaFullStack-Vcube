package com.LogicalStatements;

import java.util.Scanner;

public class vowelconsonant {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char ch = sc.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch =='i'|| ch == 'o'|| ch == 'u') {
			System.out.println("It is vowel");
		}else {
			System.out.println("it is consonant");
		}
		
		System.out.println("Main Method ended");

	}

}
