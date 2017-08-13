package com.OOP;

public class PolymorphismDemo {

	public static void main(String[] args) {
		 
		 Worker work1 = new Worker();
		 
		 // Overriding , inhereted method is overridden by child
		 work1.showInfo();
		 
		 // Overloading : multiple method names with different arguments
		 work1.add(5, 2);
		 work1.add(3, 6, 9);
		 work1.add("Add these numbers");
		 work1.add();
		 
		 Student stu1 = new Student();
		 stu1.showInfo();
		 stu1.study();
		 stu1.takeTest();
		 
		 System.out.println("\nPolymorphasim through Inheritance");
		 
		 Person stu2 = new Student();
		 stu2.showInfo();
		 stu2.showName();
		 
		 Salary work2 = new Worker();
		 work2.showSalary();
				 

	}

}

interface Salary {
	public default void showSalary() {
		System.out.println(" Displaying salary here");
	}
}

class Person {
	public void showInfo() {
		System.out.println(" Showing info");
	}
	
	public void showName() {
		System.out.println(" I am a person");
	}
} 

class Student extends Person {
	
	public void showName() {
		System.out.println(" I am a person");
	}
	public void study() {
		System.out.println(" I am studing");	
	}
	
	public void takeTest() {
		System.out.println(" I am taking test");
	}
}

class Worker extends Person  implements Salary{
	public void showInfo() {
		System.out.println(" Showing info for person");
	}
	
	public void add(int A, int B) {
		System.out.println(A + B);
	}
	
	public void add(int A, int B, int C) {
		System.out.println(A + B + C);
	}
	
	public void add(String word) {
		System.out.println(" You are trying to add a word!!" + word);
	}
	
	public void add() {
		System.out.println(" You forgot to add numbers");
	}
	
	public void showSalary() {
		System.out.println(" Worker is earning wage $___");
	}
}
