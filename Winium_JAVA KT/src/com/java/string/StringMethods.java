package com.java.string;

public class StringMethods {
	public static void main(String[] args) {  
		
		char a = 'a';
		 
		String str = "   Programming Language   ";
		  
		System.out.println("Length of the string : " + str.length()); 
		
		System.out.println("String in a string : " + str.indexOf("gram")); //if it is present return value
		
		System.out.println("String in a string : " + str.indexOf("java")); // if it is not present return -1 value
		
		System.out.println("Index Char in the string : " + str.charAt(4)); 
		
		System.out.println("Uppercase of the string : " + str.toUpperCase()); 
		
		System.out.println("Lowercase of the string : " + str.toLowerCase()); 
		
		System.out.println("Substring : " + str.substring(7)); //not end declared index
		
		System.out.println("Substring : " + str.substring(3,7)); // end dec
		
		str = str.trim();
		
		System.out.println("Trimmed String is " + str);
		
		System.out.println("Length of the string : " + str.length()); 
		
	}

}
