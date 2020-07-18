package com.datastructures.arrays;

public class FindmissingNumberin_one_to_n_puls_one_range {
	
	public static int findMissedNumber(int arr[]) {
		if(arr.length == 0) {
			return -1;
		}
		int i =0;
		while(i< arr.length) {
			if(arr[i]<=arr.length && arr[i] !=i+1) {
				int otherIndex = arr[i]-1;
				int x = arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] = x;
			}else {
				i++;
			}
		}
		for(int j =0;j<arr.length;j++) {
			if(arr[j] != j+1) {
				return j+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
System.out.println(FindmissingNumberin_one_to_n_puls_one_range.findMissedNumber(new int[] {1,3,5,6,4}));
	}

}
