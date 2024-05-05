package com.datastructures.arrays;

public class ArrayMinSubArrayMindiffAndElements {
	
	public static void main(String[] args) {
		int arr[] = {3,1,5,7,10,23,15,45};
		for(int i =0;i<arr.length-1;i++) {
			if (arr[i] >arr[i+1]) {
				int nextindex = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = nextindex;
				i= -1;
			}
		}
		int mindiff = Integer.MAX_VALUE;
		for(int i=0;i<arr.length-1;i++) {
			if((arr[i+1]-arr[i])<mindiff) {
				mindiff = arr[i+1]-arr[i];
			}
		}
		
		for(int i =0;i<arr.length -1 ;i++) {
			if(mindiff == arr[i+1]-arr[i]) {
				System.out.println(arr[i+1]+"  "+arr[i]);
			}
		}
		
	}

}
