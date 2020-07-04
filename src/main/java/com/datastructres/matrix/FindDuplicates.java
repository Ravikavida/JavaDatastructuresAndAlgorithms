package com.datastructres.matrix;

public class FindDuplicates {
	public static void main(String[] args) {

	int arr[] = { 2, 3, 1, 2, 4, 6, 4, 5,4 };
	int count[] = new int[arr.length];
	for(
	int i = 0;i<arr.length;i++)
	{
		if (count[arr[i]] == 1) {
			System.out.println(arr[i]);
		} else {
			count[arr[i]]++;
		}
	}
}
}

