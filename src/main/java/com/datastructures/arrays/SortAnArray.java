package com.datastructures.arrays;

public class SortAnArray {

	public static void main(String[] args) {
		//with O(n) time complexity, best solution.
		int arr[]= {3,2,6,5,7,4,1};
		int i = 0;
		if(arr.length ==0) {
			return;
		}
		while(i < arr.length) {
			if(arr[i] != arr[arr[i]-1]) {  // we can use arr[i] != i+1
				int otherIndex = arr[i]-1;
				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			}else {
			i++; 
			}
		}
		for(int k:arr) {
			System.out.println(k);
		}
	System.out.println("------------O(n^2)---");	
		for(int j=0;i<arr.length;j++) {
			for(int l=0;l<arr.length;l++) {
				if(arr[i]<arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] =temp;
				}
			}
		}
		for(int k:arr) {
			System.out.println(k);
		}
		
		
	}

}
