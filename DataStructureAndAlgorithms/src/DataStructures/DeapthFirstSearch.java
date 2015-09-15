package DataStructures;

public class DeapthFirstSearch {

	public void search(GraphNode root){
		if ( root == null ) return;
		visit(root);
		root.visited = true;
		
		for(int i = 0; i < root.E; i++){
			if( root.adj[i].visited == false ){
				search(root.adj[i]);
			}
		}
	}
	
	private void visit(GraphNode node){
		System.out.println(node.name);
	}
}
