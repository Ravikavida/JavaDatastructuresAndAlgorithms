package com.datastructres.heap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapbyUsingValues {

	public static void main(String[] args) {

		Map<String, Integer> wordCounts = new HashMap<>();
		wordCounts.put("Ford", 100);
		wordCounts.put("Paypal", 200);
		wordCounts.put("FreshWorks", 50);
		wordCounts.put("Walmart", 70);
		wordCounts.put("bnpp", 200);

		Map<String, Integer> resultMap = wordCounts.entrySet().stream()
				.sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		
		resultMap.forEach((k,v)->{
			System.out.println(k+" "+v);
		});
	}

}
