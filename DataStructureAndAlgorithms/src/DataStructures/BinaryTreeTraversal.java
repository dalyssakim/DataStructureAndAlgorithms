package DataStructures;

public class BinaryTreeTraversal {
	
	public void visit(Node node){
		System.out.println("Visit : "+ node.data);
	}

	public void inOrderTraversal(Node node){
		if( node != null ){
			inOrderTraversal(node.left);
			visit(node);
			inOrderTraversal(node.right);
		}
	}
	
	public void preOrderTraversal(Node node){
		if( node != null ){
			visit(node);
			preOrderTraversal(node.left);
			preOrderTraversal(node.right);
		}
	}
	
	public void postOrderTraversal(Node node){
		if( node != null ){
			postOrderTraversal(node.left);
			postOrderTraversal(node.right);
			visit(node);
		}
	}
	
	public void BreadthFirstBinaryTreeSearch(Node node){
		MyQueue queue = new MyQueue();
		queue.add(node);
		
		while(!queue.isEmpty()){
			Node r = (Node) queue.remove();
			visit(r);
			if(r.left != null){
				queue.add(r.left);
			}
			if(r.right != null){
				queue.add(r.right);
			}
		}
	}
}
