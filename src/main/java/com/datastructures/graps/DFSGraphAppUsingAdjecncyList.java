package com.datastructures.graps;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class GraphAdjecncyList {
	List<List<Integer>> graph;
	boolean visited[];

	GraphAdjecncyList(int nodes) {
		graph = new ArrayList<>();
		visited = new boolean[nodes];
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
		graph.get(b).add(a);

	}

	public void dfs(int start) {
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		visited[start] = true;
		while (!stack.isEmpty()) {
			Integer node = stack.pop();
			System.out.print(node+" ");
			List<Integer> neighbourList = graph.get(node);
			for (int neighbour : neighbourList) {
				if (!visited[neighbour]) {
					stack.push(neighbour);
					visited[neighbour] = true;
				}
			}
		}
	}
}

public class DFSGraphAppUsingAdjecncyList {

	public static void main(String[] args) {
		int nodes =7;
		GraphAdjecncyList list = new GraphAdjecncyList(nodes);
		
		list.addEdge(0, 1);
	    list.addEdge(0, 2);
	    list.addEdge(1, 3);
	    list.addEdge(2, 4);
	    list.addEdge(3, 5);
	    list.addEdge(4, 5);
	    list.addEdge(4, 6);
		list.dfs(0);

	}

}
