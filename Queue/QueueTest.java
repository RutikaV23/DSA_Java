package queueContainer;

public class QueueTest {

	public static void main(String[] args) 
	{
		QueueTest obj = new QueueTest();
		
		MyQueue q1 = MyQueue.getObject();
		
		obj.insert(23);
		obj.insert(34);
		q1.display();
		System.out.println();
		obj.delete();
		obj.delete();
		q1.display();
		System.out.println();
		obj.insert(78);
		q1.display();
	}
	
	
	public void insert(int value) 
		{
		    MyQueue ref = MyQueue .getObject();
//			System.out.println(ref.hashCode());
			ref.addQueue(value);
		}
	
	public void delete() 
	{
	    MyQueue ref = MyQueue .getObject();
//		System.out.println(ref.hashCode());
		ref.delQueue();
	}
	

}
