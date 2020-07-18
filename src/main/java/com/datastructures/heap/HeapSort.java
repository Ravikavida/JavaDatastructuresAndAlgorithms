package com.datastructures.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class HeapSort {

	// sort elementsin assecndingorderUsing HeapSort

	public static int[] sortElements(int arr[]) {

		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			minHeap.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] = minHeap.poll();
		}
		return arr;
	}

	public static void main(String[] args) {

		int arr[] = { 34, 12, 11, 10, 44, 31, 2, 1 };
		int result[] = sortElements(arr);
		System.out.println(Arrays.toString(result));

	}

}
