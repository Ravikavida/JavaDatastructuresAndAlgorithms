package com.datastructres.graps;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class CheckAllNodesconnected {
	List<List<Integer>> graph;
	boolean visited[];
	int nodes;

	CheckAllNodesconnected(int nodes) {
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

	public void dfs(int start) {
		Stack<Integer> stack = new Stack<>();
		stack.push(start);
		visited[start] = true;
		while (!stack.isEmpty()) {
			Integer node = stack.pop();
			List<Integer> neighbourNodes = graph.get(node);
			for (Integer neighbour : neighbourNodes) {
				if (!visited[neighbour]) {
					stack.push(neighbour);
					visited[neighbour] = true;
				}

			}

		}

	}

	public boolean isConnected() {
		int startIndex = 0;
		dfs(startIndex);
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				return false;
			}
		}
		return true;
	}

}

public class CheckAllNodesorConnectedinUndirctedGraph_dfs {

	public static void main(String[] args) {

		  int nodes = 7;
		    
		  CheckAllNodesconnected a = new CheckAllNodesconnected(nodes);
		    
		    a.addEdge(0, 1);
		    a.addEdge(0, 2);
		    a.addEdge(1, 3);
		    a.addEdge(2, 4);
		    a.addEdge(3, 5);
		    a.addEdge(4, 5);
		    //a.addEdge(4, 6); here we r not connecting 6th node -false, if uncommented will give true since all connected.
		    System.out.println(a.isConnected());
	}

}
