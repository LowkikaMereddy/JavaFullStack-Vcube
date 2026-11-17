package com.constructors;

public class Student2 {
	int Studentid;
	String studentName;
	int Marks;
	
	Student2(){
		System.out.println("no-arg constructor called");
		Studentid = 1;
		studentName = "Lowkika";
		Marks = 100;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Student2 s = new Student2();
		s.Student2Info()
		;
		System.out.println("main method ended");

	}
	void Student2Info() {
		System.out.println("Studentid: " + Studentid);
		System.out.println("studentName: "+ studentName);
		System.out.println("Marks:" + Marks);
	}

}
