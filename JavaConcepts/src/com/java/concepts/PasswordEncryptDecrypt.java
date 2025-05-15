package com.java.concepts;

import java.util.Base64;

public class PasswordEncryptDecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String Passwrod = "Great workingday@3455&$";
		
		String pass = "R3JlYXQgd29ya2luZ2RheUAzNDU1JiQ=";
		//encryption
		
		byte[] encodepassword = Base64.getEncoder().encode(Passwrod.getBytes());
		
		System.out.println("encoded password is: " + new String(encodepassword));
		System.out.println("encoded password is: " + encodepassword);
		//Decryption
		
		byte[] decodepassword = Base64.getDecoder().decode(pass.getBytes());
		
		
		System.out.println("decoded password is: " + new String(decodepassword));
		
		

	}

}
