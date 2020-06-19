package com.datastructres.arrays;

public class CyclicArraySort {
	
	public static void cyclicArraySort(int arr[]) {
		
		if(arr.length <=1) {
			return;
		}
		int i=0;
		int k = 11; // in this case need to find minimum number dynamically.
		while(i< arr.length) {
			if(arr[i] !=i+k) {
				int destindex = arr[i]-k;
				 int x = arr[i];
				 arr[i] =arr[destindex];
				 arr[destindex] = x;
			}
			else {
				i++;
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[] = {13,12,14,15,11,16};
		
		CyclicArraySort.cyclicArraySort(arr);
		
		for(int k:arr) {
			System.out.println(k+" ");
		}
		

	}

}
