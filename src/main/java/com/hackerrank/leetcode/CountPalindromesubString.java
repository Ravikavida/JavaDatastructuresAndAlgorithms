package com.hackerrank.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CountPalindromesubString {

	// This method will consider palindrome substring length minimum 2
	public static int countpalindromsubstring(String input) {

		int count = 0;
		String temp = "";
		StringBuffer buffer;
		// if they ask palindrome substrings insted count use list and add
		List<String> list = new ArrayList<>();

		for (int i = 0; i < input.length(); i++) {
			for (int j = i + 2; j <= input.length(); j++) {
				temp = input.substring(i, j);
				if (temp.length() >= 2) {
					buffer = new StringBuffer(temp);
					buffer.reverse();
					if (buffer.toString().compareTo(temp) == 0) {
						list.add(temp);
						count++;
					}
				}
			}
		}
		System.out.println(list);
		return count;
	}

	//this method consider the initial each char also palindrome
	public static int palindromeCount(String input) {
		int size = input.length();// all single characters in string are treated as palindromes.
		int count = size;
		StringBuffer buffer;
		for (int i = 0; i < size; i++) {
			for (int j = i + 2; j <= size; j++) {
				String value = input.substring(i, j);
				buffer = new StringBuffer(value).reverse();
				if (buffer.toString().compareTo(value) == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int result = countpalindromsubstring("abbcbbd");
		System.out.println(result);

		int k = palindromeCount("abbcbbd");
		System.out.println(k);
	}

}
