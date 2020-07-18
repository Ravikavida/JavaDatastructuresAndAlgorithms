package com.datastructures.graps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge {
	int targetNode;
	int distanceFromNode;

	Edge(int targetNode, int distanceFromNode) {
		this.targetNode = targetNode;
		this.distanceFromNode = distanceFromNode;
	}
}

class DijkstraAlgorithmImpl {
	List<List<Edge>> graph;
	boolean visited[];
	int distance[];

	DijkstraAlgorithmImpl(int nodes) {
		graph = new ArrayList<>();
		visited = new boolean[nodes];
		distance = new int[nodes];
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
			distance[i] = Integer.MAX_VALUE;
		}
	}

	// for undirected graph uncomment the line
	public void addEdge(int sourceNode, int targetNode, int distance) {
		graph.get(sourceNode).add(new Edge(targetNode, distance));
		// graph.get(targetNode).add(new Edge(source, distance));
	}

	public int findminDistance(int source, int destination) {
		if (source == destination) {
			return 0;
		}
		PriorityQueue<Edge> minHeap = new PriorityQueue<>((e1, e2) -> e1.distanceFromNode - e2.distanceFromNode);
		minHeap.add(new Edge(0, 0));
		distance[source] = 0;

		while (!minHeap.isEmpty()) {
			int v = minHeap.poll().targetNode;
			if(visited[v]) 
				continue;
			visited[v] = true;
			
			List<Edge> childList = graph.get(v);
			
			for(Edge child :childList) {
				int dist = child.distanceFromNode;
				int childNode = child.targetNode;
				if(!visited[childNode] && distance[v]+dist <distance[childNode]) {
					distance[childNode] = distance[v]+dist;
					child.distanceFromNode = distance[v]+dist;
					minHeap.add(child);
					
				}
			}
			
		}

		return distance[destination];
	}
}

public class DijkstraAlgorithm {

	public static void main(String[] args) {
		
		int nodes = 5;

		DijkstraAlgorithmImpl a = new DijkstraAlgorithmImpl(nodes);

	    a.addEdge(0, 1, 1);
	    a.addEdge(0, 2, 7);
	    a.addEdge(1, 2, 5);
	    a.addEdge(1, 4, 4);
	    a.addEdge(4, 3, 2);
	    a.addEdge(2, 3, 6);
	    System.out.println(a.findminDistance(0, 3));

	}

}
