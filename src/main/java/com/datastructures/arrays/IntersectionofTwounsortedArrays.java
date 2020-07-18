package com.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwounsortedArrays {

	public static Set<Integer> findintersectElements(int arr[], int arr2[]) {

		Set<Integer> set = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		for (int i : arr) {
			set.add(i);
		}
		for (int j : arr2) {
			if (set.contains(j)) {
				result.add(j);
			}
		}
		System.out.println(result);
		return result;
	}

	public static void main(String[] args) {
		int arr1[] = { 4, 2, 3, 5, 4, 2, 3 };
		int arr2[] = { 9, 1, 7, 2, 4, 2, 1, 2 };

		findintersectElements(arr1, arr2);

	}

}
