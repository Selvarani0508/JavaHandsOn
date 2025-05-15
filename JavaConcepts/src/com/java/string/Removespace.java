package com.java.string;

public class Removespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String value = "This is the stri ng value need to remov e space";
		
		String remmovedSpace = value.replaceAll("\\s+", "");
		
		System.out.println("before removal of space: "+ value);
		System.out.println("After removal of sapce: " + remmovedSpace);
		

	}

}
