package com.datastructres.strings;

public class ReverseAWordsInString {

	// first way
	public static String reverseWordsinString(String input) {
		String result = "";
		for (String string : input.split(" ")) {
			result = string + " " + result;
		}

		return result.substring(0, input.length());
	}

	// secondway
	public static String reverseWordsinString_secondway(String input) {

		String finalstr = "";
		String tempstr = "";

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == ' ') {
				finalstr = " " + tempstr + finalstr;
				tempstr = "";
			} else {
				tempstr = tempstr + ch;
			}
		}
		finalstr = tempstr + finalstr;

		return finalstr;

	}
	
	//3rd way
	
	public static String reverseWordsOfStringUsingBuffer(String s) {
		
		StringBuffer finalstr = new StringBuffer();
		StringBuffer tempstr = new StringBuffer();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			
			if(ch== ' ') {
				finalstr.insert(0,tempstr).insert(0," ");
				tempstr.setLength(0);
			}else {
				tempstr.append(ch);
			}
		}
		finalstr = finalstr.insert(0, tempstr);
		return finalstr.toString();
		
	}

	public static void main(String[] args) {
		String finalResult = ReverseAWordsInString.reverseWordsinString("Hello world welcome java");
		System.out.println(finalResult);
		
		String finalResult2 = ReverseAWordsInString.reverseWordsinString_secondway("Hello world welcome java");
		
		System.out.println(finalResult2);
		
		String finalResult3 = ReverseAWordsInString.reverseWordsOfStringUsingBuffer("Hello world welcome java");
		
		System.out.println(finalResult3);


	}

}
