package com.datastructres.graps;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class checkMinDistancefromSourcetoDestination {
	List<List<Integer>> graph;
	boolean visited[];

	checkMinDistancefromSourcetoDestination(int nodes) {
		graph = new ArrayList<>();
		visited = new boolean[nodes];
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
		}
	}

	// for directed graph comment any of one from below two conditions
	public void addEdge(int a, int b) {
		graph.get(b).add(a);
		graph.get(a).add(b);
	}

	public int findminDistance(int source, int destination) {
		if (source == destination) {
			return 0;
		}
		Queue<Integer> queue = new LinkedList<>();
		int mindistance = 0;
		queue.add(source);
		visited[source] = true;
		while (!queue.isEmpty()) {
			int size = queue.size();
			while (size > 0) {
				int node = queue.poll();
				List<Integer> childList = graph.get(node);
				for (int child : childList) {
					if (source == child) {
						return ++mindistance;
					}
					if (!visited[child]) {
						queue.add(child);
						visited[child] = true;
					}
				}
				size--;
			}
			mindistance++;
		}

		return -1;
	}
}

public class CheckingMinimumDistanceFromSource_distance_unWeighted {
	public static void main(String[] args) {
		
		  int nodes = 6;
		    
		  checkMinDistancefromSourcetoDestination a = new checkMinDistancefromSourcetoDestination(nodes);
		    
		    a.addEdge(0, 1);
		    a.addEdge(0, 3);
		    a.addEdge(1, 2);
		    a.addEdge(3, 4);
		    a.addEdge(2, 4);
		    a.addEdge(4, 5);
		    
		    System.out.println(a.findminDistance(0, 5));

	}
}
