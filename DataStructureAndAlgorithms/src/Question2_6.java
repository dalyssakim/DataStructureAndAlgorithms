


public class Question2_6 {

	
	public static void main(String[] args){
	
		Node headOrigin = new Node('a');
		headOrigin.addToTail('p');
		headOrigin.addToTail('p');
		headOrigin.addToTail('l');
		headOrigin.addToTail('e');
		
		Node palindNode = new Node('l');
		palindNode.addToTail('e');
		palindNode.addToTail('a');
		palindNode.addToTail('p');
		palindNode.addToTail('p');
		
		System.out.println(isPalindrome(headOrigin, palindNode));
		
	}
	
	public static Node duplicateList(Node head){
		Node secondHead = new Node();
		Node firstHead = head;
		Node headKeep = secondHead;
		while(firstHead != null){
			secondHead.data = firstHead.data;
			secondHead.next = new Node();
			firstHead = firstHead.next;
			secondHead = secondHead.next;
		}
		
		firstHead = head;
		
		while(firstHead != null){
			secondHead.data = firstHead.data;
			secondHead.next = new Node();
			firstHead= firstHead.next;
			secondHead = secondHead.next;
		}
			return headKeep;
	}
	
	public static boolean isPalindrome(Node headOrig, Node headPalindrom){
		Node tempOrig = headOrig;
		Node tempDupl = duplicateList(headPalindrom);
		
		while( tempDupl.next != null ){
			

			System.out.println(tempDupl.data + " - "+ tempOrig.data);
			

			if(tempOrig.next == null) return true;
			
			if(tempOrig.data == tempDupl.data){
				tempOrig = tempOrig.next;
			}else {
				tempOrig = headOrig;
			}
			tempDupl = tempDupl.next;
			
		}
		
		return false;
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
		
	}
}
