package com.java.concepts;

public class Swaptwonumbers {

	static int a = 25;

	static int b = 50;

	static void withtemp() {
		System.out.println("before swapping: a= " + a + " b= " + b);

		int c = a;
		a = b;
		b = c;

		System.out.println("After swapping: a= " + a + " b= " + b);
	}
	
	static void withouttemp() {
		System.out.println("before swapping: a= " + a + " b= " + b);

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping: a= " + a + " b= " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		withouttemp();
		withtemp();
		

	}

}
