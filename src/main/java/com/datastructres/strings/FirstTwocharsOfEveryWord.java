package com.datastructres.strings;

public class FirstTwocharsOfEveryWord {

	public static void main(String[] args) {

		String str = " Hello World";
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != ' ' && (i == 0 || ch[i - 1] == ' ')) {
				System.out.println(ch[i]);
			}
		}

	}

}
