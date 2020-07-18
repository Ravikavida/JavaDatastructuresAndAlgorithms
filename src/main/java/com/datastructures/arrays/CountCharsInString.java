package com.datastructures.arrays;

import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {

	public static void main(String[] args) {
		String s = "aggdhajgjeaescas";
		Map<Character, Integer> map = new HashMap<>();

		for (char c : s.toCharArray()) {
			map.merge(c, 1, Integer::sum);
		}
		System.out.println(map);

		// second way
		Map<Character, Integer> map2 = new HashMap<>();
		for (char c : s.toCharArray()) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		System.out.println(map2);

	}

}
