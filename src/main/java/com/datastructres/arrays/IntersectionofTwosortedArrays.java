package com.datastructres.arrays;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwosortedArrays {

	public static Set<Integer> findintersectElements(int arr[], int arr2[]) {

		Set<Integer> set = new HashSet<>();
		int i = 0;
		int j = 0;

		while (i < arr.length && j < arr2.length) {
			while ((i < arr.length - 1) && (arr[i] == arr[i + 1])) {
				i++;
			}
			while ((j < arr2.length - 1) && (arr2[j] == arr2[j + 1])) {
				j++;
			}
			if (arr[i] < arr2[j]) {
				i++;

			} else if (arr[i] > arr2[j]) {
				j++;
			} else {
				set.add(arr[i]);
				i++;
				j++;
			}
		}
		return set;

	}

	public static void main(String[] args) {
		int arr1[] = {2, 2, 2, 3, 3, 4, 7, 8};
	    int arr2[] = {1, 2, 4, 4, 6, 6, 6, 7, 8, 10};

	Set<Integer> set = 	findintersectElements(arr1, arr2);
	System.out.println(set);

	}

}
