package treesContainer;

public class Treefun 
{
	Node root;
	
	public void insert(String value) 
	{
		root = insertValue(root,value);
	}
	
	public Node insertValue(Node root,String value) 
	{
		if(root == null) 
		{
			root = new Node(value);
			return root;
		}
		
		if(value.compareTo(root.data) > 0) 
		{
			root.right = insertValue(root.right,value);
		}
		
		else if(value.compareTo(root.data) < 0) 
		{
			root.left = insertValue(root.left,value);
		}
		
		return root;
		
	}

	public void inorder() 
	{
		inorderTree(root);
	}
	void inorderTree(Node root) 
	{
		if(root != null ) 
		{
			inorderTree(root.left);
			System.out.print(root.data + "\t");
			inorderTree(root.right);
		}
	}
	
	public void preorder() 
	{
		preorderTree(root);
	}
	void preorderTree(Node root) 
	{
		if(root != null ) 
		{
			System.out.print(root.data + "\t");
			preorderTree(root.left);
			preorderTree(root.right);
		}
	}
	
	public void postorder() 
	{
		postorderTree(root);
	}
	void postorderTree(Node root) 
	{
		if(root != null ) 
		{
			postorderTree(root.left);
			postorderTree(root.right);
			System.out.print(root.data + "\t");
		}
	}
}
