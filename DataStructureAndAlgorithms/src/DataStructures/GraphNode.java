package DataStructures;

public class GraphNode {
	public String name;
	public GraphNode[] adj;
	public int E;
	public boolean visited = false;

	public GraphNode(String name){
		this.name = name;
		this.E = 0;
	}
	
	public void addEdge(GraphNode node){
		if( adj == null ) adj = new GraphNode[10];
		
		adj[E] = node;
		E++;
		
		if( E == adj.length ){
			/*
			 * Double the size of Array
			 */
			GraphNode []newAdj = new GraphNode[E*2];
			for(int i = 0; i < newAdj.length; i++){
				newAdj[i] = adj[i];
			}
			adj = newAdj;
		}
	}
}
