package com.datastructres.matrix;

public class FindAnElementFromMatrixRowsAndcolunsOrSorted {

	public static void findAnElementfrommatrix(int mat[][], int val) {

		if (mat.length == 0) {
			return;
		}

		int totalrows = mat.length;
		int totalcolums = mat[0].length;

		int row = 0;
		int column = totalcolums - 1;

		while (row < totalrows && column >= 0) {
			if (mat[row][column] == val) {
				System.out.println("[" + row + "," + column + "]");
				return;
			}
			if (val > mat[row][column]) {
				row++;
			} else {
				column--;
			}
		}
		System.out.println("no such value prasent in matrix.");

	}

	public static void main(String[] args) {

		int inputMatrix[][] = { { 2, 7, 15 }, { 4, 9, 19 }, { 6, 10, 24 } };

		FindAnElementFromMatrixRowsAndcolunsOrSorted.findAnElementfrommatrix(inputMatrix, 5);

	}

}
