package com.datastructures.heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Coordinates {
	int x;
	int y;

	Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getMinDistancefromOrigin() {
		return x * x + y * y;
	}
}

public class FindCoordinatesMinimumDistancefromOrigin {

	// Using List time complexity nlogn
	public static List<Coordinates> findCoodrinatesUsingList(List<Coordinates> input, int k) {

		List<Coordinates> result = new ArrayList<>();
		Collections.sort(input, (n1, n2) -> n1.getMinDistancefromOrigin() - n2.getMinDistancefromOrigin());

		int i = 0;
		while (i < input.size() && i < k) {
			result.add(input.get(i));
			i++;
		}
		return result;
	}

	// Using Min Heap timecomplexity nlog(n)+klog(n)
	public static List<Coordinates> findCoodrinatesUsingminHeap(List<Coordinates> input, int k) {
		List<Coordinates> result = new ArrayList<>();

		PriorityQueue<Coordinates> minHeap = new PriorityQueue<>(
				(n1, n2) -> n1.getMinDistancefromOrigin() - n2.getMinDistancefromOrigin());

		for (int i = 0; i < input.size(); i++) {
			minHeap.add(input.get(i));
		}

		int i = 0;
		while (!minHeap.isEmpty() && i < k) {
			result.add(minHeap.poll());
			i++;
		}
		return result;

	}

	// using Maxheap best solution klogk
	public static List<Coordinates> findCoodrinatesUsingmaxHeap(List<Coordinates> input, int k) {
		List<Coordinates> result = new ArrayList<>();
		PriorityQueue<Coordinates> maxHeap = new PriorityQueue<>(
				(n1, n2) -> n2.getMinDistancefromOrigin() - n1.getMinDistancefromOrigin());
		for (int i = 0; i < k; i++) {
			maxHeap.add(input.get(i));

		}

		for (int i = k; i < input.size(); i++) {
			if (input.get(i).getMinDistancefromOrigin() < maxHeap.peek().getMinDistancefromOrigin()) {
				maxHeap.poll();
				maxHeap.add(input.get(i));
			}
		}
		while (!maxHeap.isEmpty()) {
			result.add(maxHeap.poll());
		}
		return result;
	}

	public static void main(String[] args) {
		Coordinates c1 = new Coordinates(2, 3);
		Coordinates c2 = new Coordinates(1, 4);
		Coordinates c3 = new Coordinates(3, 5);
		Coordinates c4 = new Coordinates(0, 4);
		Coordinates c5 = new Coordinates(1, 1);
		List<Coordinates> input = new ArrayList<>();
		input.add(c1);
		input.add(c2);
		input.add(c3);
		input.add(c4);
		input.add(c5);

		List<Coordinates> listResult = findCoodrinatesUsingList(input, 2);
		listResult.forEach(data -> {
			System.out.println(data.x + " " + data.y);
		});

		List<Coordinates> minHeapResult = findCoodrinatesUsingminHeap(input, 2);
		minHeapResult.forEach(data -> {
			System.out.println(data.x + " " + data.y);
		});
		List<Coordinates> maxHeapResult = findCoodrinatesUsingmaxHeap(input, 2);

		maxHeapResult.forEach(data -> {
			System.out.println(data.x + " " + data.y);
		});

	}

}
