package com.Trianingrite.Exceptions;

public class Exception2 {

	public static void main(String[] args) {
		String names[] = new String[3];
		
		try {
			names[0] = "Steve";
			names[1] = "Sarah";
			names[2] = "Roger";
			names[3] = "Mary";
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds of array.");
			System.out.println(e.toString());
			
		}
		for(String name : names) {
			System.out.println(name);
		}
		System.out.println("Closing the program");

	}

}
