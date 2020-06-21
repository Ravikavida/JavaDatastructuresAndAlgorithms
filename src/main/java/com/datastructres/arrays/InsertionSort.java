package com.datastructres.arrays;

public class InsertionSort {
	
	public static void inserionsort(int arr[]) {
		if(arr.length <=1) {
			return;
		}
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			int j;
			
			for(j= i-1;j>=0 && arr[j]>key;j--) {
				arr[j+1] = arr[j];
			}
			arr[j+1] =key;
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {4,1,6,5,0,2,1};
		InsertionSort.inserionsort(arr);
		
		for(int k:arr) {
			System.out.println(k);
		}
	}

}
