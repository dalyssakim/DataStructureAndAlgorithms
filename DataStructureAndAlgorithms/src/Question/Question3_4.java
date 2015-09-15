package Question;
import java.util.NoSuchElementException;

import DataStructures.MyStack;


public class Question3_4 {

	 /*
	  * Cracking the Coding Interview Question 3.4
	  * Queue via Stack
	  */
	private  class QueueViaStack <T>{
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
	
}
