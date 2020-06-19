package com.datastructres.arrays;

public class MinAndMaxDifference_ArrayElements {

	public static void main(String[] args) {
		int arr[] = {3,5,9,13,1,17,3};
		//sort logic
		for(int i=0 ;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp =arr[i];
				arr[i] = arr[i+1];
				arr[i+1]  = temp;
				i= -1;
			}
		}
		int min_diff = Integer.MAX_VALUE;
		int max_diff = Integer.MIN_VALUE;
				
			//min value logic	
		for(int i =0;i<arr.length-1;i++) {
			if((arr[i+1]-arr[i]) < min_diff) {
				min_diff = arr[i+1]-arr[i];
			}
		}
		System.out.println(min_diff);
		
		System.out.println("....max differnce......");
		//max value logic
		for(int i =0;i<arr.length-1;i++) {
			if((arr[i+1]-arr[i]) > max_diff) {
				max_diff = arr[i+1]-arr[i];
			}
		}
		System.out.println(max_diff);
	
	}

}
