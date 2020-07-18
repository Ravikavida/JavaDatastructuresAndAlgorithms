package com.datastructures.arrays;

public class FirstNonrepeatedCharinString {

	public static void main(String[] args) {
		String s = "asdfaa";
		
		for (int i = 0; i < s.length(); i++) {
			
			if (i==s.indexOf(s.charAt(i)) && i == s.lastIndexOf(s.charAt(i))) {
				System.out.println(s.charAt(i));
				break;
			}

		}
	}
}