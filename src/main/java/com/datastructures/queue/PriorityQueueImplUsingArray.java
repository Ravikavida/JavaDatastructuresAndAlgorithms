package com.datastructures.queue;

class PriorityQueueApp {
	int MAX;
	int arr[];
	int nItems;

	PriorityQueueApp() {
		MAX = 10;
		arr = new int[MAX];
		nItems = 0;
	}

	public void insert(int value) {
		int i;
		if (nItems == 0) {
			arr[0] = value;
			nItems++;
			return;
		}
		for (i = nItems - 1; i >= 0; i--) {
			if (value > arr[i]) {
				arr[i + 1] = arr[i];
			} else {
				break;
			}
		}
		arr[i + 1] = value;
		nItems++;

	}

	public void printValues() {
		for (int i = 0; i < nItems; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");
	}

	public int remove() {
		return arr[--nItems];
	}

	public boolean isFull() {
		return nItems == MAX;
	}
	public boolean isEmpty() {
		return nItems ==0;
	}
	
	public int getPeek() {
		return arr[nItems-1];
	}

}

public class PriorityQueueImplUsingArray {

	public static void main(String[] args) {
		PriorityQueueApp app = new PriorityQueueApp();
		app.insert(12);
		app.insert(2);
		app.insert(7);
		app.insert(8);
		app.insert(10);
		app.printValues();
		System.out.println(app.remove());
		app.printValues();
	}

}
