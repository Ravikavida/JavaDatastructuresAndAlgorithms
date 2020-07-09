package com.datastructres.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class GetTop_k_frequentElemntsInthegivenArray {

	// using maxheap
	public static List<Integer> gettop_k_frequentElements(int arr[], int k) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>(
				(n1, n2) -> n2.getValue() - n1.getValue());

		maxheap.addAll(map.entrySet());
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < k && !map.isEmpty(); i++) {
			result.add(maxheap.poll().getKey());
		}
		return result;
	}

	// using minHeap
	public static List<Integer> gettop_k_frequentElements_minHeap(int arr[], int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>(
				(n1, n2) -> n1.getValue() - n2.getValue());

		for (Map.Entry<Integer, Integer> entryset : map.entrySet()) {
			if (minHeap.size() < k) {
				minHeap.add(entryset);
			} else {
				if (entryset.getValue() > minHeap.peek().getValue()) {
					minHeap.poll();
					minHeap.add(entryset);
				}
			}
		}
		List<Integer> list = new ArrayList<>();
		while (!minHeap.isEmpty()) {
			list.add(minHeap.poll().getKey());
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 8, 10, 7, 8, 11, 30, 11, 8, 38, 11, 2, 45, 2, 8 };
		List<Integer> maxHeapresult = gettop_k_frequentElements(arr, 3);
		System.out.println(maxHeapresult);
		
		List<Integer> minHeapresult = gettop_k_frequentElements_minHeap(arr, 3);
		System.out.println(minHeapresult);

	}

}
