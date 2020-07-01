package com.datastructres.matrix;

public class FindAllElemntsWhichorLessThanorEqualTogivenNumberfromMatrix {

	public static int findThecountofValuesWhichareLessthangivenValue(int[][] mat, int val) {
		if (mat.length == 0) {
			return 0;
		}
		int count = 0;

		int totalrows = mat.length;
		int totalcoumns = mat[0].length;

		int row = 0;
		int column = totalcoumns - 1;

		while (row < totalrows && column >= 0) {
			if (val >= mat[row][column]) {
				count = count + column + 1;
				row++;
			} else {
				column--;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		int inputMatrix[][] = { { 2, 7, 15 }, { 4, 9, 19 }, { 6, 10, 24 } };

		int result = FindAllElemntsWhichorLessThanorEqualTogivenNumberfromMatrix
				.findThecountofValuesWhichareLessthangivenValue(inputMatrix, 8);
		System.out.println(result);
	}

}
