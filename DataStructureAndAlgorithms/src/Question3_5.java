import java.util.EmptyStackException;

import DataStructures.MyStack;


public class Question3_5 {
	
	public static class SortStack<T>{
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
	

	public static void main(String[] args){
		
			SortStack sortStack = new SortStack();

			sortStack.push(1);
			sortStack.push(2);
			sortStack.push(5);
			sortStack.push(4);
			sortStack.push(3);
			sortStack.push(15);
			sortStack.push(6);
			sortStack.push(2);
			sortStack.push(9);
			sortStack.push(65);
			sortStack.push(10);
			
			while( !sortStack.isEmpty() ){
			System.out.println((int)sortStack.remove());
			}
		
		}

}
