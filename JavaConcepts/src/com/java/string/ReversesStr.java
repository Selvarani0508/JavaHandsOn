package com.java.string;

public class ReversesStr {

	public static String reverseString(String str) {

		StringBuilder str1 = new StringBuilder(str);

		String value = str1.reverse().toString();

		return value;

	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String orgName = "dharun Marimuthu";
		
		String reversedname ="";
        String revName = reverseString(orgName);
		
		System.out.println("the original name: " + orgName);
		
		System.out.println("the reverse name: " + revName);

		
		for (int i=0; i<orgName.length(); i++) {
			
			reversedname = orgName.charAt(i) + reversedname;
			
		}
		
		System.out.println("The reversed name without using string builder: "+ reversedname);

		
	}

}
