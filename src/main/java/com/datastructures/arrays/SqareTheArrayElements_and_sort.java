package com.datastructures.arrays;

public class SqareTheArrayElements_and_sort {
//sort given array
	public static void sortArry(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}
	}
	//sqare given array and call sort method
	public static void sortSquares(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}
		sortArry(arr);
		}

	public static void main(String[] args) {

		int arr[] = { -2, 1, -5, -4, 3 };
		SqareTheArrayElements_and_sort.sortSquares(arr);

		for (int k : arr) {
			System.out.println(k);
		}

	}

}
