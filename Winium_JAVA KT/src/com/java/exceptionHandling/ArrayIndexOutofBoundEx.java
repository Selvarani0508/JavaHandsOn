package com.java.exceptionHandling;

public class ArrayIndexOutofBoundEx  {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			int a[]=new int[5];  
			a[6]=50; 
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}