package com.datastructures.queue;

import java.util.Stack;

class QueueImpl {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();

	public void enqueue(int value) {
		s1.push(value);
	}

	public int dequeue() {

		if (!s2.empty()) {
			return s2.pop();
		}
		if (s1.empty()) {
			return -1;
		}
		while (!s1.empty()) {
			s2.push(s1.pop());
		}
		return s2.pop();
	}
}

public class QueueImplementionUsing_Stack {

	public static void main(String[] args) {
		
		QueueImpl a = new QueueImpl();
	    
	    a.enqueue(7);
	    a.enqueue(3);
	    a.enqueue(4);
	    
	    System.out.println(a.dequeue());
	    System.out.println(a.dequeue());
	    
	    a.enqueue(5);
	    
	    System.out.println(a.dequeue());
	    System.out.println(a.dequeue());
	    System.out.println(a.dequeue());

	}

}
