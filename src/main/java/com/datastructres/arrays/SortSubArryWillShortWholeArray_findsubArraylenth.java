package com.datastructres.arrays;

public class SortSubArryWillShortWholeArray_findsubArraylenth {
	
	public int findsubArraylenthwhenitsortwholeArrayWillSort(int arr[]) {
		
		if(arr.length==0) {
			return -1;
		}
		int start =0;
		while(start <arr.length-1 && arr[start] < arr[start+1]) {
			start++;
		}
		if(start == arr.length-1) {
			return 0;
		}
	int end =arr.length -1;
	while (end >0 && arr[end-1]<arr[end]) {
		end--;
	}
	
	int min = Integer.MAX_VALUE;
	int max = Integer.MIN_VALUE;
	
	for(int i=start+1;i<end;i++) {
		min = Math.min(min, arr[i]);
		min = Math.max(max, arr[i]);
	}
	while(start >=0 && arr[start]> min) {
		start --;
	}
	while(end <arr.length && arr[end] < max) {
		end++;
	}
	System.out.println(arr[start] + " "+ arr[end]);
	return end-start -1;
	}

	public static void main(String[] args) {
		int arr[]= { 1,2,4,3,11,7,12,5,14,13,15,16};
		SortSubArryWillShortWholeArray_findsubArraylenth l =new SortSubArryWillShortWholeArray_findsubArraylenth();
		int length = l.findsubArraylenthwhenitsortwholeArrayWillSort(arr);
		System.out.println(length+2);
	}

}
