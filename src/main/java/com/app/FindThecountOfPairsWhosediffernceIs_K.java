package com.app;

import java.util.Arrays;

public class FindThecountOfPairsWhosediffernceIs_K {

	// O(n2)

	public static int findCountOfPair(int arr[], int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] - arr[j] == k || arr[j] - arr[k] == k) {
					count++;
				}
			}
		}
		return count;
	}

	// O(nlogn)
	public static int findcountofPairWhoseDiff_k(int arr[], int k) {
		int count = 0;
		int left = 0;
		int right = 0;
		Arrays.sort(arr);
		while (right < arr.length) {
			if (arr[right] - arr[left] == k) {
				count++;
				right++;
				left++;
			} else if (arr[right] - arr[left] > k) {
				left++;
			} else {
				right++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6}; 
		
		int result = findCountOfPair(arr, 2);
		System.out.println(result);
		
		int result1 = findcountofPairWhoseDiff_k(arr, 2);
		System.out.println(result1);

	}

}
