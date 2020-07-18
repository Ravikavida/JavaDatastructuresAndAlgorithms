package com.datastructures.arrays;

public class FindFirstOccurenceOfElament_whose_adjust_elementDiffernce_k {

	public static int findElemntIndex(int arr[], int val) {

		if (arr.length == 0) {
			return -1;
		}
		int start = 0;
		while (start < arr.length) {
			if (arr[start] == val) {
				return start;
			}
			int diff = Math.abs(arr[start] - val);
			start = start + diff;
		}
		return -1;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5,6,7,8,2,1,2};
		int k =findElemntIndex(arr,2);
		System.out.println(k);
		
	}

}
