package com.datastructres.arrays;

public class MinNumberInArray {
	
	public static void  main(String[] args) {
		
		int arr[]= {23,11,14,15,17,16,2};
		
		if(arr.length == 1) {
			return ;
		}
		int i =0;
		int min = arr[0];
		while(i<arr.length) {
			if(arr[i]< min) {
				min = arr[i];
			}else {
				i++;
			}
		}
		System.out.println(min);
		
	}

}
