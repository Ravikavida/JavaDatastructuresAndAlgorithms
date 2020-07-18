package com.datastructures.arrays;

import java.util.HashSet;
import java.util.Set;

public class UnionOftwoSortedArrays {

	public static Set<Integer> getUnionofSortedArray(int arr1[], int arr2[]) {
		Set<Integer> set = new HashSet<>();
		
		int i =0;int j=0;
		while(i<arr1.length && j<arr2.length) {
			while((i<arr1.length-1)&& (arr1[i] == arr1[i+1])) {
				i++;
			}
			while((j<arr2.length-1)&& (arr2[j] == arr2[j+1])) {
				j++;
			}
			if(arr1[i] < arr2[j]) {
				set.add(arr1[i++]);
			}else if(arr1[i] > arr2[j]) {
				set.add(arr2[j++]);
			}else {
				set.add(arr1[i]);
				i++;j++;
			}
		}
		while(i <arr1.length) {
			if(i<arr1.length-1 && arr1[i] == arr1[i+1]) {
				i++;
			}else {
				set.add(arr1[i++]);
			}
		}
		
		while(j <arr1.length) {
			if(j<arr2.length-1 && arr2[j] == arr2[j+1]) {
				j++;
			}else {
				set.add(arr2[j++]);
			}
		}

		return set;
	}

	public static void main(String[] args) {
		
		int arr1[] = {2, 2, 3, 4,5, 4, 4, 7, 8};
	    int arr2[] = {1, 2, 2, 2, 4, 6, 6, 6, 7, 8, 10};

	    Set<Integer> set = getUnionofSortedArray(arr1,arr2);
	    System.out.println(set);
	}

}
