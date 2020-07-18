package com.datastructures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_kth_ElementUsingHeap {
	
	//using minheap
	public static int find_kth_largest_minheap(int arr[],int k) {
		if(arr.length <k) {
			System.out.println("not valid array..");
			return -1;
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			minHeap.add(arr[i]);
		}
		for(int i=k;i<arr.length;i++) {
			if(arr[i]>minHeap.peek()) {
				minHeap.poll();
				minHeap.add(arr[i]);
			}
		}
		return minHeap.peek();
	} 
	
	//using maxHeap
	public static int find_kth_largest_maxheap(int arr[],int k) {
		
		if(arr.length < k) {
			System.out.println("not a valid array");
			return -1;
		}
		
		PriorityQueue<Integer> maxHeap = new  PriorityQueue<Integer>(Collections.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
		}
		for(int i=0;i<k-1;i++) {
			maxHeap.poll();
		}
		return maxHeap.peek();
	}

	public static void main(String[] args) {
		
		int arr[] = {23,21,89,43,56,78,10,67};
		
		int minHeapResult = find_kth_largest_minheap(arr,3);
		System.out.println(minHeapResult);
		int maxHeapResult = find_kth_largest_maxheap(arr,3);
		System.out.println(maxHeapResult);

	}

}
