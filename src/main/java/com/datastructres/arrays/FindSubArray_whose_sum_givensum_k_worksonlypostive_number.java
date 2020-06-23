package com.datastructres.arrays;

public class FindSubArray_whose_sum_givensum_k_worksonlypostive_number {

	public static void findSubArrayWhoseSumequalto_k(int arr[], int sum) {
		if (arr.length == 0) {
			return;
		}
		int start = 0;
		int end = 0;
		int window_sum = 0;

		while (end < arr.length) {
			window_sum = window_sum + arr[end];
			if (window_sum == sum) {
				System.out.println(start + " " + end);
				return;
			}

			while (window_sum > sum && start <= end) {
				window_sum = window_sum - arr[start++];

				if (window_sum == sum) {
					System.out.println(start + " " + end);
					return;
				}
			}
			end++;
		}

	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 7, 9, 10, 12, 5 };

		findSubArrayWhoseSumequalto_k(arr, 19);
	}

}
