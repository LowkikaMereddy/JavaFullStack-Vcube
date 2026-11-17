package com.myfirstproject;

public class TestDemo1 {
	
	static String collegeName;
	static String principalName;
	
	int studentId;
	String studentName;
	String courseName;
	int marks;
	
	
	void displayStudentDetails() {
		System.out.println("studentId:" + studentId);
		System.out.println("studentName:" + studentName);
		System.out.println("courseName:" + courseName);
		System.out.println("marks:" + marks);
		System.out.println("collegeName:" + collegeName);
		System.out.println("principalName:" + principalName);
		
	}

	public static void main(String[] args) {
		collegeName = "MRU";
		principalName = "meravali";
		TestDemo1 t1 = new TestDemo1 ();
		t1.studentId = 101;
		t1.studentName = "Lowki";
		t1.courseName = "CSE";
		t1.marks = 100;
		t1.displayStudentDetails();
		

	}

}
