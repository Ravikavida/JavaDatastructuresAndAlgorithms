package com.datastructures.dynamicPrograming;

public class FindingFibonacciNumber {

	// using recursive call
	public static int getFibonacciNumber(int n) {

		if (n < 2) {
			return n;
		}
		return getFibonacciNumber(n - 1) + getFibonacciNumber(n - 2);

	}

	// top down approch
	public static int getgetFibonacciNumber_topDownAproch(int arr[], int n) {
		if (n < 2) {
			return n;
		}
		if (arr[n] == 0) {
			arr[n] = getgetFibonacciNumber_topDownAproch(arr, n - 1) + getgetFibonacciNumber_topDownAproch(arr, n - 2);
		}
		return arr[n];
	}

	// bottomup approch

	public static int getFibonacciNumberbottomUpApproch(int n) {
		if (n < 2) {
			return n;
		}
		int[] f = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i - 1] + f[i - 2];
		}
		return f[n];

	}

	// bottomup approch better solution

	public static  int getFibonacciNumberbottomUpApprochbetter(int n) {
		int a = 0;
		int b = 1;
		int c;
		for (int i = 2; i <= n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args) {
		int n = 6;
		System.out.println(FindingFibonacciNumber.getFibonacciNumber(n));
		int[] arr = new int[n + 1];
		System.out.println(FindingFibonacciNumber.getgetFibonacciNumber_topDownAproch(arr, n));
		System.out.println(FindingFibonacciNumber.getFibonacciNumberbottomUpApproch(n));
		System.out.println(FindingFibonacciNumber.getFibonacciNumberbottomUpApprochbetter(n));

	}
	

}
