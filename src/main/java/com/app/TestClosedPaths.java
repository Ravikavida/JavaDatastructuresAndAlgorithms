package com.app;

public class TestClosedPaths {

	public static int findClosedPaths(int number) {
		String s = String.valueOf(number);
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) =='0'||s.charAt(i) =='4'||s.charAt(i) =='6'||s.charAt(i) =='9') {
				count = count+1;
			}else if(s.charAt(i) =='8'){
				count =count+2;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int result = findClosedPaths(630);
		System.out.println(result);

	}

}
