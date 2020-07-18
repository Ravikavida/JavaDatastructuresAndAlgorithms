package com.datastructures.graps;

import java.util.LinkedList;
import java.util.Queue;

class Vertexbfs {
	public char label;
	public boolean wasVisted;

	public Vertexbfs(char lab) {
		label = lab;
		wasVisted = false;
	}
}

class Graphbfs {
	private final int MAX_VERTI = 20;
	private Vertexbfs vertexList[];
	private int nVertx;
	private int adjMat[][];
	private Queue<Integer> q;

	public Graphbfs() {
		vertexList = new Vertexbfs[MAX_VERTI];
		nVertx = 0;
		adjMat = new int[MAX_VERTI][MAX_VERTI];
		q = new LinkedList<>();
	}

	public void addVertex(char lab) {
		vertexList[nVertx++] = new Vertexbfs(lab);
	}

	public void addEdge(int start, int end) {
		adjMat[start][end] = 1;
		adjMat[end][start] = 1;

	}

	public void displayVertex(int v) {
		System.out.println(vertexList[v].label);
	}

	public int getUnvisitedVertex(int v) {
		for (int i = 0; i < nVertx; i++) {
			if (adjMat[i][v] == 1 && vertexList[i].wasVisted == false) {
				return i;
			}
		}
		return -1;
	}

	public void bfs() {
		vertexList[0].wasVisted = true;
		displayVertex(0);
		q.add(0);
		int v2;
		while (!q.isEmpty()) {
			int v1 = q.remove();
			while ((v2 = getUnvisitedVertex(v1)) != -1) {
				vertexList[v2].wasVisted = true;
				displayVertex(v2);
				q.add(v2);
			}
		}
	}
}

public class BFSGraphApp {

	public static void main(String[] args) {

		Graphbfs theGraph = new Graphbfs();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		theGraph.addVertex('F');

		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
		theGraph.addEdge(4, 5);
		theGraph.addEdge(1, 3);

		System.out.println("bfs Visits: ");
		theGraph.bfs();
		System.out.println();

	}

}
