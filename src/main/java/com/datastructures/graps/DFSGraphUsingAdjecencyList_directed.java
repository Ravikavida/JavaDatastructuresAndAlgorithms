package com.datastructures.graps;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class GraphDirected {
	List<List<Integer>> graph;
	boolean visted[];

	GraphDirected(int nodes) {
		graph = new ArrayList<>();
		visted = new boolean[nodes];

		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
	}

	public void dfs_directed(int start) {

		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		visted[start] = true;
		while (!stack.isEmpty()) {
			int node = stack.pop();
			System.out.print(node + " ");
			List<Integer> neighbourList = graph.get(node);
			for (int neighbour : neighbourList) {
				if (!visted[neighbour]) {
					stack.push(neighbour);
					visted[neighbour] = true;
				}
			}
		}
	}
}

public class DFSGraphUsingAdjecencyList_directed {

	public static void main(String[] args) {
		int nodes =7;
		GraphDirected list = new GraphDirected(nodes);
		
		list.addEdge(0, 1);
	    list.addEdge(0, 2);
	    list.addEdge(1, 3);
	    list.addEdge(2, 4);
	    list.addEdge(3, 5);
	    list.addEdge(4, 5);
	    list.addEdge(4, 6);
		list.dfs_directed(0);

	}

}
