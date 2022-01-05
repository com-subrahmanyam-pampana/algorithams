package ds.graphs.data;

import ds.graphs.models.AdjacencyListGraph;
import ds.graphs.models.AdjacencyMatrixGraph;

public class SampleGraphs {
	
	public static  AdjacencyMatrixGraph getAnAdjacencyMatrixGraph1() {
		AdjacencyMatrixGraph g = new AdjacencyMatrixGraph(4);
	    g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	    g.addEdge(2, 3);
	    return g;
	    
	}
	public static  AdjacencyListGraph getAnAdjacencyListGraph1() {
		AdjacencyListGraph g = new AdjacencyListGraph(4);
		    // Add edges
		    g.addEdge(0, 1);
		    g.addEdge(0, 2);
		    g.addEdge(0, 3);
		    g.addEdge(1, 2);
	    return g;
	    
	}
	
	
	public static void main(String[] args) {
		AdjacencyMatrixGraph g =getAnAdjacencyMatrixGraph1();
		//System.out.print(g.toString());
		AdjacencyListGraph g2=getAnAdjacencyListGraph1();
		g2.printGraph();
	}

}
