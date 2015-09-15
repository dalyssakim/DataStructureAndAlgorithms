
public class Question2_5 {

	static Node headA;
	static Node headB;
	static Node headR;
	
	public static void main(String[] args){
	
		headA = new Node(7);
		headB = new Node(5);
		headR = new Node(0);
		
		headA.addToTail(1);
		headA.addToTail(6);
		headB.addToTail(9);
		headB.addToTail(2);
		
		SumLists(headA, headB, headR, 3);
		Node Result = headR;
		while(Result.next != null){
			System.out.print(Result.data + "-");
			Result = Result.next;
		}
		System.out.println("");
		
	}
	
	public static void SumLists(Node headA, Node headB, Node headR, int maxDigit){
		
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
	
	public static class Node{
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
