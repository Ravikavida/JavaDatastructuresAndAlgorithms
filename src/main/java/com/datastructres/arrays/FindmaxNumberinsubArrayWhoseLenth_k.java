package com.datastructres.arrays;

import java.util.Deque;
import java.util.LinkedList;

public class FindmaxNumberinsubArrayWhoseLenth_k {

	public static void findMaxElementInSubArray(int arr[], int subarrlen) {

		if (arr.length == 0 || subarrlen <= 0 || subarrlen > arr.length) {
			return;
		}
		Deque<Integer> dq = new LinkedList<>();
		int i;
		for (i = 0; i < subarrlen; i++) {
			while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}

		for (; i < arr.length; i++) {

			System.out.println(arr[dq.peek()] + " ");

			while (!dq.isEmpty() && i - subarrlen >= dq.peek()) {
				dq.removeFirst();
			}
			while (!dq.isEmpty() && arr[i] >= arr[dq.peekLast()]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		System.out.println(arr[dq.peek()]);
	}

	public static void main(String[] args) {

		int arr[] = { 3, 6, 2, 4, 7, 9 };
		findMaxElementInSubArray(arr, 3);

	}

}
