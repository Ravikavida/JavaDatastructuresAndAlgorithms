package com.datastructures.strings;

import java.util.HashSet;
import java.util.Set;

public class FindDistinctCharsInString {

	public static void main(String[] args) {
		/*
		 * String str[] = { "Heloo", "Bye", "welcome", "tata", "bolok" };
		 * 
		 * Arrays.stream(str).filter(data -> data.startsWith("w")).sorted().map(data ->
		 * data + " " + "Ravi") .collect(Collectors.toList()).forEach(x -> {
		 * System.out.println(x); });
		 * 
		 * Arrays.stream(str).map(String::toLowerCase).filter(x -> x.startsWith("b"))
		 * .map(s -> s + " - " +
		 * s.chars().distinct().count()).collect(Collectors.toList()).forEach(result ->{
		 * System.out.println(result); });;
		 */
		
		// one way
		String s ="bccbababd";
		int i = (int)s.chars().distinct().count();
		System.out.println(i);
		
		// second way O(n) complexicity and space complexcity o(n)
		Set<Character> set = new HashSet<>();
		
		for(char ch: s.toCharArray()) {
			set.add(ch);
		}
		System.out.println(set.size());
		


	}

}
