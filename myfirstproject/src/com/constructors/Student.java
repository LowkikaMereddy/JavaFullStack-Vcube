package com.constructors;

public class Student {
	int id;
	String name;
	int age;
	
	Student(){
		System.out.println("no-arg constructor called");
	}
// with this keyword
	
	Student(int id, String name, int age){
		System.out.println("parametized constructor called");
		this.id = id;
		this.name = name;
		this.age = age;
	}
//display method	
//	void display() {
//        System.out.println("Student ID: " + id);
//        System.out.println("Student Name: " + name);
//        System.out.println("Student Age: " + age);
//        System.out.println("-------------------");
//    }
//	@Override
//	public String toString() {
//		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
//	}
	public static void main(String[] args) {
		System.out.println("main method started");
		Student s = new Student();
		s.id = 1;
		s.name = "hi";
		s.age = 21;
		
		Student s1 = new Student(2, "hello", 22);
		s1.StudentInfo();
		Student s2 = new Student(3, "bye", 23);
		s2.StudentInfo();
			
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(s2);
// display method calling		
//		s.display();
//        s1.display();
//        s2.display();
		
        
        System.out.println("main method ended");

	}
	void StudentInfo() {
		System.out.println("id:" + id);
		System.out.println("name:" + name);
		System.out.println("age:" + age);
		System.out.println("***************************");

}
	}
	
