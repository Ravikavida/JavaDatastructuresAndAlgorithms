package com.datastructures.arrays;

import java.util.Random;

public class ArraySuffle {

	public static void suffleArray(int arr[]) {
		if (arr.length <= 1) {
			System.out.println("");
		}
		Random value = new Random();

		for (int i = 0; i < arr.length; i++) {
			int randomIndex = value.nextInt(arr.length);
			int temp = arr[i];
			arr[i] = arr[randomIndex];
			arr[randomIndex] = temp;
		}
		for (int k : arr) {
			System.out.print(k + " ");
		}
	}

	public static void main(String[] args) {

		int arr[] = { 4, 7, 9, 2, 3, 11, 10 };
		suffleArray(arr);

	}

}
