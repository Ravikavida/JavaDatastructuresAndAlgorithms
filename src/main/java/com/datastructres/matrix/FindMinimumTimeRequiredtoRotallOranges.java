package com.datastructres.matrix;

import java.util.LinkedList;
import java.util.Queue;

class Coordinate {
	int x;
	int y;

	public Coordinate(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class FindMinimumTimeRequiredtoRotallOranges {

	int row = 4;
	int column = 5;

	Queue<Coordinate> q = new LinkedList<>();

	public int timeToRoteoranges(int[][] mat) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				if (mat[i][j] == 2) {
					q.add(new Coordinate(i, j));
				}
			}
		}
		q.add(new Coordinate(-1, -1));

		int count = 0;
		boolean flag = false;
		while (!q.isEmpty()) {
			while (!ifPeekDelimeter(q.peek())) {
				Coordinate element = q.remove();
				if(isFreshorange(mat, element.x-1, element.y)) {
					mat[element.x-1][element.y] = 2;
					q.add(new Coordinate(element.x-1, element.y));
					if(!flag) {
						flag = true;
						count++;
					}
				}
				
				if(isFreshorange(mat, element.x+1, element.y)) {
					mat[element.x+1][element.y] = 2;
					q.add(new Coordinate(element.x+1, element.y));
					if(!flag) {
						flag = true;
						count++;
					}
				}

				if(isFreshorange(mat, element.x, element.y-1)) {
					mat[element.x][element.y-1] = 2;
					q.add(new Coordinate(element.x, element.y-1));
					if(!flag) {
						flag = true;
						count++;
					}
				}
				
				if(isFreshorange(mat, element.x, element.y+1)) {
					mat[element.x][element.y+1] = 2;
					q.add(new Coordinate(element.x, element.y+1));
					if(!flag) {
						flag = true;
						count++;
					}
				}

			}
			q.remove();
			flag = false;
			if(!q.isEmpty()) {
				q.add(new Coordinate(-1, -1));
			}
		}

		return ifAnyFresHorange(mat)?-1:count;

	}

	private boolean ifPeekDelimeter(Coordinate c) {
		return c.x == -1 && c.y == -1;
	}

	private boolean isFreshorange(int[][] mat, int x, int y) {

		return x >= 0 && x < row && y >= 0 && y < column && mat[x][y] == 1;

	}

	public boolean ifAnyFresHorange(int mat[][]) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if (mat[i][j] == 1) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {
		
		FindMinimumTimeRequiredtoRotallOranges oranges = new FindMinimumTimeRequiredtoRotallOranges();
		
		int[][] mat = { 
		        { 0, 2, 0, 0, 2 },
		        { 0, 1, 0, 1, 1 },
		        { 0, 1, 0, 1, 2 },
		        { 2, 1, 0, 2, 0 }};
	int result = oranges.timeToRoteoranges(mat);
	
	System.out.println(result);

	}
	
	

}
