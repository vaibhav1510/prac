package Practice.graphs.traversal;

import java.util.LinkedList;

public class Graph {

	int V;
	LinkedList<Integer> adjListArray[];

	// constructor
	Graph(int V) {
		this.V = V;

		// define the size of array as
		// number of vertices
		adjListArray = new LinkedList[V];

		// Create a new list for each vertex
		// such that adjacent nodes can be stored
		for (int i = 0; i < V; i++) {
			adjListArray[i] = new LinkedList<>();
		}
	}

	public void addEdge(int src, int dest) {
		// Add an edge from src to dest.
		adjListArray[src].addFirst(dest);

		// Since graph is undirected, add an edge from dest
		// to src also
		adjListArray[dest].addFirst(src);
	}

	public void printGraph() {
		for (int v = 0; v < V; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer pCrawl : adjListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}

}
