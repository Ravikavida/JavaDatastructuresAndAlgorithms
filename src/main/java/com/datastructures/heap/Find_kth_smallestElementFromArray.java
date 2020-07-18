package com.datastructures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_kth_smallestElementFromArray {

	// using maxheap
	public static int kthSmallestUsingMaxHeap(int arr[], int k) {

		if (arr.length < k) {
			System.out.println("invalid array..");
			return -1;
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < k; i++) {
			maxHeap.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.add(arr[i]);
			}
		}
		return maxHeap.peek();
	}

	// using minHeap

	public static int kthSmallestUsingMinHeap(int arr[], int k) {

		if (arr.length < k) {
			System.out.println("invalid array..");
			return -1;
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			minHeap.add(arr[i]);
		}

		for (int i = 0; i < k - 1; i++) {
			minHeap.poll();
		}
		return minHeap.peek();
	}

	public static void main(String[] args) {

		int arr[] = { 10, 7, 11, 30, 20, 38, 2, 45 };
		int result = kthSmallestUsingMaxHeap(arr, 3);
		System.out.println(result);

		int min = kthSmallestUsingMinHeap(arr, 3);
		System.out.println(min);
	}

}
