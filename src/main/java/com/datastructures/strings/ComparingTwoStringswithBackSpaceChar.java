package com.datastructures.strings;

public class ComparingTwoStringswithBackSpaceChar {

	public static boolean compareStringsWithBackspace(String s1, String s2) {

		int s1_end = s1.length() - 1;
		int s2_end = s2.length() - 1;

		while (s1_end >= 0 && s2_end >= 0) {
			int str1index = getchar(s1, s1_end);
			int str2index = getchar(s2, s2_end);

			if (str1index < 0 && str2index < 0) {
				return true;
			}
			if (str1index < 0 || str2index < 0) {
				return false;
			}
			if (s1.charAt(str1index) != s2.charAt(str2index)) {
				return false;
			}
			s1_end = str1index - 1;
			s2_end = str2index - 1;
		}

		return true;
	}

	private static int getchar(String s, int end) {
		int specialchar = 0;
		while (end >= 0) {
			if (s.charAt(end) != '#') {
				if (specialchar == 0) {
					return end;
				} else {
					specialchar--;
				}

			} else {
				specialchar++;
			}
			end--;
		}
		return end;
	}

	public static void main(String[] args) {

		boolean result = ComparingTwoStringswithBackSpaceChar.compareStringsWithBackspace("bcd##e", "bdkl#e");

		System.out.println(result);

	}

}
