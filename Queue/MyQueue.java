package queueContainer;

public class MyQueue 
{
	private int head = 0;
	private int tail = 0; //for increment and decreament
	private Node[] queue = new Node[10];
	
	private static MyQueue ref = new MyQueue();//object

//constructors
	private MyQueue()
	{
		
	}
	
	private MyQueue(Node[] ref)
	{
		queue = ref;
	}
	
	//getters and setters
	public Node[] getQueue() {
		return queue;
	}

	public void setQueue(Node[] queue) {
		this.queue = queue;
	}
	
	//function
	public static MyQueue getObject() 
	{
		return ref; //returns ref
	}

	public void addQueue(int value) 
	{
		if (tail == queue.length) {
            System.out.println("Queue is Full!");
            return;
        }

        Node ref = new Node(value);
        queue[tail] = ref;
        tail++;
	}
	
	public void delQueue() 
	{
		if (tail == head) {
            System.out.println("Queue is Empty!");
            return;
        }
		
		Node deleted = queue[head];
		queue[head] = null;
		head++;
		
		System.out.println("Deleted: " + deleted.getData());
        
	}
	
	public void display() {
        if (head == tail) {
            System.out.println("Queue is Empty!");
            return;
        }

        System.out.println("Queue Elements:");
        for (int i = head; i < tail; i++) {
            System.out.println(queue[i].getData());
        }
    }	
	
}
