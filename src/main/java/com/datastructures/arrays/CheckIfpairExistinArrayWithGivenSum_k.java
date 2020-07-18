package com.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfpairExistinArrayWithGivenSum_k {
	public static  boolean checkThePairExist_r_not(int arr[], int sum) {
		if (arr.length == 0) {
			return false;
		}
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(sum - arr[i])) {
				return true;
			}
			set.add(arr[i]);
		}
		return false;
	}

	public static void main(String[] args) {
		
		int arr[] = {23,56,12,34,10,11,23};
		
		boolean b = checkThePairExist_r_not(arr,11);
		System.out.println(b);

	}

}
