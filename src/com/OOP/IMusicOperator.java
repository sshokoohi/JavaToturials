package com.OOP;

public interface IMusicOperator {
	
	// Providing Definition
	public default void play() {
		System.out.println(" Music is playing");
		// Algorithm to play music
	}
	
	// Overriding 
	public default void pause() {
		System.out.println(" Music is paused");
	}
	
	// Leave implimentation to the user
	public void rewind();
	

}
