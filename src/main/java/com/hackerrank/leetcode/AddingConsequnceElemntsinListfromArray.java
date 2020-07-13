package com.hackerrank.leetcode;

import java.util.ArrayList;
import java.util.List;

public class AddingConsequnceElemntsinListfromArray {

	public static List<List<Integer>> add(int arr[]) {
		List<List<Integer>> list = new ArrayList<>();
		int start =0;
		for (int i = 0; i < arr.length-1;i++) {
			if (arr[i+1]== arr[i]+1) {
				if(arr.length-1 == i+1) {
					List<Integer> k = new ArrayList<>();
					for(int j=start;j<arr.length;j++) {
						 k.add(arr[j]);
					}
					list.add(k);
				}
			}else {
				List<Integer> k = new ArrayList<>();
				for(int j=start;j<=i;j++) {
					 k.add(arr[j]);
				}
				list.add(k);
				start = i+1;
			}
		}
		return list;
	}
	

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,7,8,11,12,13,19,20};

		List<List<Integer>>  result = add(arr);
		System.out.println(result);
	}

}
