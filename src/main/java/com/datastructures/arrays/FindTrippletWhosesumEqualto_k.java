package com.datastructures.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTrippletWhosesumEqualto_k {
	
	public List<List<Integer>> gettripplet(int arr[],int targetsum){
		Arrays.sort(arr);
	if(arr.length <3){
		return new ArrayList<>();
	}
	List<List<Integer>> tripplet = new ArrayList<>();
	for(int i =0;i<arr.length-2;i++) {
		int start = i+1;
		int end = arr.length -1;
		int sum = targetsum - arr[i];
		while(start<end) {
			int t = arr[start]+arr[end];
			if(sum == t) {
				tripplet.add(Arrays.asList(arr[start],arr[end],arr[i]));
				start++;
				end--;
			}else if(t< sum) {
				start++;
			}else {
				end --;
			}
			
		}
	}
	return tripplet;
	}
	public static void main(String[] args) {
		
		int arr[] = {1,2,-3,4,-2,-1};
		
		FindTrippletWhosesumEqualto_k k = new FindTrippletWhosesumEqualto_k();
		List<List<Integer>> result = k.gettripplet(arr, 1);
		System.out.println(result);
		
	}

}
