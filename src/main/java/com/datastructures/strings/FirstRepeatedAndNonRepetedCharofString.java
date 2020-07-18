package com.datastructures.strings;

public class FirstRepeatedAndNonRepetedCharofString {

	public static void main(String[] args) {
		String s ="alsbchbcha";
		//First Repeated Char
		for(int i =0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i)) ) {
				System.out.println(s.charAt(i));
				break;
			}
		}
		
		//first non-repeated char
		for(int i =0;i<s.length();i++) {
			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)) ) {
				System.out.println(s.charAt(i));
				break;
			}
		}

	}

}
