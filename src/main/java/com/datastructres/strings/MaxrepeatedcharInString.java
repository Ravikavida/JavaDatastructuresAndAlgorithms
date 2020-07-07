package com.datastructres.strings;

import java.util.HashMap;
import java.util.Map;

public class MaxrepeatedcharInString {

	int count[] = new int[256];

	public char getMaxRepetedCharfromString(String s) {

		for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i)]++;
		}
		int max = -1;
		char result = ' ';
		for (int i = 0; i < s.length(); i++) {
			if (max < count[s.charAt(i)]) {
				max = count[s.charAt(i)];
				result = s.charAt(i);
			}
		}
		return result;
	}

	// using Hasing second way

	public char getMaxrepetedCharinString(String s) {

		Map<Character, Integer> map = new HashMap<>();

		for (char ch : s.toCharArray()) {
			map.merge(ch, 1, Integer::sum);
		}
		int max = 0;
		char result = ' ';
		for (Map.Entry<Character, Integer> pair : map.entrySet()) {
			if (max < pair.getValue()) {
				max = pair.getValue();
				result = pair.getKey();
			}

		}

		return result;
	}

	public static void main(String[] args) {
		MaxrepeatedcharInString c = new MaxrepeatedcharInString();
		char ch = c.getMaxRepetedCharfromString("ababbbabad");
		System.out.println(ch);
		char ch2 = c.getMaxrepetedCharinString("ababbbabadccccccc");
		System.out.println(ch2);

	}

}
