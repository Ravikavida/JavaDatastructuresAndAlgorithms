package com.datastructres.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Find_TopK_largestElementsInArray {

	// using minHeap best solution

	public static List<Integer> findtop_k_largestElements(int arr[], int k) {
		if (arr.length < k) {
			System.out.println("not valid arry");
			return new ArrayList<>();
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < k; i++) {
			minHeap.add(arr[i]);
		}

		for (int i = k; i < arr.length; i++) {
			if (arr[i] > minHeap.peek()) {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		for (int i = 0; i < k; i++) {
			list.add(minHeap.poll());
		}
		return list;
	}
//using maxHeap

	public static List<Integer> find_topK_largestElemnts(int arr[], int k) {

		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			maxHeap.add(arr[i]);
		}
		for (int i = 0; i < k; i++) {
			list.add(maxHeap.poll());
		}
		return list;
	}

	public static void main(String[] args) {

		int arr[] = {10,7,11,30,8,38,2,45};
		
		List<Integer> minHeapResult = findtop_k_largestElements(arr, 3);
		System.out.println(minHeapResult);
		
		List<Integer> maxHeapResult = find_topK_largestElemnts(arr, 3);
		System.out.println(maxHeapResult);
		
	}

}
