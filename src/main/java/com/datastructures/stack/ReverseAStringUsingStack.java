package com.datastructures.stack;

import java.util.Stack;

public class ReverseAStringUsingStack {

	// UsingStack
	public String reverseString(String input) {
		Stack<Character> stack = new Stack<>();
		String reverse = "";
		for (char ch : input.toCharArray()) {
			stack.push(ch);
		}
		while (!stack.isEmpty()) {
			reverse = reverse + stack.pop();
		}
		return reverse;
	}

	// using preappending

	public String reverseStringByPreappending(String input) {
		String reverse = "";
		for (char ch : input.toCharArray()) {
			reverse = ch + reverse;
		}
		return reverse;
	}

	public static void main(String[] args) {

		String input = "helooWorld";

		ReverseAStringUsingStack s = new ReverseAStringUsingStack();
		String result = s.reverseString(input);
		System.out.println(result);
		
		String result1 = s.reverseStringByPreappending(input);
		System.out.println(result1);
		

	}

}
