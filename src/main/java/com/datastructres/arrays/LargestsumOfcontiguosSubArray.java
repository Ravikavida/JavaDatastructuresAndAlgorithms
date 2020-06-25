package com.datastructres.arrays;

public class LargestsumOfcontiguosSubArray {

	public static int LargestSumofContiguiosSubArray(int arr[]) {

		if (arr.length == 0) {
			return -1;
		}
		int msf = 0;
		int meh = 0;

		for (int i = 0; i < arr.length; i++) {
			meh = meh + arr[i];
			if (meh < 0) {
				meh = 0;
			}
			if (msf < meh) {
				msf = meh;
			}

		}

		return msf;

	}

	public static void main(String[] args) {
		
		int [] a = {-2, -3, 1, -1, -2, 1, 5, 9,2};
		
		System.out.println(LargestSumofContiguiosSubArray(a));

	}

}
