package com.OOP;

public class Car extends Machine implements IMusicOperator {
	public void accelerate() {
		System.out.println(" Accelerating");
	}

	// To overrite the close() in Machine.java
	@Override
	public void close() {
		System.out.println(" The machine is shutting down");
	}

	@Override
	public void debug() {
		System.out.println(" Forced debugging script for the car");
		
	}

	@Override
	public void print() {
		System.out.println(" Forced print script for the car");
		
	}
	
	@Override
	public void pause() {
		System.out.println(" The car has paused the music");
	}

	@Override
	public void rewind() {
		System.out.println(" The car is rewinding music");
		
	}
}
