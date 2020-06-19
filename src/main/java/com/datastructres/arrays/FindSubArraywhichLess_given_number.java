package com.datastructres.arrays;

import java.util.ArrayList;
import java.util.List;

public class FindSubArraywhichLess_given_number {
	public static List<List<Integer>> getsubArray(int arr[], int num) {

		List<List<Integer>> solution = new ArrayList<>();
		int mul = 1;
		int start = 0;

		for (int i = 0; i < arr.length; i++) {
			mul = mul * arr[i];
			while (mul >= num) {
				mul = mul / arr[start];
				start++;
			}
			List<Integer> subArrlist = new ArrayList<>();
			for (int j = i; j >= start; j--) {
				subArrlist.add(0, arr[j]);
				solution.add(new ArrayList<>(subArrlist));
			}
			
		}

		return solution;
	}

	public static void main(String[] args) {
		
		System.out.println(FindSubArraywhichLess_given_number.getsubArray(new int[]{4,2,5,3,6,2,6}, 30));

	}

}
