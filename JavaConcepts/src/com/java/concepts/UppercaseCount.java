package com.java.concepts;

public class UppercaseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is the BEST testing to AutoMate";
		
		int count = 0;
		
		for(char value : str.toCharArray()) {
			
			if (Character.isUpperCase(value)) {
				
				count++;
			}
		}
		
		System.out.println("The upper case character count is: " + count);
		

	}

}
