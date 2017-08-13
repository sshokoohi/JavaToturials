package com.OOP;

public class EmployeeDB {

	public static void main(String[] args) {
		//  Create an employee
		//  Employee will have properties and methods

		Employee emp1 = new Employee();
		// ENCAPSULATE
		emp1.setName("Harry");
		System.out.println(" My name is: " + emp1.getName());
		emp1.setPhoneNumber("3276543212");
		System.out.println("My phone number is " + emp1.getPhoneNumber());
		emp1.setID(1234);
		System.out.println("My id is: " + emp1.getID());
		emp1.setWage(1122.33);
		System.out.println("My wage is: " + emp1.getWage());
	}
}


class Employee {
	// Properties / Variables / Adjectives
	private String name;
	private String phoneNumber;
	private int ID;
	private double wage;
	
	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		this.wage = wage;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	// Getters & Setters
	// Set the name
	public void setName(String pName) {
		System.out.println("Setting the property for NAME");
		name = pName;
	}
	
	public String getName() {
		System.out.println("Getting the property for NAME");
		return name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		System.out.println("Setting the property for PHONE NUMBER");
		this.phoneNumber = phoneNumber;
	}	
	public String getPhoneNumber() {
		return phoneNumber;
	}
		
	public void work() {		
		
	}
	
	public void getPaid() {		
		 
	}
}
