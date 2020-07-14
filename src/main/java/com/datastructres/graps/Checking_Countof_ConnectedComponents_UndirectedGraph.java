package com.datastructres.graps;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class checkingConnectedComonents {
	List<List<Integer>> graph;
	boolean visited[];
	int nodes;

	checkingConnectedComonents(int nodes) {
		this.nodes = nodes;
		visited = new boolean[nodes];
		graph = new ArrayList<>();
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
			int node = stack.pop();
			List<Integer> neighbourNodes = graph.get(node);
			for (int neighbour : neighbourNodes) {
				if (!visited[neighbour]) {
					stack.push(neighbour);
					visited[neighbour] = true;
				}
			}
		}
	}

	public int checkConnectedcomponents() {
		int count = 0;
		for (int i = 0; i < nodes; i++) {
			if (!visited[i]) {
				dfs(i);
				count++;
			}
		}
		return count;
	}

}

public class Checking_Countof_ConnectedComponents_UndirectedGraph {

	public static void main(String[] args) {

		int nodes = 10;
		checkingConnectedComonents a = new checkingConnectedComonents(nodes);
		
			a.addEdge(0, 1);
		    a.addEdge(0, 2);
		    a.addEdge(1, 3);
		    a.addEdge(5, 4);
		    a.addEdge(5, 6);
		    a.addEdge(7, 9);
		    a.addEdge(7, 8);
		    
		System.out.println(a.checkConnectedcomponents());
	}

}
