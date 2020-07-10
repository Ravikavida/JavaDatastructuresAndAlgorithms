package com.app;

public class FizzBuzz {

	public void testfizbuzz(int n) {
		for (int i = 1; i <=n; i++) {
			
		String s =	i % 3 == 0 && i%5 !=0?"fizz":i % 5 == 0 && i%3 !=0?"buzz":i % 3 == 0 && i % 5 == 0?"FizzBuzz":i+"";
			
		/*	if (i % 3 == 0 && i%5 !=0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0 && i%3 !=0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else {
				System.out.println(i);
			}*/
		System.out.println(s);
		}
		
		
	}

	public static void main(String[] args) {
		FizzBuzz vb = new FizzBuzz();
		vb.testfizbuzz(15);

	}

}
