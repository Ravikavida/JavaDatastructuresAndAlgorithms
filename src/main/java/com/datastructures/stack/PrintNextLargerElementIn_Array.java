package com.datastructures.stack;

import java.util.Stack;

public class PrintNextLargerElementIn_Array {

	public void printNextlargerElementinArray(int arr[]) {

		Stack<Integer> stack = new Stack<>();
		stack.push(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[i] > stack.peek()) {
				stack.pop();
				System.out.print(arr[i] + " ");
			}
			stack.push(arr[i]);
		}
		while (!stack.isEmpty()) {
			System.out.println(-1);
			stack.pop();
		}
	}

	public static void main(String[] args) {
		int arr[] = {2,4,6,1,8,3,9};
		PrintNextLargerElementIn_Array a = new PrintNextLargerElementIn_Array();
		a.printNextlargerElementinArray(arr);
	}

}
