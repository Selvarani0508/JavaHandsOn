package com.java.concepts;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value: ");

		String value = sc.nextLine();

		String rev = "";

		for (int i = 0; i < value.length(); i++) {

			rev = value.charAt(i) + rev;

		}
		if (rev.equalsIgnoreCase(value)) {
			System.out.println(rev + " is a palindrome");
		} else {
			System.out.println(rev + " is not a palindrome");
		}

	}

}
