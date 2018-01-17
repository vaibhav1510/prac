package Practice.graphs.traversal;

public class TestMain {
	// Driver program to test above functions
	public static void main(String args[]) {
		// create the graph given in above figure
		int V = 5;
		Graph g = new Graph(V);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(1, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);

		// print the adjacency list representation of
		// the above graph
		g.printGraph();
	}

}
