package com.datastructres.arrays;

public class FindthreelargestNumsInArray {
//three largest numbers
	public static void findThreelargestNumbers(int arr[]) {
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third) {
				third = arr[i];
			}
		}
		System.out.println(first + " ," + second + " ," + third);
	}

	// find second Largest
	public static int secondLargestNumber(int arr[]) {

		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			} else if (arr[i] > second) {
				second = arr[i];
			}
		}
		return second;

	}

	// find first Largest
	public static int firstLargestNumber(int arr[]) {

		int first = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > first) {
				first = arr[i];
			}
		}
		return first;

	}

	public static void main(String[] args) {
		int arr[] = { 2, 12, 45, 11, 19, 10, 24 };
		findThreelargestNumbers(arr);
		System.out.println(secondLargestNumber(arr));
		System.out.println(firstLargestNumber(arr));

	}

}
