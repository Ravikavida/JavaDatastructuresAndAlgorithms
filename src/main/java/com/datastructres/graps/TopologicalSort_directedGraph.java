package com.datastructres.graps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class TopologicalGraph {
	List<List<Integer>> graph;
	Map<Integer, Integer> incomingDegree;
	Queue<Integer> sourceQueue;
	int nodes;

	TopologicalGraph(int nodes) {
		this.nodes = nodes;
		incomingDegree = new HashMap<>();
		sourceQueue = new LinkedList<>();
		graph = new ArrayList<>();
		for (int i = 0; i < nodes; i++) {
			graph.add(i, new ArrayList<>());
			incomingDegree.put(i, 0);
		}
	}

	public void addEdge(int a, int b) {
		graph.get(a).add(b);
		incomingDegree.put(b, incomingDegree.get(b) + 1);
	}

	 public List<Integer> topologicalSort() {

		    for(Map.Entry<Integer, Integer> entry: incomingDegree.entrySet()) {
		      if(entry.getValue() == 0) {
		        sourceQueue.add(entry.getKey());
		      }
		    }
		    
		    List<Integer> result = new ArrayList<>();
		    
		    while(!sourceQueue.isEmpty()) {
		      int source = sourceQueue.remove();
		      result.add(source);
		      
		      List<Integer> childrenList = graph.get(source);
		      
		      for(Integer child: childrenList) {
		        incomingDegree.put(child, incomingDegree.get(child) - 1);
		        
		        if(incomingDegree.get(child) == 0) {
		          sourceQueue.add(child);
		        }
		      }
		    }
		    
		    if(result.size() != nodes) {
		      System.out.println("Cycle is there in graph");
		      return new ArrayList<>();
		    }
		    
		    return result;
		  }
}

public class TopologicalSort_directedGraph {

	public static void main(String[] args) {

		int nodes = 6;

		TopologicalGraph a = new TopologicalGraph(nodes);

		a.addEdge(0, 1);
		a.addEdge(0, 2);
		a.addEdge(1, 3);
		a.addEdge(1, 4);
		a.addEdge(2, 4);
		a.addEdge(3, 5);
		a.addEdge(4, 5);

		System.out.println(a.topologicalSort());

	}

}
