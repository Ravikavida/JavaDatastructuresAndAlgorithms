package com.datastructres.matrix;

import java.util.Arrays;

public class SortmatrixColumWiseAndRowWise {

	public void sortByRow(int[][] mat) {
		for (int i = 0; i < mat.length; i++) {

			Arrays.sort(mat[i]);
		}
	}

	public void doTranspose(int mat[][]) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = i + 1; j < mat.length; j++) {

				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
	}

	public void sortMatrix(int[][] mat) {

		sortByRow(mat);
		doTranspose(mat);
		sortByRow(mat);
		doTranspose(mat);
	}

	public static void main(String[] args) {

		int[][] mat = { { 3, 6, 4, 2 }, { 1, 8, 7, 4 }, { 4, 3, 9, 1 }, { 5, 9, 6, 3 } };

		SortmatrixColumWiseAndRowWise wise = new SortmatrixColumWiseAndRowWise();

		wise.sortMatrix(mat);

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

	}

}
