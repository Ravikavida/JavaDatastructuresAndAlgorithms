package com.datastructures.arrays;

public class MergeSort {
	public static void mergeSort(int arr[], int start, int end) {
		if (start != end) {
			int mid = (start + end) / 2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			merge(arr, start, mid, end);
		}

	}

	private static void merge(int arr[], int start, int mid, int end) {
		int i = start;
		int j = mid + 1;
		int k = 0;
		int temp[] = new int[end - start + 1];
		while ((i <= mid) && (j <= end)) {
			if (arr[i] < arr[j])
				temp[k++] = arr[i++];
			else
				temp[k++] = arr[j++];

		}
		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= end) {
			temp[k++] = arr[j++];
		}
		for (i = start; i <= end; i++) {
			arr[i] = temp[i - start];
		}

	}

	public static void main(String[] args) {

		int arr[] = { 3, 2, 4, 9, 8, 7, 15, 11 };
		
		MergeSort.mergeSort(arr, 0, arr.length-1);
		for(int k:arr) {
			System.out.println(k);
		}
	}

}
