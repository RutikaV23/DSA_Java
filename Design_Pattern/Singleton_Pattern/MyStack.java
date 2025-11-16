package stackContainer;

public class MyStack 
{
	
	private int top = 0; //for increment and decreament
	private Node[] stack = new Node[10];
	
	static MyStack ref = new MyStack();// single object
	
	private MyStack() 
	{
		
	}
	
	private MyStack(Node[] ref) 
	{
		stack = ref;
	}

	public static MyStack getObject() 
	{
		return ref; //returns ref
	}
	
	public Node[] getStack() 
	{
		return stack;
	}
	
	public void setStack(Node[] stack) 
	{
		this.stack = stack;
	}
	
	public void push(int value) 
	{
		if (top == stack.length) 
		{
		     System.out.println("Stack is Full!");
		     return;
		    
		}
		 
		Node ref = new Node(value);
		stack[top] = ref;
		top++;
	}
	
	public void pop() 
	{
		if(top == 0) 
		{
			System.out.println("Stack is Empty.");
			return;
		}
		
		top--;
		Node deleted = stack[top];
		stack[top] = null;
		
		System.out.println(deleted.getData() + " : is deleted");
	}
	
	public void display() {
        if (top == 0) {
            System.out.println("Stack is Empty!");
            return;
        }

        System.out.println("Stack Elements:");
        for (int i = top - 1; i >= 0; i--) {
            System.out.println(stack[i].getData());
        }
    }
}
