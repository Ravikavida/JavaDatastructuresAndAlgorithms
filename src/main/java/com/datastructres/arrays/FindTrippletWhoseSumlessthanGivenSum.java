package com.datastructres.arrays;

import java.util.Arrays;

public class FindTrippletWhoseSumlessthanGivenSum {
	
	public static int getsubArray(int arr[],int sum) {
		
		if(arr.length <=2) {
			return 0;
		}
		int tripletCount = 0;
	Arrays.sort(arr);
	for(int i =0;i<arr.length-2 ;i++) {
		int start = i+1;
		int end = arr.length-1;
		while(start < end) {
			int t = arr[i]+arr[start]+arr[end];
			if(t<sum) {
				tripletCount = tripletCount + end -start;
				start ++;
			}else {
			end--;
			}
		}
	}
		return tripletCount;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,-3,4,-2};
		
System.out.println(FindTrippletWhoseSumlessthanGivenSum.getsubArray(arr, 1));
	}

}
