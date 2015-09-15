package TestCases;
import DataStructures.BinaryTreeTraversal;
import DataStructures.DeapthFirstSearch;
import DataStructures.GraphNode;
import DataStructures.Node;
import Question.Question4_1;
import Question.Question4_2;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GraphNode []node = new GraphNode[10];
		
		for(int i = 0; i < node.length; i++){
			node[i] = new GraphNode("Node-"+i);
		}
		node[0].addEdge(node[1]);
		node[1].addEdge(node[2]);
		node[1].addEdge(node[3]);
		node[3].addEdge(node[4]);
		node[4].addEdge(node[2]);
		node[2].addEdge(node[5]);
		
		DeapthFirstSearch dfs = new DeapthFirstSearch();
		
	//	dfs.search(node[0]);
		
		System.out.println("-------------");
		Question4_1 q4_1 = new Question4_1();
		System.out.println(q4_1.findRouteBetweenNodes(node[0], node[3])+" - node0 vs 3");
		System.out.println(q4_1.findRouteBetweenNodes(node[0], node[9])+" - node0 vs 9");
		
		
		Node []treeNode = new Node[10];
		
		for(int i = 0; i < treeNode.length; i++){
			treeNode[i] = new Node(i);   
		}
		  
		Question4_2 q4_2 = new Question4_2();
		Node newRoot  = new Node(-1);
		q4_2.MinimalTree(treeNode, newRoot, 0, treeNode.length-1);
		BinaryTreeTraversal traverse = new BinaryTreeTraversal();
		traverse.BreadthFirstBinaryTreeSearch(newRoot);
	}

}
