package com.datastructures.arrays;

public class FindmaxsumofsubbarryWhoseLength_k {
	public static int findmaxsumofsubArrayofLength_k(int arr[], int k) {
		if (arr.length == 0) {
			return 1;
		}
		int sum = 0;
		int i;
		for (i = 0; i < k; i++) {
			sum = sum + arr[i];
		}

		int max_sum = sum;
		int start = 0;
		for (int j = i; j < arr.length; j++) {
			sum = sum + arr[j] - arr[start++];
			if (sum > max_sum) {
				max_sum = sum;
			}
		}
		return max_sum;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 6, 9, 8, 4 };
		
		int sum = findmaxsumofsubArrayofLength_k(arr,3);
		System.out.println(sum);

	}

}
