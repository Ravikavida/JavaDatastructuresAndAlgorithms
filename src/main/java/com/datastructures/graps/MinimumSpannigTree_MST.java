package com.datastructures.graps;

import java.util.Stack;

class Vertices {
	public char label;
	public boolean wasvisted;

	Vertices(char lab) {
		label = lab;
		wasvisted = false;
	}
}

class MSTGraph {
	public final int MAX_VERT = 20;
	public int edgMat[][];
	public int nvertices;
	public Stack<Integer> stack;
	public Vertices verticesList[];

	public MSTGraph() {
		edgMat = new int[MAX_VERT][MAX_VERT];
		nvertices = 0;
		stack = new Stack<>();
		verticesList = new Vertices[MAX_VERT];
	}

	public void addVertex(char lab) {
		verticesList[nvertices++] = new Vertices(lab);
	}

	public void addEdge(int start, int end) {
		edgMat[start][end] = 1;
		edgMat[end][start] = 1;
	}

	public void displayVert(int v) {
		System.out.print(verticesList[v].label);
	}

	public int getUnvistedAdjEdg(int v) {
		for (int i = 0; i < nvertices; i++) {
			if (edgMat[v][i] == 1 && verticesList[i].wasvisted == false) {
				return i;
			}
		}
		return -1;
	}

	public void mst() {
		verticesList[0].wasvisted = true;
		stack.push(0);
		while (!stack.isEmpty()) {
			int current = stack.peek();
			int v = getUnvistedAdjEdg(current);
			if (v == -1) {
				stack.pop();
			} else {
				verticesList[v].wasvisted = true;
				displayVert(current);
				displayVert(v);
				System.out.print(" ");
				stack.push(v);
			}
		}
	}
}

public class MinimumSpannigTree_MST {

	public static void main(String[] args) {

		MSTGraph a = new MSTGraph();
	    a.addVertex('A');
	    a.addVertex('B');
	    a.addVertex('C');
	    a.addVertex('D');
	    a.addVertex('E');
	    
	    a.addEdge(0, 1); 
	    a.addEdge(0, 2); 
	    a.addEdge(0, 3); 
	    a.addEdge(0, 4); 
	    a.addEdge(1, 2); 
	    a.addEdge(1, 3); 
	    a.addEdge(1, 4); 
	    a.addEdge(2, 3); 
	    a.addEdge(2, 4); 
	    a.addEdge(3, 4); 
	    
	    System.out.println("MST: ");
	    a.mst();
	}

}

