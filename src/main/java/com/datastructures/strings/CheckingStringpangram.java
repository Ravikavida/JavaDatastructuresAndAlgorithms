package com.datastructures.strings;

import java.util.HashSet;
import java.util.Set;

public class CheckingStringpangram {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog";

		String s = str.toLowerCase().replaceAll("[^a-z]", "");
		Set<Character> set = new HashSet<>();
		for (char c : s.toCharArray()) {
			set.add(c);
		}
		boolean b = set.size() == 26 ? true : false;
		System.out.println(b);

	}
}
