import java.util.NoSuchElementException;

import DataStructures.MyStack;


public class Question3_4 {

	 /*
	  * Queue via Stack
	  */
	private static class QueueViaStack <T>{
		private MyStack pushStack;
		private MyStack popStack;
		
		public QueueViaStack(){
			pushStack = new MyStack();
			popStack = new MyStack();
		}
		
		public void add(T data){
			pushStack.push(data);
		}
		
		public T remove(){
			if( popStack.isEmpty() ){
				if( pushStack.isEmpty() ){
					throw new NoSuchElementException();
				}else {
					while(!pushStack.isEmpty()){
					popStack.push(pushStack.pop());
					}
				}
			}
			
			return (T) popStack.pop();
		}
	}
	
	public static void main(String[] args){
		
			QueueViaStack queue = new QueueViaStack();
			queue.add(1);
			queue.add(2);
			queue.add(3);
			System.out.println(queue.remove());
			queue.add(4);
			queue.add(5);
			queue.add(6);
			System.out.println(queue.remove());
			queue.add(7);
			
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			queue.add(8);
			queue.add(9);
			System.out.println(queue.remove());
			System.out.println(queue.remove());
			
			
		
		}
}
