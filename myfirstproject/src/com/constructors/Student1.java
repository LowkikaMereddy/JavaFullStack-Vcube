package com.constructors;

public class Student1 {
	int id;
	String name;
	int age;
	
	Student1(){
		System.out.println("no-arg constructor called");
	}
	
// without this keyword
	Student1(int sid, String sname, int sage){
		System.out.println("parametized constructor called");
		id = sid;
		name = sname;
		age = sage;
	}
	 void display(){
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);

	}
	

	public static void main(String[] args) {
		Student1 s = new Student1(1, "hi", 22);
		s.display();
	}

}


//Without this	            With this
//Different variable names	Same variable names can be used
//id = sid;	                this.id = id;
