package com.datastructures.strings;

public class ReverseAString {

	public static void main(String[] args) {

		String input = "hello World";

		String output1 = "";

		for (int i = 0; i < input.length(); i++) {
			output1 = input.charAt(i) + output1;
		}

		System.out.println(output1);

		// way two
		String output2 = "";
		for (char ch : input.toCharArray()) {
			output2 = ch + output2;
		}
		System.out.println(output2);

	}

}
