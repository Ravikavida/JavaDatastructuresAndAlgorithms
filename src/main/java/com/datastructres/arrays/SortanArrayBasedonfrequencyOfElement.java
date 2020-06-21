package com.datastructres.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortanArrayBasedonfrequencyOfElement {

	public static List<Integer> sortArrayAccFrequency(List<Integer> list) {

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < list.size(); i++) {
			map.put(list.get(i), map.getOrDefault(list.get(i), 0) + 1);
		}
		Collections.sort(list, (k1, k2) -> {

			int freq1 = map.get(k1);
			int freq2 = map.get(k2);
			if (freq1 != freq2) {
				return freq2 - freq1;
			}
			return list.indexOf(k1) - list.indexOf(k2);
		});
		return list;

	}

	public static void main(String[] args) {
		int arr[] = { 10, 10, 10, 11, 11, 2, 3, 3, 3, 3, 12 };

		List<Integer> input = Arrays.stream(arr).boxed().collect(Collectors.toList());

		List<Integer> result = SortanArrayBasedonfrequencyOfElement.sortArrayAccFrequency(input);
		
		System.out.println(result);

	}

}
