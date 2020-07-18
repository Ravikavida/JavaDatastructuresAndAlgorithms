package com.datastructures.queue;

class Node {
	int data;
	Node next;
}

class QueueOperations {
	Node first;
	Node last;
	int size;

	public Node getNewNode(int value) {
		Node a = new Node();
		a.data = value;
		a.next = null;
		return a;
	}

	public void enqueue(int value) {
		if (last == null) {
			first = last = getNewNode(value);
			size++;
			return;
		}
		size++;
		last.next = getNewNode(value);
		last = last.next;
	}

	public boolean isEmpty() {
		return last == null ? true : false;
	}

	public int size() {
		return size;
	}

	public int remove() {
		if (isEmpty()) {
			System.out.println("queue is empty, nothing to remove.");
			return Integer.MIN_VALUE;
		}
		size--;
		int temp = first.data;
		first = first.next;
		if (first == null) {
			last = null;
		}
		return temp;
	}

	public int getFront() {
		if (isEmpty()) {
			System.out.println("queue is empty, nothing to remove.");
			return Integer.MIN_VALUE;
		}
		return first.data;
	}
	
	public int getRear() {
		if (isEmpty()) {
			System.out.println("queue is empty, nothing to remove.");
			return Integer.MIN_VALUE;
		}
		return last.data;
	}

}

public class QueueImplementationUsingLinkedList {

	public static void main(String[] args) {
		QueueOperations operations = new QueueOperations();
		operations.enqueue(12);
		operations.enqueue(2);
		operations.enqueue(5);
		operations.enqueue(27);
		operations.enqueue(18);
		operations.enqueue(80);
		
		System.out.println("size :"+ operations.size());
		System.out.println("first Element :"+ operations.getFront());
		System.out.println("last Element :"+ operations.getRear());
		
		System.out.println("Removed Element: " + operations.remove());
		
		System.out.println("size :"+ operations.size());
		System.out.println("first Element :"+ operations.getFront());
		System.out.println("last Element :"+ operations.getRear());
	}

}
