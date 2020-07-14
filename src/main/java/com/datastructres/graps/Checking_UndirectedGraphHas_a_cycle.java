package com.datastructres.graps;

import java.util.ArrayList;
import java.util.List;

class CheckingGraphHasCycle {
	List<List<Integer>> graph;
	boolean visited[];
	int nodes;

	CheckingGraphHasCycle(int nodes) {
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

	public boolean ifCycle(int index, int parent) {
		visited[index] = true;
		List<Integer> neighbourList = graph.get(index);

		for (int neighbour : neighbourList) {
			if (!visited[neighbour]) {
				ifCycle(neighbour, index);
			} else if (neighbour != parent) {
				return true;
			}
		}

		return false;
	}

	public boolean ifUnDirctedGraphHascycle() {
		for (int i = 0; i < nodes; i++) {
			if (!visited[i]) {
				if (ifCycle(i, -1)) {
					return true;
				}
			}
		}
		return false;
	}
}

public class Checking_UndirectedGraphHas_a_cycle {

	public static void main(String[] args) {
		
		 int nodes = 3;
		    
		 CheckingGraphHasCycle a = new CheckingGraphHasCycle(nodes);
		    
		    a.addEdge(0, 1);
		    a.addEdge(1, 2);
		    a.addEdge(2, 0);

		    System.out.println(a.ifUnDirctedGraphHascycle());

	}

}
