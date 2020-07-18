package com.datastructures.arrays;

import java.util.Arrays;

public class SherlockAndArray {

	public static String find_k_whose_leftside_and_rightside_elements_sum_equal(int arr[]) {

		int x = 0;

		int sum = Arrays.stream(arr).sum();
		
		for (int y : arr) {
			if (2 * x == sum - y) {
				return "Yes  " + y;
			}
			x = x + y;
		}

		return "No such Element";
	}

	public static void main(String[] args) {

		int arr[] = { 2,3,6,13,8,2};
		
		System.out.println(find_k_whose_leftside_and_rightside_elements_sum_equal(arr));

	}

}
