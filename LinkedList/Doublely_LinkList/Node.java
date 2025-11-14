package doubleList;

public class Node 
{
	int data;
    Node pre,next;
	
	public Node() 
	{
		
		this.data = 0;
		this.pre = pre;
		this.next = next;
	}
	
	public Node(int data) {
		
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getPre() {
		return pre;
	}

	public void setPre(Node pre) {
		this.pre = pre;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
}
