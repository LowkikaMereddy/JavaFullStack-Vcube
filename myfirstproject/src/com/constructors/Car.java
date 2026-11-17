package com.constructors;

public class Car {
	String Model;
	String brand;
	double price;
	String color;

	Car() {
		System.out.println("no-arg constructor called");
		this("tata");
	}

	public Car(String model) {
		this("tata", "nexon");
	}

	public Car(String model, String brand) {
		this()
	}

	public Car(String model, String brand, double price) {
		Model = model;
		this.brand = brand;
		this.price = price;
	}

	public Car(String model, String brand, double price, String color) {
		this.Model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Car c = new Car();
		c.CarInfo();
		System.out.println("main method ended");
		
	}
	void CarInfo() {
		System.out.println("Model of the car:"+ Model);
		System.out.println("brand of the car:"+ brand);
		System.out.println("price of the car:"+ price);
		System.out.println("color of the car:"+ color);
		System.out.println("***********************************");
	}

}
