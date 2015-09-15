package Question;

public class Question2_5 {
	
	/*
	 * Cracking the Coding Interview Question 2.5
	 */

	 Node headA;
	 Node headB;
	 Node headR;
	
	
	
	public void SumLists(Node headA, Node headB, Node headR, int maxDigit){
		
		Node A = headA;
		Node B = headB;
		Node R = headR;
		
		for(int i = 0; i < maxDigit; i++){
			R.data = ( (A.data + B.data) % 10 ) + R.data;
			R.next = new Node(0);
			R.next.data = (A.data + B.data) / 10 ;
			
			if( A.next == null ){
				A.addToTail(0);
			}
			if( B.next == null ){
				B.addToTail(0);
			}
			A = A.next;
			B = B.next;
			R = R.next;
		}
	}
	
	private class Node{
		int data;
		Node next;
		
		public Node(){
			this.data = 0;
			this.next = null;
		}
		
		public Node (int data){
			this.data = data;
			this.next = null;
		}
		
		public void addToTail(int data){
			Node end = new Node(data);
			Node n = this;
			while ( n.next != null ){
				n = n.next;
			}
			n.next = end;
		}
		
	}
}
