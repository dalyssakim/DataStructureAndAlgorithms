import DataStructures.GraphNode;


public class Question4_1 {

	
	public boolean findRouteBetweenNodes(GraphNode node1, GraphNode node2){
		if( node1 == null || node2 == null ) return false;
		node1.visited = true;
		
		for(int i = 0; i < node1.E; i++){

			if(node1.adj[i] == node2){
				System.out.println("Found!");
				return true;
			} else {
				if(node1.adj[i].visited == false){
				 if( findRouteBetweenNodes(node1.adj[i], node2) == true ) return true;
				}
			}
		}
		
		return false;
	}
}
