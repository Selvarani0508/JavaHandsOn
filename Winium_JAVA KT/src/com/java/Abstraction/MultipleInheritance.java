package com.java.Abstraction;

interface Printable {
	void print();
}

interface Showable {
	void print(); 
}

class MultipleInheritance implements Printable, Showable {
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.print();
	}
}

