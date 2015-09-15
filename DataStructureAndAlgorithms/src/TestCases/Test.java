package TestCases;
import DataStructures.DeapthFirstSearch;
import DataStructures.GraphNode;
import Question.Question4_1;


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
		
	}

}
