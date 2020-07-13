package com.datastructres.graps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BFSGraphDirected {
	List<List<Integer>> graph;
	boolean visited[];

	BFSGraphDirected(int nodes) {
		visited = new boolean[nodes];
		graph = new ArrayList<>();
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
	}

	public void bfs_directed(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		while (!queue.isEmpty()) {
			int node = queue.poll();
			System.out.print(node + " ");
			List<Integer> neighbourList = graph.get(node);
			for (int neighbour : neighbourList) {
				if (!visited[neighbour]) {
					queue.add(neighbour);
					visited[neighbour] = true;
				}
			}
		}
	}
}

public class BFSGraphUsingAdjcencyList_directed {

	public static void main(String[] args) {
		int nodes = 6;
		BFSGraphDirected a = new BFSGraphDirected(nodes);
		a.addEdge(0, 1);
		a.addEdge(0, 2);
		a.addEdge(0, 3);
		a.addEdge(1, 4);
		a.addEdge(2, 4);
		a.addEdge(2, 5);
		a.addEdge(4, 5);

		a.bfs_directed(0);
	}

}
