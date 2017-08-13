package com.Trianingrite.Exceptions;

import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		boolean success = true;
		//  Makes a payment
		// Handle errors if negative applied
		
		// 1. Ask user for payment
		do {
			System.out.print("Enter payment amount: ");
			Scanner in = new Scanner(System.in);
			
			// 2. Identify problem spot
			try {
				double amount = in.nextDouble();
				
				// 3. Test value for exception
				if (amount < 0) {
					throw new NegativePaymentExtention(amount);			}
				System.out.println(amount);
			} catch(NegativePaymentExtention e) {
				System.out.println("Cannot take a negative number for payment");
				System.out.println(e.toString());
				success = false;
				System.out.println("\n*********\n");
				System.out.println("Please try again");
			}
		} while (success == false);
		System.out.println("Thank you for your payment");

	}

}

class NegativePaymentExtention extends Exception {
	double amount;
	public NegativePaymentExtention(double amount) {
		this.amount = amount;
	}
	
	public String toString() {
		return ("NegativePaymentExtention: " + amount);
	}
}
