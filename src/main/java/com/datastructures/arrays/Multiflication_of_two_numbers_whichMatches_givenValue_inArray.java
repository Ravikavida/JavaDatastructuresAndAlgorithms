package com.datastructures.arrays;

import java.util.HashSet;

public class Multiflication_of_two_numbers_whichMatches_givenValue_inArray {

	public static void getTwoNumbers(int arr[], int mul) {

		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (mul % arr[i] == 0 && set.contains(mul/arr[i])) {
				System.out.println(mul / arr[i] + "  " + arr[i]);
			}
			set.add(arr[i]);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 3, 6, 9, 2, 7, 6, 3 };
		getTwoNumbers(arr, 18);
	}
}
