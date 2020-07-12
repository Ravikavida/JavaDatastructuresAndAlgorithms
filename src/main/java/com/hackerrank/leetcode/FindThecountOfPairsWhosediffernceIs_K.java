package com.hackerrank.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindThecountOfPairsWhosediffernceIs_K {

	// O(n2)

	public static int findCountOfPair(int arr[], int k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] - arr[j] == k || arr[j] - arr[i] == k) {
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

	public static int vere(int arr[], int k) {
		int size = arr.length;
		List<String> list = new ArrayList<>();

		int i = 0, j = 1;

		while (i < size && j < size) {
			if (i != j && arr[j] - arr[i] == k) {
				list.add(arr[j] + "" + arr[i]);
			} else if (arr[j] - arr[i] < k)
				j++;
			else
				i++;
		}
		return list.size();
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		int result = findCountOfPair(arr, 2);
		System.out.println(result);

		int result1 = findcountofPairWhoseDiff_k(arr, 2);
		System.out.println(result1);
		
		int result3 = vere(arr,2);
		System.out.println(result3);

	}

}
