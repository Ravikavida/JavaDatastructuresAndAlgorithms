package com.datastructures.matrix;

public class FindingIsLands {

	int row = 5;
	int column = 5;

	int count = 0;
	boolean visted[][] = new boolean[row][column];

	public int countIslands(int mat[][]) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (mat[i][j] == 1 && !visted[i][j]) {
					dfs(mat, i, j, visted);
					count++;
				}
			}
		}
		return count;
	}

	private void dfs(int mat[][], int x, int y, boolean visited[][]) {
		visited[x][y] = true;

		if (isSafe(mat, x - 1, y - 1, visted)) {
			dfs(mat, x - 1, y - 1, visted);
		}

		if (isSafe(mat, x, y - 1, visted)) {
			dfs(mat, x, y - 1, visted);
		}
		if (isSafe(mat, x, y + 1, visted)) {
			dfs(mat, x, y + 1, visted);
		}
		if (isSafe(mat, x + 1, y - 1, visted)) {
			dfs(mat, x + 1, y - 1, visted);
		}

		if (isSafe(mat, x + 1, y + 1, visted)) {
			dfs(mat, x + 1, y + 1, visted);
		}
		if (isSafe(mat, x + 1, y, visted)) {
			dfs(mat, x + 1, y, visted);
		}

		if (isSafe(mat, x - 1, y + 1, visted)) {
			dfs(mat, x - 1, y + 1, visted);
		}

		if (isSafe(mat, x, y, visted)) {
			dfs(mat, x, y, visted);
		}

	}

	private boolean isSafe(int mat[][], int x, int y, boolean visited[][]) {

		return x >= 0 && x < row && y >= 0 && y < column && mat[x][y] == 1 && !visted[x][y];

	}

	public static void main(String[] args) {
		FindingIsLands lands = new FindingIsLands();
		int mat[][] = { { 0, 1, 0, 0, 1 }, { 1, 1, 0, 0, 0 }, { 1, 0, 0, 1, 1 }, { 0, 0, 0, 0, 0 }, { 1, 0, 1, 0, 1 } };
		int landCount = lands.countIslands(mat);

		System.out.println(landCount);

	}

}
