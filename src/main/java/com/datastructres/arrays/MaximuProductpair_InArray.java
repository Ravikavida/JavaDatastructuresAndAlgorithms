package com.datastructres.arrays;

public class MaximuProductpair_InArray {

	// O(n2) complexity
	public static void maxProdutof_pair(int arr[]) {
		int a = arr[0];
		int b = arr[1];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if ((arr[i] * arr[j]) > (a * b)) {
					a = arr[i];
					b = arr[j];
				}
			}
		}
		System.out.println(a*b +" and numbers are: " +a + "," + b);
	}
	
	//O(n) complexity
	public static void maxPoductofPair(int arr[]) {
		
		int smallest = arr[0] <arr[1] ? arr[0]:arr[1];
		int secondsmallest = arr[0] >arr[1] ? arr[0]:arr[1];
		
		int greatest = arr[0] > arr[1] ? arr[0]:arr[1];
		int secondGreatest = arr[0] <arr[1] ? arr[0]:arr[1];
		
		for(int i =2 ;i<arr.length;i++) {
			if(arr[i] <smallest) {
				secondsmallest = smallest;
				smallest = arr[i];
			}else if(arr[i] < secondsmallest){
				secondsmallest = arr[i];
			}
			
			if(arr[i] >greatest) {
				secondGreatest = greatest;
				greatest = arr[i];
			}else if(arr[i] > secondGreatest){
				secondGreatest = arr[i];
			}
		}
		
		int firstProduct  = smallest*secondsmallest;
		int secondProduct = greatest * secondGreatest;
		if(firstProduct > secondProduct) {
			System.out.println(smallest+","+secondsmallest +"  :"+firstProduct);
		}else{
			System.out.println(greatest+","+secondGreatest +"  :"+secondProduct);
		}
				
		
	}

	public static void main(String[] args) {

		int arr[] = { 1, -4, 3, 6, 7, 0, -18 };

		//maxProdutof_pair(arr);
		maxPoductofPair(arr);

	}

}
