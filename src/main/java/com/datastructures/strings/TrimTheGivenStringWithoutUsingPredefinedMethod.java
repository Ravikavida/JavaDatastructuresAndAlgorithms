package com.datastructures.strings;

public class TrimTheGivenStringWithoutUsingPredefinedMethod {

	public static String trimString(String input) {
		int start = 0;
		int end = input.length()-1;
		int count;

		char ch[] = input.toCharArray();
		for (int i = 0; i < input.length(); i++) {
			if (ch[i] != ' ') {
				start = i;
				break;
			}
		}
		
		for(int i=input.length()-1;i>start-1;i--) {
			if(ch[i]!=' ') {
				end = i;
				break;
			}
		}
		count = end-start+1;
		String result = new String(ch,start,count);

		return result;
	}

	public static void main(String[] args) {
		
		String s =TrimTheGivenStringWithoutUsingPredefinedMethod.trimString("   hello World!!...   ");
		System.out.println(s);

	}

}
