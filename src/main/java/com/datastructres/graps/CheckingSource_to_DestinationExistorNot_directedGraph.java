package com.datastructres.graps;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class SourceAndDestination {
	List<List<Integer>> graph;
	boolean visited[];
	int nodes;

	SourceAndDestination(int nodes) {
		this.nodes = nodes;
		graph = new ArrayList<>();
		visited = new boolean[nodes];
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
	}

	public boolean checkIsPathExist(int source, int destination) {
		dfs(source);
		return visited[destination];

	}

	public void dfs(int start) {
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		visited[start] = true;
		while (!stack.isEmpty()) {
			int node = stack.pop();
			List<Integer> neighbourList = graph.get(node);
			for (int neighbour : neighbourList) {
				if (!visited[neighbour]) {
					stack.push(neighbour);
					visited[neighbour] = true;
				}
			}
		}
	}

	// Dfs implementation another way;

	public void dfsAnother(int start) {
		visited[start] = true;
		List<Integer> neighbourList = graph.get(start);
		for (int neighbour : neighbourList) {
			if (!visited[neighbour]) {
				dfsAnother(neighbour);
			}
		}
	}

}

public class CheckingSource_to_DestinationExistorNot_directedGraph {

	public static void main(String[] args) {
		
		 int nodes = 5;
		    
		 SourceAndDestination a = new SourceAndDestination(nodes);
		    
		    a.addEdge(0, 1);
		    a.addEdge(1, 2);
		    a.addEdge(2, 0);
		    a.addEdge(3, 2);
		    a.addEdge(3, 0);
		    a.addEdge(2, 4);

		    System.out.println(a.checkIsPathExist(0, 3));
		    System.out.println(a.checkIsPathExist(0, 2));

	}

}
