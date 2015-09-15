package Question;


public class Question2_8 {

	/*
	 * Cracking the Coding Interview Question 2.8
	 */

	
	public Node loopDetection(Node A){
		Node slowNode = A;
		Node fastNode = A;
		
		do{

			if(fastNode.next == null || fastNode.next.next == null ){ return null; }
			

			fastNode = fastNode.next.next;
			slowNode = slowNode.next;
		}while( fastNode != slowNode );
		
		System.out.println(fastNode.data + " fast ");
		System.out.println(slowNode.data + " slow ");
		
		slowNode = A;
		
		while( slowNode != fastNode ){
			slowNode = slowNode.next;
			fastNode = fastNode.next;
		}
		
		return fastNode;
	}
	
	
	
	private class Node{
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
