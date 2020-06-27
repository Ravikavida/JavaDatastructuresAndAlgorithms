package com.datastructres.strings;

import java.util.HashMap;
import java.util.Map;

public class FindSubStringLengthWhoseDistinctCharsizeIs_k {

	public static int findLongestSubstringWithcharsize_k(String s, int k) {
		if (s == null || s.length() == 0 || k >= s.length() || k == 0) {
			return -1;
		}

		int maxlenth = 0;
		int start = 0;
		int end = 0;
		Map<Character, Integer> map = new HashMap<>();
		while (end < s.length()) {
			char ch = s.charAt(end);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
			while (map.size() > k) {
				char charfromFront = s.charAt(start);
				map.put(charfromFront, map.get(charfromFront) - 1);
				if (map.get(charfromFront) == 0) {
					map.remove(charfromFront);
				}
				start++;
			}
			maxlenth = Math.max(maxlenth, end - start + 1);
			end++;
		}
		return maxlenth;
	}

	public static void main(String[] args) {
		
		int len = FindSubStringLengthWhoseDistinctCharsizeIs_k.findLongestSubstringWithcharsize_k("bccbababd", 2);
		System.out.println(len);

	}

}
