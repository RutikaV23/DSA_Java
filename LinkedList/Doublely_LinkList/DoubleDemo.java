package doubleList;

import java.util.Scanner;

public class DoubleDemo 
{
	
	Node end,start;
	static int count=0;
	
	//insert at Beginning
	public void insertBeg(int ele) 
	{
		Node temp = new Node(ele);
		
		if(this.start == null) 
		
			start = end = temp;
		
		else 
		{
			temp.next = start;
			start.pre = temp;
			start = temp;
		}
		count++;
		System.out.println("------Node added at beginning. ---------");
	}
	
	//insert at End
	public void insertEnd(int ele) 
	{
		Node temp = new Node(ele);
		if(start == null) 
		{
			start = end = temp ;
		}
		else 
		{
			temp.pre = end;
			end.next = temp;
			end = temp;
		}
		count++;
		System.out.println("---------nodes added at end---------");

	} 
	
	//insert at at given position
	public void insertAtPosition(int ele,int pos) 
	{
		if(pos < 0 || pos > count+1) 
		{
            System.out.println("***Invalid position!***");
            System.out.println();
            return;
        }
	
		if(pos == 1) 
		{
			insertBeg(ele);
			return;
		}
		
		if(pos == count + 1) 
		{
			insertEnd(ele);
			return;
		}
		
		Node temp = new Node(ele);
		Node itr = start;
		
		for (int i = 1; i < pos - 1; i++) {
            itr = itr.next;
        }

        temp.next = itr.next;
        temp.pre = itr;
        itr.next.pre = temp;
        itr.next = temp;

        count++;
        System.out.println("Node inserted at position ");
        System.out.println();
			
	}
	
//delete node from beginning
public void deletebeg() 
{
	if(start == null) 
	{
        System.out.println("List is empty!");
        System.out.println();
        return;
    }
	
	if (start == end) {
        start = end = null;
    } else {
        start = start.next;
        start.pre = null;
    }
	
	count--;
    System.out.println("Node deleted from beginning.");
    System.out.println();
} 

//delete node from end
public void deleteEnd() 
{
	if(start == null) 
	{
        System.out.println("List is empty!");
        System.out.println();
        return;
    }
	
	if (start.next == null) {
        start = end = null;
        System.out.println("Node deleted from end.");
        System.out.println();
        return;
    }
	
	Node temp = start;
	
        end = end.pre;
        end.next = null;
        temp.pre = null;
        
        count--;
    System.out.println(" Node deleted at End");
    System.out.println();

}

//delete node from at given position

public void deletePos() 
{
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter position: ");
	System.out.println();
	int pos = sc.nextInt();
	
	if(start == null) 
	{
        System.out.println("List is empty!");
        System.out.println();
		return;
	}
	
	if(pos <= 0 || pos > count)
		return;
	
	if(pos == 1) 
	{
		deletebeg();
		return;
	}
	
	if(pos == count) 
	{
		deleteEnd();
	    System.out.println(" Node deleted at position : " + pos);
	    System.out.println();
		return;
	}
	
	Node itr;
	if(pos<=count/2) 
	{
		itr = start;
		for(int i=1;i<pos-1;i++) 
		{
			itr = itr.next;
		}
	}
	else 
	{
		itr = end;
		for(int i=count;i>pos-1;i--) 
		{
			itr = itr.pre;
		}
	}
	
	itr.next = itr.next.next;
	itr.next.pre = itr;
	
	count--;
    System.out.println(" ----Node deleted at position : " + pos);
    System.out.println();
}
	
	//display function
	public void display() 
	{
		if(start == null)
		{
			System.out.println("---------No nodes to Display---------");
			System.out.println();
		}
		else 
		{
			Node itr = start;
			
			while(itr.next!= null) 
			{
                System.out.print("|" + itr.getData() + " | <--> | ");
                itr = itr.next;
			}
			System.out.print(itr.getData() + " | <--> | Null |");
			System.out.println();
		}
	}

}
