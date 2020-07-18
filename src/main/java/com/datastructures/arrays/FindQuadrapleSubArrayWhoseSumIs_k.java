package com.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindQuadrapleSubArrayWhoseSumIs_k {

	public List<List<Integer>> getQuadraticsubbArray(int arr[], int targetSum) {
		Arrays.sort(arr);
		if (arr.length <= 3) {
			return null;
		}
		List<List<Integer>> allQuadratic = new ArrayList<>();
		for (int i = 0; i < arr.length - 3; i++) {
			for (int j = i + 1; j < arr.length - 2; j++) {
				int sum = targetSum - (arr[i] + arr[j]);
				int start = j + 1;
				int end = arr.length - 1;
				while (start < end) {
					int t = arr[start] + arr[end];
					if (t == sum) {
						allQuadratic.add(Arrays.asList(arr[i], arr[j], arr[start], arr[end]));
						start++;
						end--;
					} else if (t < sum) {
						start++;
					} else {
						end--;
					}
				}
			}
		}
return allQuadratic;
	}
public static void main(String[] args) {
	FindQuadrapleSubArrayWhoseSumIs_k k = new FindQuadrapleSubArrayWhoseSumIs_k();
	int arr[] = {1,2,-3,4,-2,-1,3};
	List<List<Integer>> list = k.getQuadraticsubbArray(arr, 3);
	System.out.println(list);
}
}
