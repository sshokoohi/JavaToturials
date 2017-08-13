package com.Trainingrite.DemoApp;

public class CarApp {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.start();
		car1.accelerate();
		
		System.out.println("*********************");
		
		Car car2 = new Car("BMW");
		car2.start(6);
		Car car3 = new Car(10);
		Car car4 = new Car(20, "Benz");
		

	}
}

class Car {
	// Constructor
	public Car() {
		System.out.println("New car created");
	}
	
	// Overloading constructor
	public Car(String carMaker) {
		System.out.println(" New car created of type: " + carMaker);
	}
	
	//
	public Car(int numberOfCars) {
		System.out.println(" New cars created, QTY: " + numberOfCars);
	}
	
	//
	public Car(int numberOfCars, String carMaker) {
		System.out.println(" The number of cars: " + numberOfCars + " ," + "carMaker: " + carMaker);
	}
	// Name should be verb and lower case
	public void start() {
	System.out.println("The car is starting");
	
	} 
	
	public void start(int delay) {
		System.out.println(" The car starts with: " + delay + " seconds");
	}
	
	public void accelerate() {
		
		System.out.println("The car is accelerating");
	}

}
