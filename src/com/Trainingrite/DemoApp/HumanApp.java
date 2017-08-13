package com.Trainingrite.DemoApp;

public class HumanApp {

	public static void main(String[] args) {
		Human human1 = new Human();
		human1.name = "George";
		human1.height = 6.0;
		human1.eat();
		human1.myInfo();
		System.out.println("                              ");
		
		Human human2 = new Human();
		human2.name = "Sarah";
		human2.height = 5.5;
		human2.myInfo();

	}
}

class Human{
	// Properties of a human	
	String haircolor;
	double height;
	String skincolor;
	double weight;
	String name;
	
	public void myInfo() {
		System.out.println("My name is: " + name);
		System.out.println("I am " + height + " feet tall");
	}
		
	// Actions of a human	
	public void eat() {
		System.out.println("I am eating");
	}
	
	public void Sleep( ) {
		System.out.println("I am sleeping");
	}
	
	public void work() {
		System.out.println("I am working");
	}
	
	
}
