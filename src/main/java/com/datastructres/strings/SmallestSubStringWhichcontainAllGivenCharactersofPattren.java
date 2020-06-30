package com.datastructres.strings;

import java.util.HashMap;
import java.util.Map;

public class SmallestSubStringWhichcontainAllGivenCharactersofPattren {

	public static String getsmalletSubStringWillAllchar(String s, String pattren) {

		if (s == null || s.length() == 0 || pattren == null || pattren.length() == 0) {
			return "";
		}

		Map<Character, Integer> map = new HashMap<>();

		int start = 0;
		int matched = 0;
		int minlength = Integer.MAX_VALUE;
		int minsubstringStart = 0;

		for (char ch : pattren.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		for (int end = 0; end < s.length(); end++) {
			char currentchar = s.charAt(end);
			if (map.containsKey(currentchar)) {
				map.put(currentchar, map.get(currentchar) - 1);
				if (map.get(currentchar) >= 0) {
					matched++;
				}
			}
			while (matched == pattren.length()) {
				if (end - start + 1 < minlength) {
					minlength = end - start + 1;
					minsubstringStart = start;
				}

				char charAtstart = s.charAt(start++);

				if (map.containsKey(charAtstart)) {
					if (map.get(charAtstart) == 0) {
						matched--;
					}
					map.put(charAtstart, map.get(charAtstart) + 1);
				}
			}
		}
		if (minlength > s.length()) {
			return "";
		}

		return s.substring(minsubstringStart, minsubstringStart + minlength);
	}

	public static void main(String[] args) {

	String s =	SmallestSubStringWhichcontainAllGivenCharactersofPattren.getsmalletSubStringWillAllchar("badeabcaae", "aabc");
	
	System.out.println(s);

	}

}
