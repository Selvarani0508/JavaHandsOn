package com.java.concepts;

import java.util.Scanner;

public class strtoint {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string: ");

		String str = sc.nextLine();

		try {

			// String to number conversion

			int value1 = Integer.parseInt(str);
			System.out.println(value1);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input: " + e.getMessage());
		}
	}
}
