package com.datastructures.arrays;

public class RemoveDuplicatesfromArray {
	
	public static int removeduplicateElem(int arr[]) {
		
		if(arr.length <=1) {
			return arr.length;
		}
		int start =1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				arr[start++] = arr[i];
			}
		}
		return start;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,4,4,4,5,6,7,7,8};
		
		int k = removeduplicateElem(arr);
		System.out.println(k);
		for(int i =0;i<k;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
