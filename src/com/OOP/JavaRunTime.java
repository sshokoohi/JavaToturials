package com.OOP;

public class JavaRunTime {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.start();
		car1.accelerate();
		car1.debug();
		car1.print();
		
		car1.play();
		car1.pause();
		car1.rewind();
		
		Computer pc1 = new Computer();
		pc1.play();
		pc1.pause();
		pc1.rewind();
		
		car1.close();

	}

}
