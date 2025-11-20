package graphcontainer;

public class MainGraph {

	public static void main(String[] args) 
	{
	
		Graph graph = new Graph();
		
		Node n1 = new Node(23);
		Node n2 = new Node(45);
		Node n3 = new Node(67);
		Node n4 = new Node(98);
		Node n5 = new Node(11);
		
		graph.insertNode(n1);
		graph.insertNode(n2);
		graph.insertNode(n3);
		graph.insertNode(n4);
		graph.insertNode(n5);

		graph.connectNodes(n1, n2);
		graph.connectNodes(n1, n3);
		graph.connectNodes(n2, n3);
		graph.connectNodes(n5, n4);
		graph.connectNodes(n5, n1);
		graph.connectNodes(n5, n3);

		graph.print();
	}

}
