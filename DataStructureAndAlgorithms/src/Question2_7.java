


public class Question2_7 {


	public static void main(String[] args){
	
		Node headOrigin = new Node('a');
		headOrigin.addToTail('p');
		headOrigin.addToTail('p');
		headOrigin.addToTail('l');
		headOrigin.addToTail('e');
		
		Node palindNode = new Node('k');
		palindNode.addToTail('t');
		palindNode.next.next = headOrigin.next;
		}
	
	public static Node Intersection(Node A){
		return null;
	}
	
	
	
	public static class Node{
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
