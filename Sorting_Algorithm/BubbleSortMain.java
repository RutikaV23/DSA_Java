package bubbleSort;

import java.util.Scanner;

public class BubbleSortMain {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int size;
		System.out.println("Enter the size of array: ");
		size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter " + size + " elements : ");
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print("arr[" + i + "] = ");
			arr[i]=sc.nextInt();
		}
		
		System.out.print("\nArray Elements are Before Sorting: ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print("\t" + arr[i]);
		}
		
		bubbleSort(arr);
		
		System.out.print("\nArray Elements are After Sorting: ");
		for(int i=0;i<arr.length;i++) 
		{
			System.out.print("\t" + arr[i]);
		}
	}
	
	public static void bubbleSort(int[]arr) 
	{
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-1-1;j++) 
			{
				if(arr[j]<arr[j+1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;	
				}
			}
		}
	}
	
}
