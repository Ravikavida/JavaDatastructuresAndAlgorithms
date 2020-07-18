package com.datastructures.arrays;

public class SelectionSort {
	public static void selectionSort(int arr[]) {
		if (arr.length <= 1) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if ( arr[j] < arr[minindex] ) {
					minindex = j;
				}
			}

			if (minindex != i) {
				int temp = arr[minindex];
				arr[minindex] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {

		int arr[] = { 4, 1, 6, 5, 0, 2, 1 };
		SelectionSort.selectionSort(arr);

		for (int k : arr) {
			System.out.println(k);
		}
	}

}
