package com.datastructres.arrays;

import java.util.HashSet;
import java.util.Set;

public class SearchAnGivenElementInArray_sorted_and_unsorted {
//O(n) time complexity and O(n) space complexity since using hashing
	public static Set<Integer> findGivenElement_in_unsortedArray(int arr[], int num) {

		Set<Integer> result = new HashSet<>();
		if (arr.length == 0) {
			return result;
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				result.add(i);
			}
		}
		return result;
	}

	// O(logn) complexity
	// if we have duplicate index take written type as set r list
	//bubble sort
	public static int getElemtfromSortedOrder(int arr[], int num,int start,int end) {

		if (arr.length == 0) {
			return -1;
		}
		while(start<end) {
			int mid = (start+end)/2;
			
			if(arr[mid] == num) {
				return mid;
			}else if(num >arr[mid]) {
				start = mid +1;
			}else {
				end = mid -1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 6, 1, 2, 11, 9, 12, 2 };
		int sortedarr[] = { 3, 5, 6, 7,9,11,12,14,15,18};

		Set<Integer> re = findGivenElement_in_unsortedArray(arr, 13);
		System.out.println(re);
		
		System.out.println(getElemtfromSortedOrder(sortedarr,14,0,arr.length-1));

	}

}
