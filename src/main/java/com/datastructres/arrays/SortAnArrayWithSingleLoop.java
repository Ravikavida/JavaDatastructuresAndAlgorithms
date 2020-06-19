package com.datastructres.arrays;

import java.util.ArrayList;
import java.util.List;

public class SortAnArrayWithSingleLoop {
	public static void main(String[] args) {
		int arr[]= {1,2,4,4,3,6};
		
		if(arr.length <=1) {
			return;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i =-1;
			}
		}
		List<Integer> mlist = new ArrayList<>();
		List<Integer> dlist = new ArrayList<>();
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i] != i+1) {
				mlist.add(i+1);
				dlist.add(arr[i]);
			}
		}
		System.out.println(mlist +" "+ dlist);
		
	}

}
