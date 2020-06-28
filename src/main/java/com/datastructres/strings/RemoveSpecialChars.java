package com.datastructres.strings;

public class RemoveSpecialChars {

	public static void main(String[] args) {
		String s ="@sbac#//%&*123";
		
		// one way
		String result ="";
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>64 && s.charAt(i)<=124) {
				result =result+s.charAt(i);
			}
		}
		System.out.println(result);
		
		// using RegEx
		String str = s.replaceAll("\\W+", "");
		System.out.println(str);
		
		//using RegEx
		System.out.println(s.replaceAll("[^A-Za-z1-9]", ""));
		

	}

}
