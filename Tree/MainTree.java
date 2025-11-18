package treesContainer;

public class MainTree {

	public static void main(String[] args) 
	{
		MainTree m1 = new MainTree();
		Treefun t1 = new Treefun();
		
		t1.insert("66");
		t1.insert("21");
		t1.insert("7");
		t1.insert("28");
		t1.insert("35");
		t1.insert("1");
		
		System.out.print("Preorder : ");
		t1.preorder();
		
		System.out.println();
		System.out.print("\n Inorder : ");
		t1.inorder();
		
		System.out.println();
		System.out.print("\n Postorder : ");
		t1.postorder();
		
		
	}

}
