package com.datastructres.arrays;

public class MaxAvarageOfSubArraylength_k {

	public static float getmaxsumofasubArray_k(int arr[], int k) {
		if (arr.length == 0 || k == 0) {
			return 0;
		}
		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum = sum + arr[i];
		}
		float max_sum = sum;
		int start = 0;
		for (int j = k; j < arr.length; j++) {
			sum = sum + arr[j] - arr[start++];
			if (sum > max_sum) {
				max_sum = sum;
			}
		}
		return max_sum/k;
	}

	public static void main(String[] args) {

		int arr[]= {1,2,4,5,6,7};
	float t =	MaxAvarageOfSubArraylength_k.getmaxsumofasubArray_k(arr, 2);
	System.out.println(t);
		
	}
}
