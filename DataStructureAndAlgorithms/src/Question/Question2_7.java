package Question;



public class Question2_7 {
	
	/*
	 * Cracking the Coding Interview Question 2.7
	 */

	public Node Intersection(Node A){
		return null;
	}
	
	
	
	public class Node{
		char data;
		Node next;
		
		public Node(){
			this.data = 0;
			this.next = null;
		}
		
		public Node (char data){
			this.data = data;
			this.next = null;
		}
		
		public void addToTail(char data){
			Node end = new Node(data);
			Node n = this;
			while ( n.next != null ){
				n = n.next;
			}
			n.next = end;
		}
	
		public Node addToHead(Node node){
			Node n = this;
			node.next = n;
			return node;
		}
	}
	
}
