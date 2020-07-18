package com.datastructures.arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		if(arr.length <= 0) {
			return;
		}
		for(int i =0;i<arr.length;i++) {
			for(int j =0;j<arr.length;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 4, 1, 6, 5, 0, 2, 1 };
		BubbleSort.bubbleSort(arr);

		for (int k : arr) {
			System.out.println(k);
		}
	}

}
