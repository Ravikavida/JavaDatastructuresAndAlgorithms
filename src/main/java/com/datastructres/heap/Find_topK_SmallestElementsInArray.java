package com.datastructres.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Find_topK_SmallestElementsInArray {

	// using Max Heap best solution
	public static List<Integer> find_topK_smallestElemebnts(int arr[], int k) {
		if (arr.length < k) {
			System.out.println("not valid arry");
			return new ArrayList<>();
		}
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			maxHeap.add(arr[i]);
		}
		for (int i = k; i < arr.length; i++) {
			if (arr[i] < maxHeap.peek()) {
				maxHeap.poll();
				maxHeap.add(arr[i]);
			}
		}
		for (int i = 0; i < k; i++) {
			list.add(maxHeap.poll());
		}
		return list;
	}

	// using minHeap
	public static List<Integer> find_topK_smallestElemebnts_minHeap(int arr[], int k) {
		if (arr.length < k) {
			System.out.println("not valid arry");
			return new ArrayList<>();
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			minHeap.add(arr[i]);
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			list.add(minHeap.poll());
		}
		return list;

	}

	public static void main(String[] args) {

		int arr[] = { 10, 7, 11, 30, 8, 38, 2, 45 };

		List<Integer> maxHeapResult = find_topK_smallestElemebnts(arr, 3);
		System.out.println(maxHeapResult);
		
		List<Integer> minHeapResult = find_topK_smallestElemebnts_minHeap(arr, 3);
		System.out.println(minHeapResult);

	}

}
