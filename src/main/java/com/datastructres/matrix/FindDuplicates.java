package com.datastructres.matrix;

import java.util.Arrays;

public class FindDuplicates {
	public static void main(String[] args) {

		int arr[] = { -1, -1, 1, 2, 3, 4, 4, 3, 6,4};
		Arrays.sort(arr);
		for (int i = 0, j = 1; j < arr.length; j++, i++) {
			if (arr[i] == arr[j]) {
				System.out.println(arr[i]);
				while (j < arr.length && arr[i] == arr[j]) {
					j++;
				}
				i = j - 1;
			}
		}

	}
}
