package com.datastructures.strings;

import java.util.Arrays;

public class CheckTwoStringsAnagramorNot {

	public static String sortString(String s) {

		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length - 1; i++) {
			if (ch[i] > ch[i + 1]) {
				char temp = ch[i];
				ch[i] = ch[i + 1];
				ch[i + 1] = temp;
				i = -1;
			}
		}
		return new String(ch);

	}

	// one way
	public static boolean checkTwoStringsAngram(String s1, String s2) {

		char ch1[] = s1.toCharArray();

		Arrays.sort(ch1);

		char ch2[] = s2.toCharArray();
		Arrays.sort(ch2);

		String str1 = new String(ch1);
		String str2 = new String(ch2);

		return str1.equalsIgnoreCase(str2) ? true : false;

	}

	// second way
	
	public static boolean secondwayofCheckingAnagram(String s1,String s2) {
		
		String str1 = sortString(s1);
		String str2 = sortString(s2);
		return str1.equals(str2)?true:false;
		
	}

	public static void main(String[] args) {
		System.out.println(checkTwoStringsAngram("save", "aesv"));
		CheckTwoStringsAnagramorNot.sortString("yzxacb");
		System.out.println(secondwayofCheckingAnagram("save", "aesv"));
	}
	

}
