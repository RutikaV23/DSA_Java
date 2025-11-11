package Linklist1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		MyLinkList my = new MyLinkList();
		Scanner sc = new Scanner(System.in);
		int choice,data;
		do 
		{
			System.out.println("\n1:Add \n2:Display \n3:Delete \n4:Exit... ");
			System.out.println("Enter your choice: ");
			choice = sc.nextInt();
			
			switch(choice) 
			{
			case 1 :my.add();
			break;
			
			case 2 : my.display();
			break;
			
			case 3 : my.delete();
			break;
			
			case 4 : System.out.println("Exit...");
			break;
			
			default:System.out.println("Enter valid Choice...");
			}
			
		}while(true);
	}

}
