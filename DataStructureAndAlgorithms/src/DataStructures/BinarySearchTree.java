package DataStructures;


public class BinarySearchTree {
	
	public static void insert(Node node, int data){
				
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
	

	public static void main(String[] args){
		
		Node root = new Node(8);
		insert(root, 4);
		insert(root, 10);
		insert(root, 2);
		insert(root, 6);
		insert(root, 20);
		
		BinaryTreeTraversal traversal = new BinaryTreeTraversal();
		System.out.println("In Order Traversal >");
		traversal.inOrderTraversal(root);
		System.out.println("Pre Order Traversal >");
		traversal.preOrderTraversal(root);
		System.out.println("Post Order Traversal");
		traversal.postOrderTraversal(root);
	
	}
}
