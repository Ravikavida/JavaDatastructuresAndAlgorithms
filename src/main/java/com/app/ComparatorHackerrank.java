package com.app;

public class ComparatorHackerrank {
	public boolean compare(int a, int b) {

		return a == b ? true : false;
	}

	public boolean compare(String s1, String s2) {

		return s1.equalsIgnoreCase(s2) ? true : false;
	}

	public boolean compare(int a[], int b[]) {

		return a.length == b.length ? true : false;
	}

	public static void main(String[] args) {

	}

}
