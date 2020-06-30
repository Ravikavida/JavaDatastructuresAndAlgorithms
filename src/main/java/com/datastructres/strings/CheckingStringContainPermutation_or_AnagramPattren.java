package com.datastructres.strings;

import java.util.HashMap;
import java.util.Map;

public class CheckingStringContainPermutation_or_AnagramPattren {

	public static boolean checkingStringContainPermutation_or_AnagramPattren(String s, String pattren) {

		if (s == null || s.length() == 0 || pattren == null || pattren.length() == 0) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<>();
		for (char ch : pattren.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		int matched = 0;
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			char currnt = s.charAt(i);
			if (map.containsKey(currnt)) {
				map.put(currnt, map.get(currnt) - 1);
				if (map.get(currnt) == 0) {
					matched++;
				}
			}
			
			if(matched == map.size()) {
				return true;
			}
			
			if(i>= pattren.length()-1) {
				char charAtstart = s.charAt(start++);
				if(map.containsKey(charAtstart)) {
					if(map.get(charAtstart) ==0) {
						matched--;
					}
					map.put(charAtstart, map.get(charAtstart)+1);
				}
			}

		}

		return false;

	}

	public static void main(String[] args) {

	boolean b =	CheckingStringContainPermutation_or_AnagramPattren
				.checkingStringContainPermutation_or_AnagramPattren("bcdadbacbda", "abc");
	
	System.out.println(b);

	}

}
