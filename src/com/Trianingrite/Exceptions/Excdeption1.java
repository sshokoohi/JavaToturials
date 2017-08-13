package com.Trianingrite.Exceptions;

public class Excdeption1 {

	public static void main(String[] args) {
		int  x = 5;
		int y = 2;
		
		try {	
			int z = x/y;	
			System.out.println(" Answer is: " + z);
		}catch(Exception e) {
			System.out.println(" ERROR: Cannot divide by zero");
			System.out.println(e.toString());
		}
		System.out.println(" The program is closing");
		
	}

}
