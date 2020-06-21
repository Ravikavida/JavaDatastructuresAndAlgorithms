package com.datastructres.arrays;

public class QuikSort {

	public static void quicksort(int arr[], int start, int end) {
		int i;
		int j;
		int temp;
		int pivot;
		if (start < end) {
			i = start;
			pivot = start;
			j = end;

			while (i < j) {
				pivot = start;
				while (arr[i] <= arr[pivot] && i < j)
					i++;
				while (arr[j] > arr[pivot])
					j--;
				if (i < j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
			quicksort(arr, start, j - 1);
			quicksort(arr, j + 1, end);
		}
	}
	public static void main(String[] args) {
		int arr[]= {15,8,2,6,1,18,30,12};
		QuikSort.quicksort(arr, 0, arr.length-1);
		
		for(int k:arr) {
			System.out.println(k);
		}

	}

}
