package com.datastructres.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class HowMaxheapAndMinHepaWorksInternally {

	// by default priority Queue is a minheap
	public static void minHeap(int arr[]) {

		PriorityQueue<Integer> que = new PriorityQueue<>();
		for (int i = 0; i < arr.length; i++) {
			que.add(arr[i]);
			System.out.print(que.peek() + " ");
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			que.poll();
			System.out.print(que.peek() + " ");
		}
		System.out.println();
	}

	// max heap

	public static void maxHeap(int arr[]) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
			System.out.print(maxHeap.peek()+" ");
		}
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			maxHeap.poll();
			System.out.print(maxHeap.peek()+" ");
		}
		System.out.println();
		
	}

	public static void main(String[] args) {

		int arr[] = { 2, 7, 9, 1, 13, 45, 11, 10 };
		minHeap(arr);
		
		maxHeap(arr);

	}

}
