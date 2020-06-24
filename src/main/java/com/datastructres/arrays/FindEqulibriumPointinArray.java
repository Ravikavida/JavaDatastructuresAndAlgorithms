package com.datastructres.arrays;

import java.util.Arrays;

public class FindEqulibriumPointinArray {
	public static int findEqulibriumPoint(int arr[]) {
		if (arr.length == 0) {
			return -1;
		}
		int sum = 0;
		int sum_sofar = 0;
		sum = Arrays.stream(arr).sum();
		for (int i = 0; i < arr.length; i++) {
			sum = sum - arr[i];
			if (sum == sum_sofar) {
				return i;
			} else {
				sum_sofar = sum_sofar + arr[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 3, 7, 11, 21, 11, 10 };
		System.out.println(findEqulibriumPoint(arr));

	}

}
