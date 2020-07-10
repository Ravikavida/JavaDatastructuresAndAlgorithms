package com.datastructres.heap;

import java.util.PriorityQueue;

public class ConnectingDifferentropsWithminimumCost {

	public static int findMinimumcostConnectingDiffernetrops(int ropes[]) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < ropes.length; i++) {
			minHeap.add(ropes[i]);
		}
		int mincost = 0;
		while (minHeap.size() > 1) {
			int tempcost = minHeap.poll() + minHeap.poll();
			mincost = mincost + tempcost;
			minHeap.add(tempcost);
		}
		return mincost;
	}

	public static void main(String[] args) {
		int ropes[] = { 3, 4, 7, 2 };
		int result = findMinimumcostConnectingDiffernetrops(ropes);
		System.out.println(result);
	}

}
