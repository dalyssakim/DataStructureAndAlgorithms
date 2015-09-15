import java.util.NoSuchElementException;

import DataStructures.MyQueue;


public class Question3_6 {
	
	String dog = "Dog";
	String cat = "Cat";

	private static class Animal{
		String type;
		String id;
		public Animal(String type, String id){
			this.type = type;
			this.id = id;
		}
	}
	
	private static class AnimalShelter{

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
	

	public static void main(String[] args){
		
		AnimalShelter shelter = new AnimalShelter();
		Animal dog1 = new Animal("Dog", "1");
		Animal dog2 = new Animal("Dog", "2");
		Animal dog3 = new Animal("Dog", "3");
		Animal dog4 = new Animal("Dog", "4");
		Animal dog5 = new Animal("Dog", "5");
		Animal dog6 = new Animal("Dog", "6");
		
		Animal cat1 = new Animal("Cat", "1");
		Animal cat2 = new Animal("Cat", "2");
		Animal cat3 = new Animal("Cat", "3");
		Animal cat4 = new Animal("Cat", "4");

		shelter.enqueue(dog1);
		shelter.enqueue(dog2);
		shelter.enqueue(dog3);
		shelter.enqueue(cat1);
		shelter.enqueue(cat2);
		shelter.enqueue(dog4);
		shelter.enqueue(cat3);
		shelter.enqueue(dog5);
		shelter.enqueue(dog6);
		shelter.enqueue(cat4);

		Animal temp = shelter.dequeueAny();
		System.out.println(temp.type +  "-" + temp.id );
		temp = shelter.dequeueCat();
		System.out.println(temp.type +  "-" + temp.id );
		temp = shelter.dequeueDog();
		System.out.println(temp.type +  "-" + temp.id );
		temp = shelter.dequeueCat();
		System.out.println(temp.type +  "-" + temp.id );
		temp = shelter.dequeueDog();
		System.out.println(temp.type +  "-" + temp.id );
		temp = shelter.dequeueDog();
		System.out.println(temp.type +  "-" + temp.id );
		temp = shelter.dequeueDog();
		System.out.println(temp.type +  "-" + temp.id );
	
	}
}
