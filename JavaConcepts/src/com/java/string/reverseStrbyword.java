package com.java.string;

public class reverseStrbyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is a book";

		String[] words = str.split(" ");

		String reversedStr = "";

		for (int i = words.length - 1; i >= 0; i--) {

			reversedStr += words[i];

			if (i != 0) {

				reversedStr += " ";
			}

		}
		System.out.println("Reveresed string words: " + reversedStr);

		// op -> book a is This

	}

}
