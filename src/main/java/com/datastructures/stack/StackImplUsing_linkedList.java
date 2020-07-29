package com.datastructures.stack;

class Node {
	int data;
	Node next;
}

public class StackImplUsing_linkedList {

	Node front;

	public Node getNode(int value) {
		Node a = new Node();
		a.data = value;
		a.next = null;
		return a;
	}

	public void push(int value) {
		if (front == null) {
			front = getNode(value);
			return;
		}
		Node a = getNode(value);
		a.next = front;
		front = a;
	}

	public int pop() {
		if (front == null) {
			System.out.println("stack is emepty.");
			return Integer.MIN_VALUE;
		}
		int t = front.data;
		front = front.next;
		return t;
	}

	public int top() {
		if (front == null) {
			System.out.println("stack is emepty.");
			return Integer.MIN_VALUE;
		}
		return front.data;
	}

	public static void main(String[] args) {

		StackImplUsing_linkedList a = new StackImplUsing_linkedList();
		a.push(12);
		a.push(5);
		a.push(34);
		a.push(42);
		a.push(91);
		a.push(9);

		System.out.println(a.pop());
		a.push(39);

		System.out.println("Top:" + a.top());

		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());
		System.out.println(a.pop());

	}

}
