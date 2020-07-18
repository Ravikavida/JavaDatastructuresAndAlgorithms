package com.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSubArray_whose_sum_givensum_k {

	public static void subArray_whose_sum_is_given_sum(int arr[], int sum) {
		if (arr.length == 0) {
			System.out.println("no such array exist..");
			return;
		}
		int end = 0;
		int totalsumTillNow = 0;

		Map<Integer, Integer> map = new HashMap<>();

		while (end < arr.length) {
			totalsumTillNow = totalsumTillNow + arr[end];
			if (totalsumTillNow == sum) {
				System.out.println(0 + " " + end);
				return;
			}

			int window_sum = totalsumTillNow - sum;

			if (map.containsKey(window_sum)) {
				int start = map.get(window_sum);
				System.out.println((start + 1) + " " + end);
				return;
			}
			map.put(totalsumTillNow, end++);
		}

	}

	public static void main(String[] args) {

		int arr[] = { 4, 2, -5, 3, 1, 8 };
		subArray_whose_sum_is_given_sum(arr, -1);

	}

}
