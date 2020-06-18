package com.datastructres.arrays;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesandMissingnumbersInArray {
	
	public static  List<List<Integer>> getmissingAndDuplicate(int arr[]){
		
		if(arr.length == 1) {
			return new ArrayList<>();
		}
		int i=0;
		while(i<arr.length) {
			if(arr[i] != arr[arr[i]-1]) {
				int otherIndex = arr[i]-1;
				int x= arr[i];
				arr[i] = arr[otherIndex];
				arr[otherIndex] =x;
			}else {
				i++;
			}
		}
		
		List<Integer> duplicates = new ArrayList<>();
		List<Integer> missing = new ArrayList<>();
		
		for(int j =0;j<arr.length;j++) { 
			
			if(arr[j] != j+1) {
				missing.add(j+1);
				duplicates.add(arr[j]);
			}
		}
		List<List<Integer>> list = new ArrayList<>();
		list.add(missing);
		list.add(duplicates);
		return list;
		
	}

	public static void main(String[] args) {
		
	System.out.println(	DuplicatesandMissingnumbersInArray.getmissingAndDuplicate(new int[] {4,3,4,5,1}));
	}

}
