package DataStructures;

public class MinHeap {
	private static Node []heap = new Node[100];
	private static int size = 0;
	
	
	public static void insert(int data){
		heap[size] = new Node(data);
		int parent_i = 0;
		if( size >= 1){
			if( size%2 == 0 ){
				//even, right child
				parent_i = (size - 2)/2;
				heap[parent_i].right = heap[size];
			}else{
				parent_i = (size - 1)/2;
				heap[parent_i].left = heap[size];
			}
			
		}

		upStructure(size);
		
		size++;
		
	}
	
	public static int remove(){
		int data = heap[0].data;
		heap[0].data = heap[size-1].data;
		size--;
		downStructure(0);
		return data;
	}
	
	private static void upStructure(int current_i){
		int parent_i = -1;
		
		if( current_i <= 0) return;
		
		if( (current_i)%2 == 0 ){
			// even, right node
			parent_i = ((current_i)-2)/2;
		}else {
			// odd
			parent_i = ((current_i)-1)/2;
		}
		if( heap[current_i].data < heap[parent_i].data ){
			int temp = heap[parent_i].data;
			heap[parent_i].data = heap[current_i].data;
			heap[current_i].data = temp;
			
			upStructure(parent_i);
		}
	}
	
	private static void downStructure(int current_i){
		


		if( current_i > size || current_i*2+1 > size || current_i*2+2 > size) return;
		
		int min = findMinOfChild(current_i);
		
		if(heap[min].data < heap[current_i].data){
			int temp = heap[current_i].data;
			heap[current_i].data = heap[min].data;
			heap[min].data = temp;
			
			downStructure(min);
		}
	}
	
	private static int findMinOfChild(int current_i){
		if ( heap[current_i*2+1].data > heap[current_i*2+2].data ) return current_i*2+2;
		else return current_i*2+1;
	}
	
public static void main(String[] args){
		

	insert(4);
	
	

	
	insert(50);


	insert(7);
	
	
	insert(55);
	insert(90);
	insert(87);
	insert(2);
	
	
	for(int i = 0; i < 100; i++ ){
		if(heap[i] != null){
			System.out.println("i = "+ i + " , data = " + heap[i].data);
		}
	}
		
		System.out.println("get Min");
		System.out.println(remove());
		System.out.println(remove());
		System.out.println(remove());
		System.out.println(remove());
		System.out.println(remove());
		System.out.println(remove());
	}
}
