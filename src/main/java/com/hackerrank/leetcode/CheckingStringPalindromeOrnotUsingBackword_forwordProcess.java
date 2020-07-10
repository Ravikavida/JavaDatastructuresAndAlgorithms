package com.hackerrank.leetcode;

public class CheckingStringPalindromeOrnotUsingBackword_forwordProcess {

	public static boolean checkPalindrome(String input) {
		String formated = input.replaceAll("\\s+", "").toLowerCase();
		int forword = 0;
		int backword = formated.length() - 1;
		while (backword > forword) {
			char fowordchar = formated.charAt(forword++);
			char backwordchar = formated.charAt(backword--);
			if (fowordchar != backwordchar)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(checkPalindrome("aba ba"));
	}

}
