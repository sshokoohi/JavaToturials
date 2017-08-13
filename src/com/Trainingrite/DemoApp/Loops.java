package com.Trainingrite.DemoApp;

public class Loops {

	public static void main(String[] args) {
	
			int index = 0;
			
			//While loop.
			while (index != 5) {
				
				System.out.println("Inside the while loop");
				index = index +1;
				System.out.println("Value of index: " + index);
			}
			
			System.out.println("************************");
			// DO loop
			do {
				System.out.println("Inside the DO loop");
				index++;
				System.out.println("Value of index: " + index);
			} while (index < 10);
			
			System.out.println("************************");
			
			// FOR loop
			double valueOfNumbers[] = new double[5];
			valueOfNumbers[0] = 100;
			valueOfNumbers[1] = 200;
			valueOfNumbers[2] = 300;
			valueOfNumbers[3] = 400;
			valueOfNumbers[4] = 500;
			// Get the size of array
			int size = valueOfNumbers.length;
			System.out.println("The size of the array is: " + size);
			// Iterate through the array
			for (int i =0; i < size; i++) {
				System.out.println("Value of i: " + i);
				System.out.println(valueOfNumbers[i]);
			}
			
			

	}

}
