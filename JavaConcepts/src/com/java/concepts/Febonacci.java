package com.java.concepts;

import java.util.*;

public class Febonacci {

	static void febonacci(int number) {

		int n1 = 0, n2 = 1;

		for (int i = 1; i < number; i++) {

			System.out.print(n1 + " ");

			int n3 = n2 + n1;

			n1 = n2;
			n2 = n3;

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		febonacci(number);

	}

}
