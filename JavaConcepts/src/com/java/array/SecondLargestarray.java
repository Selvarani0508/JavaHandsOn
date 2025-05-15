package com.java.array;

public class SecondLargestarray {

	public static int getSecondLargestArray(int[] arr) {

		int n = arr.length;

		int Largest = -1;
		int secondLargest = -1;

		for (int i = 0; i < n; i++) {

			if (arr[i] > Largest) {

				secondLargest = Largest;

				Largest = arr[i];

			} else if (arr[i] < Largest && arr[i] > secondLargest) {

				secondLargest = arr[i];
			}
		}
		return secondLargest;

	}

	public static void main(String args[]) {

		int[] arr = { 1,2,3,7,122,123};
		int n = arr.length;

		int Largest = 1;
		int secondLargest = 1;

		for (int i = 0; i < n; i++) {

			if (arr[i] > Largest) {

				secondLargest = Largest;

				Largest = arr[i];

			} else if (arr[i] < Largest && arr[i] > secondLargest) {

				secondLargest = arr[i];
			}
		}
		//return secondLargest;

		System.out.println(secondLargest);

	}

}
