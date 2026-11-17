package com.LanguageFundamentals1;

import java.util.Scanner;

public class Areainfo {
	static double getAreaOfTriangle(double base, double height) {
		return 0.5 * base * height;
		
	}
	static double getAreaOfSquare(double side) {
		return side * side;
		
	}
	static double getAreaOfRectangle(double length, double breadth) {
		return length * breadth;
		
	}
	static double getAreaOfCircle(double radius) {
		return Math.PI * radius * radius;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base: ");
		double b = sc.nextDouble();
		System.out.println("Enter the height: ");
		double h = sc.nextDouble();
		double arTri = getAreaOfTriangle(b, h);
		System.out.println("Area of Trinagle is :" + arTri);
		System.out.println("**********************************");
		System.out.println("Enter the side: ");
		double s = sc.nextDouble();
		double arSq = getAreaOfSquare(s);
		System.out.println("Area of Square is :" + arSq);
		System.out.println("**********************************");
		System.out.println("Enter the length: ");
		double l = sc.nextDouble();
		System.out.println("Enter the breadth: ");
		double br = sc.nextDouble();
		double arRec = getAreaOfRectangle(l, br);
		System.out.println("Area of Rectangle is :" + arRec);
		System.out.println("**********************************");
		System.out.println("Enter the radius: ");
		double r = sc.nextDouble();
		double arrad = getAreaOfCircle(r);
		System.out.println("Area of Circle is :" + arrad);
	

		}

	}


