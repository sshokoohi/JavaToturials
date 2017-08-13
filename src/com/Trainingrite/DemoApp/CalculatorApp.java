package com.Trainingrite.DemoApp;

public class CalculatorApp {

	public static void main(String[] args) {
		// Java will create at the time of creation
		// Static Methods belong to the CLASS (NOT THE OBJECT)
		// New - Java will create at the time of instantiation
		//Calculator.DoMath();
		Calculator calc = new Calculator();
		//calc.FinfArea();
		//calc.DoMath();
		int A = 20;
		int B = 30;
		// Call a method and pass two parameters
		calc.sum(A, B);
		calc.product(A, B);
		double c = calc.product(A, B);
		System.out.println("The product of two numbers is: " + c);
	}

}


class Calculator {
	public static void doMath() {
		System.out.println("Do different operations");
	}
	
	public void finfArea() {
		System.out.println("Finding area");
	}
	
	// Find the sum of two numbers
	public void sum(int numA, int numB) {
		int Sum;
		Sum = numA + numB;
		System.out.println("The sum of two numbers is: " + Sum);
	}
	
	// Find the product of two numbers
	public double product(int numA, int numB) {
		double c = numA * numB;
		return c;
		
	}
}