package com.datastructres.graps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

class checkingAllNodesConnected {
	List<List<Integer>> graph;
	boolean visited[];
	int nodes;

	checkingAllNodesConnected(int nodes) {
		this.nodes = nodes;
		visited = new boolean[nodes];
		graph = new ArrayList<>();
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
	}

	public void dfs(int start) {
		Stack<Integer> stack = new Stack<Integer>();
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

	public boolean isStronglyConnecte() {
		for (int i = 0; i < nodes; i++) {
			dfs(i);
			for (int j = 0; j < nodes; j++) {
				if (!visited[j]) {
					return false;
				}
			}
			Arrays.fill(visited, false);
		}
		return true;
	}
}

public class CheckingDirectedGraphStronglyConnected_DFS {

	public static void main(String[] args) {

		int nodes = 4;

		checkingAllNodesConnected a = new checkingAllNodesConnected(nodes);

		a.addEdge(0, 1);
		a.addEdge(1, 2);
		a.addEdge(2, 0);
		a.addEdge(0, 3);
		a.addEdge(3, 2);

		System.out.println(a.isStronglyConnecte());

	}

}
