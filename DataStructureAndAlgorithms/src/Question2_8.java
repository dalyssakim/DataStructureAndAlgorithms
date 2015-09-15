

public class Question2_8 {



	public static void main(String[] args){
	
		Node headOrigin = new Node('0');
		headOrigin.addToTail('1');
		headOrigin.addToTail('2');
		headOrigin.addToTail('3');
		headOrigin.addToTail('4');
		headOrigin.addToTail('5');
		headOrigin.addToTail('6');
		headOrigin.addToTail('7');
		
		headOrigin.next.next.next.next.next.next = headOrigin.next.next.next;
		Node loopNode = loopDetection(headOrigin);
		System.out.println(headOrigin.next.next.next.data);
		if(loopNode != null){
			System.out.println(loopNode.data);
		}
		
		}
	
	public static Node loopDetection(Node A){
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
