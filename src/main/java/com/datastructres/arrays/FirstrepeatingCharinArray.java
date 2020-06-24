package com.datastructres.arrays;

import java.util.HashSet;
import java.util.Set;

public class FirstrepeatingCharinArray {
	
	public static int getFirstRepeatingValue(int arr[]) {
		
		Set<Integer> set = new HashSet<>();
		int firstRepeating = -1;
		
		for(int i=arr.length-1;i>=0;i--) {
			if(set.contains(arr[i])) {
				firstRepeating = arr[i];
			}else {
				set.add(arr[i]);
			}
			
		}
		
		return firstRepeating;
	}

	public static void main(String[] args) {
		
		int []arr = {3,2,4,5,3,7,9,2,4};
		System.out.println(getFirstRepeatingValue(arr));
		

	}

}
