package Question;

import DataStructures.BinarySearchTree;
import DataStructures.Node;

public class Question4_2 {
	
	public void MinimalTree(Node []node, Node root, int low, int up){
		BinarySearchTree BST = new BinarySearchTree();
		if(low == up){
			System.out.println(node[low].data+ " low "+ low +"/ up "+ up);
			BST.insert(root, node[low].data);
		} else if( low > up ) {} else {
			int mid = (low + up+1)/2;
			System.out.println(node[low].data+ "ELSE  low "+ low +"/ up "+ up);
			BST.insert(root, node[mid].data);
			int leftLow = low;
			int leftUp = mid-1;
			int rightLow = mid+1;
			int rightUp = up;
			MinimalTree(node, root, leftLow, leftUp);
			MinimalTree(node, root, rightLow, rightUp);
		}
		
	}
}
