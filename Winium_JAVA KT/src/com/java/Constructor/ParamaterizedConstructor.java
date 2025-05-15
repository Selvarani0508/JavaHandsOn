package com.java.Constructor;

class ParamaterizedConstructor {
	int id;
	String name;

	// creating a parameterized constructor
	ParamaterizedConstructor(int i, String n) {
		id = i;
		name = n;
	}

	// method to display the values
	void display() {
		System.out.println(id + " " + name);
	}

	public static void main(String args[]) {
		// creating objects and passing values
		ParamaterizedConstructor s1 = new ParamaterizedConstructor(123, "Sara");
		ParamaterizedConstructor s2 = new ParamaterizedConstructor(321, "Akshy");
		ParamaterizedConstructor s3 = new ParamaterizedConstructor(391, "Trisha");
		// calling method to display the values of object
		s1.display();
		s2.display();
		s3.display();
	}
}