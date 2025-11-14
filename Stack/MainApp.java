package stackContainer;

public class MainApp {
	
	public static void main(String[] args) 
	{		
		MainApp app = new MainApp();
		
		MyStack obj = MyStack.getObject();
		
		app.insert(10);
		app.insert(20);
		obj.display();
		System.out.println();
		app.delete();
		app.delete();
		obj.display();
		System.out.println();
		app.insert(30);
		obj.display();
		
//		System.out.println(obj);
		
	}
	
	public void insert(int value) 
	{
		MyStack ref = MyStack.getObject();
//		System.out.println(ref.hashCode());
		ref.push(value);
	}
	
	public void delete() 
	{
		MyStack ref = MyStack.getObject();
//		System.out.println(ref.hashCode());
		ref.pop();
	}
	
}
