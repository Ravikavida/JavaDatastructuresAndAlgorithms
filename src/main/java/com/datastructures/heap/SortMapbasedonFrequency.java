package com.datastructures.heap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class SortMapbasedonFrequency {

	public static String sortBasedOnFrequency(String s) {
		if (s.length() == 0) {
			return "not valid string String";
		}
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
				(n1, n2) -> n2.getValue() - n1.getValue());

		maxHeap.addAll(map.entrySet());

		StringBuffer buffer = new StringBuffer();

		while (!maxHeap.isEmpty()) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			for (int i = 0; i < entry.getValue(); i++) {
				buffer.append(entry.getKey());
			}
		}

		return buffer.toString();
	}

	// just printing Distinct chars after sorting by frequency

	public static List<Character> getdistinctcharsoftersortedByfrequency(String s) {

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
				(n1, n2) -> n2.getValue() - n1.getValue());
		maxHeap.addAll(map.entrySet());
		List<Character> result = new ArrayList<>();
		while (!maxHeap.isEmpty()) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			result.add(entry.getKey());
		}
		return result;
	}

	public static void main(String[] args) {

		String s = "DatastructruesandAlgorithms";
		String result = sortBasedOnFrequency(s);
		System.out.println(result);
		
		List<Character> distictchars = getdistinctcharsoftersortedByfrequency(s);
		System.out.println(distictchars);
	}

}
