package com.datastructures.arrays;

public class SquareTheArrayelemntsAndSort_2way {
	public static void sortArry(int arr[]) {

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
				i = -1;
			}
		}
	}
	public static int[] squareArray(int arr[]) {
		int start = 0;
		int end = arr.length - 1;
		int i = arr.length - 1;
		int result[]= new int[arr.length];

		while (start <= end) {
			if(arr[start]*arr[start] > arr[end]*arr[end]) {
				result[i--] = arr[start]  * arr[start];
				start++;
			}else {
				result[i--] = arr[end]*arr[end];
				end--;
			}
		}
		return result;
	}

	public static void main(String[] args) {
	int arr[]=	SquareTheArrayelemntsAndSort_2way.squareArray(new int[] {-1,-5,-3,2,4});
		sortArry(arr);
		for(int k:arr) {
			System.out.println(k);
		}
	}

}
