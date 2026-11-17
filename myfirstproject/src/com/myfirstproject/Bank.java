package com.myfirstproject;

public class Bank {

	static String accHolderName;

	int accNo;
	int balance;
	String bankName;

	public static void main(String[] args) {

		Bank p1 = new Bank();
		p1.accNo = 101;
		p1.balance = 10000;
		p1.bankName = "SBI";
		p1.display();
		
		Bank p2 = new Bank();
		p2.accNo = 101;
		p2.balance = 10000;
		p2.bankName = "axis";
		p2.display();

	}

	void display() {
		System.out.println("creating object3*******************");
		System.out.println("accHolderName = " + accHolderName);
		System.out.println("accNo = " + accNo);
		System.out.println("balance = " + balance);
		System.out.println("bankName = " + bankName);

	}

}
