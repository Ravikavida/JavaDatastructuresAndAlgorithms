package com.datastructures.graps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Edge_mst {
	int targetNode;
	int distanceFromNode;

	Edge_mst(int targetNode, int distanceFromNode) {

		this.targetNode = targetNode;
		this.distanceFromNode = distanceFromNode;

	}
}

class Mst_MinDistance {
	List<List<Edge_mst>> graph;
	boolean visited[];
	int nodes;

	Mst_MinDistance(int nodes) {
		this.nodes = nodes;
		visited = new boolean[nodes];
		graph = new ArrayList<>();
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	public void addEdge(int sourceNode, int targetNode, int distance) {
		graph.get(sourceNode).add(new Edge_mst(targetNode, distance));
		graph.get(targetNode).add(new Edge_mst(sourceNode, distance));
	}

	public int mst() {
		int mincost = 0;
		for (int i = 0; i < nodes; i++) {
			mincost = mincost + mstToCoverAllNodesWithMinDistance(i);
		}
		return mincost;
	}

	public int mstToCoverAllNodesWithMinDistance(int source) {

		PriorityQueue<Edge_mst> minHeap = new PriorityQueue<>((e1, e2) -> e1.distanceFromNode - e2.distanceFromNode);

		visited[source] = true;
		List<Edge_mst> childOfSource = graph.get(source);
		for (Edge_mst child : childOfSource) {
			minHeap.add(child);
		}
		int minimumcost = 0;
		while (!minHeap.isEmpty()) {
			Edge_mst minValueEdge = minHeap.poll();

			if (visited[minValueEdge.targetNode]) {
				continue;
			}
			visited[minValueEdge.targetNode] = true;
			minimumcost = minimumcost + minValueEdge.distanceFromNode;
			List<Edge_mst> childList = graph.get(minValueEdge.targetNode);
			for (Edge_mst edge : childList) {
				if (!visited[edge.targetNode]) {
					minHeap.add(edge);
				}

			}
		}
		return minimumcost;
	}

}

public class PrimsAlgorithm_MST_weightedGraph_minDistancetoCover_allNodes {

	public static void main(String[] args) {
		
		 int nodes = 5;

		 Mst_MinDistance a = new Mst_MinDistance(nodes);

		    a.addEdge(0, 1, 6); 
		    a.addEdge(0, 3, 4); 
		    a.addEdge(1, 2, 10);
		    a.addEdge(1, 3, 7);
		    a.addEdge(1, 4, 7);
		    a.addEdge(2, 3, 8);
		    a.addEdge(2, 4, 5);
		    a.addEdge(3, 4, 12);
		    
		    System.out.println(a.mst());

	}

}
