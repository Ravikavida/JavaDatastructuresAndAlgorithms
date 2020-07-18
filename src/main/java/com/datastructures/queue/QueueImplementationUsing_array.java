package com.datastructures.queue;

class QueueImpl_Array {
	int MAX = 5;
	int front = 0;
	int rear = -1;
	int a[] = new int[MAX];
	int size = 0;

	public boolean isFull() {
		if (size == MAX) {
			return true;
		} else {
			return false;
		}
	}

	public int getsize() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void enque(int value) {

		if (isFull()) {
			System.out.println("queue is full.");
			return;
		}
		rear = (rear + 1) % MAX;
		size++;
		a[rear] = value;
	}

	public int deque() {
		if (isEmpty()) {
			System.out.println("queue is empty.");
			return Integer.MIN_VALUE;
		}
		front = front % MAX;
		size--;
		return a[front++];
	}

	public int getFront() {
		if (isEmpty()) {
			System.out.println("queue is empty.");
			return Integer.MIN_VALUE;
		}
		return a[front];
	}

	public int getRear() {
		if (isEmpty()) {
			System.out.println("queue is empty.");
			return Integer.MIN_VALUE;
		}
		return a[rear];
	}

}

public class QueueImplementationUsing_array {

	public static void main(String[] args) {

		QueueImpl_Array a = new QueueImpl_Array();

		a.enque(12);
		a.enque(2);
		a.enque(7);
		a.enque(27);
		a.enque(18);
		a.enque(80);

		System.out.println("Size: " + a.getsize());
		System.out.println("Front: " + a.getFront());
		System.out.println("Rear: " + a.getRear());

		System.out.println("Removed Element: " + a.deque());

		System.out.println("Size: " + a.getsize());
		System.out.println("Front: " + a.getFront());
		System.out.println("Rear: " + a.getRear());
		a.enque(80);
	}

}
