package com.datastructures.arrays;

import java.util.Arrays;

public class ArrayOfDigitsPlusOne {

	public static int[] plusOne(int[] digits) {

		int n = digits.length;

		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] != 9) {
				digits[i] += 1;
				return digits;
			} else {
				digits[i] = 0;
			}

		}
		int[] newDigits = new int[n + 1];
		newDigits[0] = 1;
		return newDigits;
	}

	public static void main(String[] args) {
		int i[] = { 1, 2, 3 };
		
		int result[] = ArrayOfDigitsPlusOne.plusOne(i);
		System.out.println(Arrays.toString(result));
		
	
	}
		
	}


