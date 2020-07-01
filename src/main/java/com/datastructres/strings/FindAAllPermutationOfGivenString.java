package com.datastructres.strings;

public class FindAAllPermutationOfGivenString {

	public static void getAllPermutations(String input, String ans) {
		if (input.length() == 0) {
			System.out.println(ans+" ");
			return;
		}

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);

			String restofstring = input.substring(0, i) + input.substring(i + 1);
			getAllPermutations(restofstring, ans + ch);
		}
	}

	public static void main(String[] args) {
		
		getAllPermutations("abc","");

	}

}
