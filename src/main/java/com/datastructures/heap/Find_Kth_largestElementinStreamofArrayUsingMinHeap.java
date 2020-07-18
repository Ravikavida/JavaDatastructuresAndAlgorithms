package com.datastructures.heap;

import java.util.PriorityQueue;

public class Find_Kth_largestElementinStreamofArrayUsingMinHeap {

	PriorityQueue<Integer> minHeap = new PriorityQueue<>();

	public int add(int num, int k) {
		if (minHeap.size() < k) {
			minHeap.add(num);
			return minHeap.size() == k ? minHeap.peek() : -1;
		}

		if (num > minHeap.peek()) {
			minHeap.poll();
			
			minHeap.add(num);
		}

		return minHeap.peek();
	}

	public static void main(String[] args) {
		Find_Kth_largestElementinStreamofArrayUsingMinHeap heap = new Find_Kth_largestElementinStreamofArrayUsingMinHeap();
		int arr[] = new int[] { 10, 7, 11, 5, 27, 8, 9, 45 };
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result= heap.add(arr[i], 3);
		}
		System.out.println(result);

	}

}
