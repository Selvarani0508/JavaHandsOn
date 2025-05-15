package com.java.string;

public class reverseStrEachword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "This is Java";

		String[] words = str.split(" ");

		StringBuffer result = new StringBuffer();

		for (String word : words) {

			if (!word.isEmpty()) {

				result.append(new StringBuffer(word).reverse().toString());
			}
			 	result.append(" ");
		}
		System.out.println(result);

	}

}
