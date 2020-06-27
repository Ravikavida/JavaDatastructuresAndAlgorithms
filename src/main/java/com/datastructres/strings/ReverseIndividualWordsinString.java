package com.datastructres.strings;

import java.util.Stack;

public class ReverseIndividualWordsinString {

	public static String reverseWords(String input) {
		String finalStr = "";
		String tempstr = "";

		for (int i = 0; i < input.length(); i++) {

			char ch = input.charAt(i);
			if (ch == ' ') {
				finalStr = finalStr + tempstr + " ";
				tempstr = "";
			} else {
				tempstr = ch + tempstr;
			}
		}
		finalStr = finalStr + tempstr;

		return finalStr;

	}

	// using statck
	public static void reverseWordsUsingStack(String input) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				while (!st.isEmpty()) {
					System.out.print(st.pop());
				}
				System.out.print(" ");
			} else {
				st.push(ch);
			}
		}

		while (!st.isEmpty()) {
			System.out.print(st.pop());
		}

	}

	public static void main(String[] args) {

		/*
		 * String finalstr =
		 * ReverseIndividualWordsinString.reverseWords("hello world welcome");
		 * System.out.println(finalstr);
		 */
		
		ReverseIndividualWordsinString.reverseWordsUsingStack("hello world welcome");

	}

}
