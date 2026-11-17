package com.myfirstproject;

public class Cricketer {
	
//declaration
    static int countryID;
    static String countryName;
    
    String cName;
    int jerseyNo;
    int highestScore;
    
	public static void main(String[] args) {
		System.out.println("Welcome to Cricket team!!");
		
//initialization
		Cricketer msd = new Cricketer();
		
		countryID = 91;
		countryName = "India";
		
		msd.cName = "Mahendra Singh Dhoni ";
		msd.jerseyNo = 10;
		msd.highestScore = 100;
		
		
		Cricketer vk = new Cricketer();
		
		vk.cName = "Virat Kholi ";
		vk.jerseyNo = 18;
		vk.highestScore = 200;
		
        Cricketer hitman = new Cricketer();
		
		hitman.cName = "Rohit ";
		hitman.jerseyNo = 28;
		hitman.highestScore = 300;
		
		
		
//Accessing data
		System.out.println("creating object1*************");
		System.out.println("countryID = " + countryID);
		System.out.println("countryName = " + countryName);
		
		System.out.println("cName = " + msd.cName);
		System.out.println("jerseyNo = " + msd.jerseyNo);
		System.out.println("highestScore = " + msd.highestScore);
		
		System.out.println("creating object2*************");
		System.out.println("countryID = " + countryID);
		System.out.println("countryName = " + countryName);
		
		System.out.println("cName = " + vk.cName);
		System.out.println("jerseyNo = " + vk.jerseyNo);
		System.out.println("highestScore = " + vk.highestScore);
		
		System.out.println("creating object3*************");
		System.out.println("countryID = " + countryID);
		System.out.println("countryName = " + countryName);
		
		System.out.println("cName = " + hitman.cName);
		System.out.println("jerseyNo = " + hitman.jerseyNo);
		System.out.println("highestScore = " + hitman.highestScore);
		
		

	}

}
