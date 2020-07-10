package com.hackerrank.leetcode;

public class WholeMinuteDilemma {

	public static int findnoofSongs(int time[]) {
		int[] bucket = new int[60];
		int count = 0;

		for (int i : time) {
			int mod = i % 60;
			int diff = mod == 0 ? 0 : 60 - mod;
			count = count + bucket[diff];
			bucket[mod]++;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = { 30, 20, 150, 100, 40 };
		System.out.println(findnoofSongs(arr));
	}

}
