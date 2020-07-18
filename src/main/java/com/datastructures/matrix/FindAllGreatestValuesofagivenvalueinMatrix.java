package com.datastructures.matrix;

public class FindAllGreatestValuesofagivenvalueinMatrix {

	public static int findAllGreatestElementsinMatrix(int mat[][], int val) {

		if (mat.length == 0) {
			return 0;
		}

		int totalrows = mat.length;
		int totalcolums = mat[0].length;
		int row = 0;
		int column = totalcolums - 1;
		int count = 0;
		while (row < totalrows && column >= 0) {
			if (val <= mat[row][column]) {
				count = count + totalrows - row;
				column--;
			} else {
				row++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int inputMatrix[][] = { { 2, 7, 15 }, { 4, 9, 19 }, { 6, 10, 24 } };

		int result = FindAllGreatestValuesofagivenvalueinMatrix.findAllGreatestElementsinMatrix(inputMatrix, 16);

		System.out.println(result);

	}

}
