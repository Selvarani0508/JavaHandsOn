package com.java.exceptionHandling;



public class NullpointerEx {
	public static void main(String args[]) {
		try {
			// code that may raise exception
			String s=null;  
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		// rest code of the program
		System.out.println("rest of the code...");
	}
}