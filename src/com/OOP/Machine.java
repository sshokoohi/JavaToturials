package com.OOP;

public abstract class Machine {
	
	// Abstract key will disallow me from creating a new Machine object
	
	// Normal method that child classes inheret
	public void start() {
		System.out.println(" The machine is starting");
	}
	
	// Normal method with overriding
	public void close() {
		System.out.println("The machine is closing");
	}

	// Abstract methods: these methods will be forced to be implemented by child
	public abstract void debug();
	public abstract void print();
}
