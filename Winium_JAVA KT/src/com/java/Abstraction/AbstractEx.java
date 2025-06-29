package com.java.Abstraction;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing rectangle");
	}
}

class Circle1 extends Shape {
	void draw() {
		System.out.println("drawing circle");
	}
}

//In real scenario, method is called by programmer or user  
class AbstractEx {
	public static void main(String args[]) {
		Shape s = new Circle1();
		s.draw();
	}
}