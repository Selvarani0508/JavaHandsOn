package com.java.inheritance;

class A {
	void msg() {
		System.out.println("Hello");
	}
}

class B {
	void msg() {
		System.out.println("Welcome");
	}
}

class MultipleInheritance extends A,B
{   //suppose if it were  
}
	public static void main(String args[]) {
		MultipleInheritance obj = new MultipleInheritance();
		
		obj.msg();// Now which msg() method would be invoked?
	
}
