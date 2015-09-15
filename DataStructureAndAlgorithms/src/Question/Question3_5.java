package Question;
import java.util.EmptyStackException;

import DataStructures.MyStack;


public class Question3_5 {
	
	/*
	 * Cracking the Coding Interview Question 3.5
	 */
	
	public class SortStack<T>{
		private MyStack stack;
		private MyStack temp;
		
		public SortStack(){
			stack = new MyStack();
			temp = new MyStack();
		}
		
		public void push(int item){
			if( stack.isEmpty() ){
				stack.push(item);
			} else {
				
			while( !stack.isEmpty() && (int)stack.peek() > item){
					temp.push(stack.pop());
			}
			
			stack.push(item);
			
			while( !temp.isEmpty() ){
				stack.push(temp.pop());
			}
			}
		}
		
		public T remove(){
			if(stack.isEmpty()) throw new EmptyStackException();
			return (T)stack.pop();
		}
		
		public boolean isEmpty(){
			return stack.isEmpty();
		}
	}
	

}
