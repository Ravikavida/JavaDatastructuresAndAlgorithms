package com.datastructres.graps;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class CheckingSouceAndDestinationConnected {

	List<List<Integer>> graph;
	boolean visited[];
	int nodes;

	CheckingSouceAndDestinationConnected(int nodes) {
		this.nodes = nodes;
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

	public boolean ifSourceConnectedToDestination(int source, int destination) {

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

}

public class CheckingSourceToDestination_Reachable_undirectedGraph {

	public static void main(String[] args) {
		int nodes = 7;

		CheckingSouceAndDestinationConnected a = new CheckingSouceAndDestinationConnected(nodes);

		a.addEdge(0, 1);
		a.addEdge(0, 2);
		a.addEdge(1, 3);
		a.addEdge(4, 5);
		a.addEdge(4, 6);

		System.out.println(a.ifSourceConnectedToDestination(0, 5));

	}

}
