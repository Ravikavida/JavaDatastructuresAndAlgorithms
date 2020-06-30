package com.datastructres.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagramsofAgivenPattreninString {

	public static List<Integer> getAllAnagrams(String s, String pattren) {

		if (s.length() == 0 || s == null || pattren == null || pattren.length() == 0) {
			return new ArrayList<>();
		}
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : pattren.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int matched = 0;
		int start = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			char currentchar = s.charAt(i);
			if (map.containsKey(currentchar)) {
				map.put(currentchar, map.get(currentchar) - 1);
				if (map.get(currentchar) == 0) {
					matched++;
				}
			}
			if (map.size() == matched) {
				list.add(start);
			}
			if (i >= pattren.length() - 1) {
				char charAtstart = s.charAt(start++);
				if (map.containsKey(charAtstart)) {
					if (map.get(charAtstart) == 0) {
						matched--;
					}
					map.put(charAtstart, map.get(charAtstart) + 1);
				}

			}
		}
		return list;
	}

	public static void main(String[] args) {
		
		List<Integer> list = FindAllAnagramsofAgivenPattreninString.getAllAnagrams("bcdcbabcbd", "abc");
		System.out.println(list);

	}

}
