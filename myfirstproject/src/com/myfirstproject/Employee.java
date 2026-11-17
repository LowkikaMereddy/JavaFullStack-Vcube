package com.myfirstproject;

public class Employee {
	
   // declaration
	static String companyName;

	int eId;
	String ename;
	String departmentName;
	int salary;

	public static void main(String[] args) {

		// initialization
		companyName = "Infosys";

		Employee emp = new Employee();

		emp.eId = 101;
		emp.ename = "Lowki";
		emp.departmentName = "SE";
		emp.salary = 50000;
		
		//accessing the data
        System.out.println("creating first object1***********");
		System.out.println("companyName = " + companyName);
		System.out.println("eid = " + emp.eId);
		System.out.println("ename = " + emp.ename);
		System.out.println("departmentName = " + emp.departmentName);
		System.out.println("salary = " + emp.salary);
		
		
		
		Employee emp1 = new Employee();

		emp1.eId = 102;
		emp1.ename = "aarthi";
		emp1.departmentName = "DA";
		emp1.salary = 100000;
		
        System.out.println("creating first object2***********");
		System.out.println("companyName = " + companyName);
		System.out.println("eid = " + emp1.eId);
		System.out.println("ename = " + emp1.ename);
		System.out.println("departmentName = " + emp1.departmentName);
		System.out.println("salary = " + emp1.salary);
		
		
		companyName = "TCS";
		Employee emp2 = new Employee();

		emp2.eId = 103;
		emp2.ename = "veneetha";
		emp2.departmentName = "Software engineer";
		emp2.salary = 150000;
		
        System.out.println("creating first object3***********");
		System.out.println("companyName = " + companyName);
		System.out.println("eid = " + emp2.eId);
		System.out.println("ename = " + emp2.ename);
		System.out.println("departmentName = " + emp2.departmentName);
		System.out.println("salary = " + emp2.salary);
		
		

	}

}
