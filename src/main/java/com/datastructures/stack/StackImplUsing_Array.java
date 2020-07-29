package com.datastructures.stack;

public class StackImplUsing_Array {

	int top = 0;
	int MAX_SIZE = 5;
	int arr[] = new int[MAX_SIZE];

	public boolean isFull() {
		return top == MAX_SIZE ? true : false;
	}

	public boolean isEmpty() {
		return top == 0 ? true : false;
	}

	public void insert(int value) {
		if (isFull()) {
			System.out.println("cannot add elemet.");
			return;
		}
		arr[top++] = value;
	}

	public int remove() {
		if (isEmpty()) {
			System.out.println("stack is emepty");
			return Integer.MIN_VALUE;
		}
		return arr[--top];
	}

	public int getTop() {
		if (isEmpty()) {
			System.out.println("stack is emepty");
		}
		return arr[top - 1];
	}

	public static void main(String[] args) {

		StackImplUsing_Array a = new StackImplUsing_Array();
		a.insert(12);
		a.insert(5);
		a.insert(34);
		a.insert(42);
		a.insert(91);

		System.out.println(a.remove());
		a.insert(9);

		System.out.println("Top:" + a.getTop());

		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());
		System.out.println(a.remove());

	}

}
