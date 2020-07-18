package com.datastructures.arrays;

public class InsetElementAtStartinPostionInArray {

	public static void insertAtStart(int arr[], int value) {
		
			
		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = value;
	}

	
	public static  void insertAt(int arr[],int postion,int value) {
		
		for(int i= arr.length-1;i>postion;i--) {
			arr[i] = arr[i-1];
		}
		arr[postion] = value;
		
	}
	public static void main(String[] args) {

		int arr[] ={ 1, 2, 3, 4, 5 };
		
			insertAtStart(arr, 30);
			insertAt(arr,3,40);

		for (int k : arr) {
			System.out.println(k);
		}

	}

}
