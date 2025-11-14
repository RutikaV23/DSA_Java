package doubleList;

import java.util.Scanner;

public class DoubleTest {

	public static void main(String[] args) 
	{
		DoubleDemo myddl = new DoubleDemo();
		Scanner sc = new Scanner(System.in);
		
		int choice,ele = 0;
		do 
		{
			System.out.print("--------------------------");
			System.out.println("\n1:Insert at Begining ");
			System.out.println("\n2: Display ");
			System.out.println("\n3:Insert at End");
			System.out.println("\n4:Insert at Given Position");
			System.out.println("\n5:Delete at Begining ");
			System.out.println("\n6:Delete at End");
			System.out.println("\n7:Delete at Given Position");
			System.out.println("\n8:Exit...  ");
			System.out.println("--------------------------");

			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1 :{
				System.out.println("Enter data: ");
					ele = sc.nextInt();
					myddl.insertBeg(ele);
					break;
					}
			
			case 2 :myddl.display();
			break;
			
			case 3 :System.out.println("Enter data: ");
					ele = sc.nextInt();
					myddl.insertEnd(ele);
			break;
			
			case 4 :System.out.println("Enter data: ");
					ele = sc.nextInt();
					System.out.println("Enter position: ");
					int pos = sc.nextInt();
					myddl.insertAtPosition(ele,pos);
			break;
			case 5 :myddl.deletebeg();
	        break;
	        
			case 6 :myddl.deleteEnd();
			break;
	
			case 7 :myddl.deletePos();
			break;
			
			case 8 : System.out.println("Exit...");
			break;
			
			default:System.out.println("Enter valid Choice...");
			}
			
		}while(choice!=8);
	
	}

}
