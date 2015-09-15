package Question;
import java.util.NoSuchElementException;

import DataStructures.MyQueue;


public class Question3_6 {
	
	/*
	 * Cracking the Coding Interview Question 3.6
	 */
	
	String dog = "Dog";
	String cat = "Cat";

	private  class Animal{
		String type;
		String id;
		public Animal(String type, String id){
			this.type = type;
			this.id = id;
		}
	}
	
	private class AnimalShelter{

		MyQueue activeQueue;
		
		public AnimalShelter(){
			activeQueue = new MyQueue();
		}
		
		public void enqueue(Animal item){
			activeQueue.add(item);
		}
		
		public Animal dequeueAny(){
			if( activeQueue.isEmpty() ) throw new NoSuchElementException();
			return (Animal) activeQueue.remove();
		}
		
		private Animal dequeueType(String type){
			MyQueue t = new MyQueue();
			Animal animal = null;
			Animal returnVal = null;
			boolean isFound = false;
			while( !activeQueue.isEmpty() ){
				animal = (Animal)activeQueue.remove();
//				System.out.println(" dequeueType: "+ animal.type + " - "+ animal.id);
				if( isFound == false && animal.type.equalsIgnoreCase(type) ){
					returnVal = animal;
					isFound = true;
				} else {

	//				System.out.println("  Push! dequeueType: "+ animal.type + " - "+ animal.id);
					t.add(animal);
				}
			}
			activeQueue = t;
			return returnVal;
		}
		
		public Animal dequeueDog(){
			return dequeueType("Dog");
		}
		
		public Animal dequeueCat(){
			return dequeueType("Cat");
		}
	}
	

}
