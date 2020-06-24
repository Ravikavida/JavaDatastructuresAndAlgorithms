package com.datastructres.arrays;

import java.util.HashSet;
import java.util.Set;

public class FindingUniqueElementsInTwounSortedArrays {

	public static Set<Integer> getUniqueArray(int arr1[], int arr2[]) {

		Set<Integer> set = new HashSet<>();
		int i = 0;
		int j = 0;
		while (i < arr1.length) {
			set.add(arr1[i++]);
		}
		while (j < arr1.length) {
			set.add(arr2[j++]);
		}
		return set;
	}

	public static void main(String[] args) {
		
		int arr1[] = {4, 2, 3, 5, 4, 2, 3};
	    int arr2[] = {9, 1, 7, 2, 4, 2, 1, 2};
	    System.out.println(getUniqueArray(arr1,arr2));

	}

}
