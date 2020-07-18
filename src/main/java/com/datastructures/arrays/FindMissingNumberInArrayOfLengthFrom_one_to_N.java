package com.datastructures.arrays;

import java.util.Arrays;

public class FindMissingNumberInArrayOfLengthFrom_one_to_N {

	public static int findMissingNumber(int arr[]) {

		if (arr.length == 0) {
			return -1;
		}
		int n = arr.length + 1;
		int totalSum = (n * (n + 1)) / 2;

		return totalSum - Arrays.stream(arr).sum();
	}

	public static void main(String[] args) {
		int ar[] = { 1, 4, 6, 7, 10, 3, 2, 5, 8 };
		System.out.println(findMissingNumber(ar));

	}

}
