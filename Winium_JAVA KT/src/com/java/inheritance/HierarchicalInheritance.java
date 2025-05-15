package com.java.inheritance;

class Animals {
	void eat() {
		System.out.println("eating...");
	}
}

class Dogs extends Animals {
	void bark() {
		System.out.println("Dog is barking...");
	}
}

class Cats extends Animals {
	void meow() {
		System.out.println("Cat is meowing...");
	}

}

class HierarchicalInheritance {
	public static void main(String args[]) {
		Cats c = new Cats();

		c.meow();
		c.eat();
		
		 Dogs d = new Dogs();
		d.bark();
		d.eat(); 
	}
}