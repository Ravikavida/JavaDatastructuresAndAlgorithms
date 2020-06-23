package com.datastructres.arrays;

import java.util.HashMap;
import java.util.Map;

public class FindSmallestSubarraylengthWhosesumis_k {

	public static int findSmalestsubArraywhosesumis_k(int arr[], int sum) {

		if (arr.length == 0) {
			System.out.println("no such array exist");
			return -1;
		}

		int end = 0;
		int totalsumtillNow = 0;
		int smallestlength = Integer.MAX_VALUE;

		Map<Integer, Integer> map = new HashMap<>();

		while (end < arr.length) {

			totalsumtillNow = totalsumtillNow + arr[end];
			if (totalsumtillNow == sum) {
				System.out.println("start index: " + 0 + " " + "end Index: " + end);
				smallestlength = Math.min(smallestlength, end + 1);
			}
			int windowsum = totalsumtillNow - sum;
			if(map.containsKey(windowsum)) {
				int start = map.get(windowsum);
				System.out.println("start index: " + (start+1) + " " + "end Index: " + end);
				smallestlength = Math.min(smallestlength, end-start);
			}
			map.put(totalsumtillNow, end++);
		}

		return smallestlength !=Integer.MAX_VALUE?smallestlength:-1;
	}

	public static void main(String[] args) {

		int arr[] = { 2, -3, 5, -2, 6, 9, -4 };
		
		int length = findSmalestsubArraywhosesumis_k(arr,3);
		System.out.println(length);

	}

}
