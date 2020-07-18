package com.datastructures.strings;

import java.util.HashMap;
import java.util.Map;

public class FindLengthOfLongestSubstringWithnoRepeatedChars {

	public static int findLongestSubStringLengthWithNorepeatedChars(String s) {
		if (s == null || s.length() == 0) {
			return -1;
		}
		int max_length = 0;
		int start = 0;
		int end = 0;
		
		Map<Character,Integer> map = new HashMap<>();
		
		while(end < s.length()) {
			char currentChar = s.charAt(end);
			if(map.containsKey(currentChar)) {
				start = Math.max(start,map.get(currentChar)+1);
			}
			map.put(currentChar, end);
			max_length = Math.max(max_length, end-start+1);
			end++;
		}
		return max_length;
	}

	public static void main(String[] args) {
		
		int len = FindLengthOfLongestSubstringWithnoRepeatedChars.findLongestSubStringLengthWithNorepeatedChars("bcdcbababd");
		
		System.out.println(len);

	}

}
