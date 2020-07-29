package com.datastructures.stack;

import java.util.Stack;

public class Delimator_or_bracket_checking_usingStack {

	public boolean delimatorCheck(String input) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			switch (c) {
			case '{':
			case '(':
			case '[':
				stack.push(c);
				break;
			case '}':
			case ')':
			case ']':
				if (!stack.isEmpty()) {
					char ch = stack.pop();
					if (ch == '{' && c != '}' || ch == '(' && c != ')' || ch == '[' && c != ']') {
						System.out.println("not a valid brackets:" + c);
						return false;
					}
				} else {
					System.out.println("not a valid brackets");
					return false;
				}
				break;
			}
		}
		if (!stack.isEmpty()) {
			System.out.println("not a valid brackets");
			return false;
		}
		return true;
	}

	public static void main(String[] args) {

		Delimator_or_bracket_checking_usingStack a = new Delimator_or_bracket_checking_usingStack();

		String st = "a[b+{c*(u-r)}]";
		System.out.println(a.delimatorCheck(st));

		String st1 = "a[b+{c*(u-r)}}]";
		System.out.println(a.delimatorCheck(st1));

		String st2 = "a+b+c*u-r)}}]";
		System.out.println(a.delimatorCheck(st2));

		String st3 = "a[[b+{c*(u-r)}]";
		System.out.println(a.delimatorCheck(st3));

	}

}
