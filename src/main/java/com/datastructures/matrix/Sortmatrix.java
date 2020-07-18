package com.datastructures.matrix;

import java.util.Arrays;

//this will sort all elements not row wise and column
public class Sortmatrix {

	public static void sortMatrix(int mat[][]) {

		int result[] = new int[mat.length * mat.length];

		int index = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				result[index++] = mat[i][j];
			}
		}
		Arrays.sort(result);
		index = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = result[index++];
			}
		}
	}

	public static void printmatrix(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
				System.out.println();
			}
	}

	public static void main(String[] args) {

		int mat[][] = { { 5, 4, 7 }, { 1, 3, 8 }, { 2, 9, 6 } };

		sortMatrix(mat);
		printmatrix(mat);

	}
}
