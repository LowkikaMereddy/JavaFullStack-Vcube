package com.myfirstproject;

public class LiteralsDemo {

	public static void main(String[] args) {
// float Literals 
		float f1 = 123;
		float f2 = 0123F;
		float f3 = 0123;
		float f4 = 0x123;
		float f5 = 0x123F;
		float f6 = 123.5f;
		
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);

// double Literals
		double d1 = 123;
		double d2 = 0123d;
		double d3 = 0123;
		double d4 = 0x123;
		double d5 = 0x123d;
		double d6 = 123.5d;
		
		System.out.println("********************************8");
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		System.out.println(d5);
		System.out.println(d6);
		
// char Literals
		char c1 = 'A';
		char c2 = 10;
		char c3 = '\ua004';
		char c4 = '\u0001';
		
		System.out.println("*************************************");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
// boolean Literals
		boolean boo = true;
		if(boo) {
			System.out.println("hello");
		}
		
// null Literals
		String s1 = null;
		s1 = "java";
		System.out.println(s1);
		
//string Literals
		String s11 = "java";
		String s22 = "java";
		
		System.out.println(s11 == s22);
		
		String s33 = "java";
		String s44 = "king";
		
		System.out.println(s33 == s44);
		System.out.println(s33 == s22);
		
		LiteralsDemo L1 = null;
		L1 = new LiteralsDemo();
		System.out.println(L1);
		
		
		
	}

}
