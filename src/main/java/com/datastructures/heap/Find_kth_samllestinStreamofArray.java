package com.datastructures.heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Find_kth_samllestinStreamofArray {
	
	PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

	public int findkthSamllest(int num,int k) {
		
		if(maxHeap.size()<k) {
			maxHeap.add(num);
			return maxHeap.size() == k?maxHeap.peek():-1;
		}
		if(num<maxHeap.peek()) {
			maxHeap.poll();
			maxHeap.add(num);
		}
	
		return maxHeap.peek();
		
	}

	public static void main(String[] args) {
		
		Find_kth_samllestinStreamofArray heap = new Find_kth_samllestinStreamofArray();
		
		int arr[] = new int[] { 10, 7, 11, 5, 27, 8, 9, 45 };
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result= heap.findkthSamllest(arr[i], 4);
		}
		System.out.println(result);

	}

}
