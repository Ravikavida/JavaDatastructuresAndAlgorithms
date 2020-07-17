package com.datastructres.graps;

import java.util.ArrayList;
import java.util.List;

class CheckDirectedGraphHascycle {
	int nodes;
	boolean visted[], recursivStack[];
	List<List<Integer>> graph;

	CheckDirectedGraphHascycle(int nodes) {
		this.nodes = nodes;
		visted = new boolean[nodes];
		recursivStack = new boolean[nodes];
		graph = new ArrayList<>();
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
	}

	public boolean ifcycleExists(int index) {

		if (recursivStack[index]) {
			return true;
		}
		if (visted[index]) {
			return false;
		}
		visted[index] = true;
		recursivStack[index] = true;
		List<Integer> neighbourList = graph.get(index);
		for (int neighbour : neighbourList) {
			if (ifcycleExists(neighbour)) {
				return true;
			}
		}
		recursivStack[index] = false;
		return false;
	}

	public boolean inDirectGraphHasCycle() {
		for (int i = 0; i < nodes; i++) {
			if (ifcycleExists(i)) {
				return true;
			}
		}
		return false;
	}
}

public class Checking_DirectedGraphHas_a_cycle {

	public static void main(String[] args) {

		int nodes = 5;

		CheckDirectedGraphHascycle a = new CheckDirectedGraphHascycle(nodes);

		a.addEdge(0, 1);
		a.addEdge(1, 2);
		a.addEdge(2, 0);
		a.addEdge(0, 3);
		a.addEdge(3, 4);
		a.addEdge(4, 0);

		System.out.println(a.inDirectGraphHasCycle());

	}

}
