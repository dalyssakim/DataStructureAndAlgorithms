package DataStructures;


public class BinarySearchTree {
	
	public void insert(Node node, int data){
				
		if( node == null ){
			node = new Node(data);
		} else if( node.data > data){
			if( node.left == null ){
				node.left = new Node(data);
			} else {
				insert(node.left, data);
			}
		} else {
			if( node.right == null ){
				node.right = new Node(data);
			} else {
				insert(node.right, data);
			}
		}
	}
	
}
