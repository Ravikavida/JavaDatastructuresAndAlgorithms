package com.datastructres.heap;

public class MaxHeapImplementation {

	int size;
	int arr[] = new int[20];

	public void insertValue(int val) {
		arr[size] = val;
		int index = size;
		int parent = (index - 1) / 2;
		while (parent >= 0 && arr[parent] < arr[index]) {
			int t = arr[parent];
			arr[parent] = arr[index];
			arr[index] = t;

			t = parent;
			index = parent;
			parent = (t - 1) / 2;
		}
		size++;
	}

	public int getmax() {
		return arr[0];
	}

	public int removeElement() {
		int max = arr[0];
		arr[0] = arr[size - 1];
		size = size - 1;
		maxHeapify(0);
		return max;
	}

	private void maxHeapify(int index) {

		int l = 2 * index + 1;
		int r = 2 * index + 2;
		int largest = index;
		if (l < this.size && arr[l] > arr[largest]) {
			largest = l;
		}
		if (r < this.size && arr[r] > arr[largest]) {
			largest = r;
		}
		if (largest != index) {
			int t = arr[largest];
			arr[largest] = arr[index];
			arr[index] = t;
			maxHeapify(largest);
		}

	}

	public void buildMaxHeap(int arr[]) {
		this.arr = arr;
		this.size = arr.length;

		for (int i = size / 2 - 1; i >= 0; i--) {
			maxHeapify(i);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 34, 12, 3, 39, 2, 7, 5, 1 };
		MaxHeapImplementation a = new MaxHeapImplementation();
		a.insertValue(arr[0]);
		a.insertValue(arr[1]);
		a.insertValue(arr[2]);

		System.out.println(a.getmax());

		a.insertValue(arr[3]);
		a.insertValue(arr[4]);
		System.out.println(a.getmax());

		a.insertValue(arr[5]);
		System.out.println(a.getmax());

	}

}
