package graphcontainer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph 
{
//	List<Node> adjList = new ArrayList();
	
	HashMap<Node,List<Node>> adjList ;
	
	public Graph() 
	{
		adjList = new HashMap();
	}

	public HashMap<Node,List<Node>> getAdjList() 
	{
		return adjList;
	}

	public void setAdjList(HashMap<Node,List<Node>> adjList) 
	{
		this.adjList = adjList;
	}

	//Insert the node
	public void insertNode(Node data) 
	{
		adjList.put(data,new ArrayList()); 
	}
	
	//connect the nodes
	void connectNodes(Node n1,Node n2) 
	{
		List<Node> temp = adjList.get(n1);
		if (temp != null) 
        {
            temp.add(n2);
        }
	}
	
	//Print the node
	public void print() 
	{
		for(Node current:adjList.keySet()) 
		{
			System.out.print(current.data + " -> ");
			List<Node> temp = adjList.get(current);

			for (Node child : temp) 
            {
                System.out.print(child.data + " ");
            }
            System.out.println();
		}
	}
}
