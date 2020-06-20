package com.datastructres.arrays;

import java.util.Arrays;

public class PrintPairofNumbersinArrayWhosesum_k {

	public static void main(String[] args) {
		int arr[] = { 3, 4, 7, 12, 8,  5,11};
		int sum = 19;

		Arrays.sort(arr);
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			int s = arr[low] + arr[high];
			if (s > sum) {
				high--;
			} else if (s < sum) {
				low++;
			} else if (s == sum) {
				System.out.println(arr[low] + " " + arr[high]);
				low++;
				high--;
			}
		}
	}

}
